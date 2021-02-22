/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * contains the main functions that deal with the cryptographic side.
 * @author guyweissenberg
 */
public final class Utilities {
    /**
     * finds prime number, with bitLength size in bites.
     * @param bitLength length of the prime factors in bits
     * @param rounds in Miller-Rabin algorithm
     * @return 
     */
    public static BigInteger findPrime(int bitLength, int rounds) {
        BigInteger a=null;
        boolean res=false;
        while(!res){ // if a number passed the Miller Rabin test, retun that number
            a=new BigInteger(bitLength,new Random());
            if(!a.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) && !a.equals(BigInteger.ONE)){
                res=MillerRabinTest(a,rounds); // Check with Miller Rabin algorithm 1000 times. 
            }
        }
        return a;
    }  
    /**
     * finds relative prime number to a given prime number fi.
     * @param fi Euler function of n
     * @param len size of the number in bits
     * @param rounds in Miller-Rabin algorithm
     * @return 
     */
    public static BigInteger findRelativePrime(BigInteger fi,int len, int rounds){
        BigInteger a;
        if(len==0)
           a=findPrime(fi.bitLength(),rounds);
        else
            a=findPrime(len,rounds);
        int count=fi.bitLength();
        while((a.compareTo(fi)>=0 || a.equals(BigInteger.ONE) || a.equals(BigInteger.ZERO) || !a.gcd(fi).equals(BigInteger.ONE)) && count>0){
            if(len==0)
                a=findPrime(fi.bitLength(),rounds);
            else
                a=findPrime(len,rounds);
            count-=1;
        }
        if(count==0)
            return null;
        return a;
    }
    /**
     * performs the Miller Rabin test.
     * @param n modulus
     * @param rounds in Miller-Rabin algorithm
     * @return 
     */
    public static boolean MillerRabinTest(BigInteger n, int rounds) {
        BigInteger m,k;
        k=BigInteger.ONE;
        m=n.subtract(BigInteger.ONE);
        BigInteger check=m.mod(BigInteger.valueOf(2));
        while(check.equals(BigInteger.ZERO)){
            m=m.divide(BigInteger.valueOf(2));
            k=k.add(BigInteger.ONE);
            check=m.mod(BigInteger.valueOf(2));
        }
        for (int i = 0; i < rounds; i++) {
            if(!isPrime(n,k,m)){
                return false;
            }
        }
        return true;
    }
    /**
     * finds if n is prime where n-1=m*2^k.
     * @param n modulus
     * @param k n-1=m*2^k
     * @param m n-1=m*2^k
     * @return 
     */
    private static boolean isPrime(BigInteger n, BigInteger k, BigInteger m) {
        BigInteger a=new BigInteger(n.bitLength(),new Random());
        while(a.compareTo(n)>0 || a.equals(n) || a.equals(BigInteger.ONE) || a.equals(BigInteger.ZERO)){
            a=new BigInteger(n.bitLength(),new Random());
        }
        BigInteger b=a.modPow(m, n);
        if(b.equals(BigInteger.ONE))
            return true;
        else{
            for (BigInteger i = BigInteger.ONE; i.compareTo(k)<=0; i=i.add(BigInteger.ONE)) {
                if(b.add(BigInteger.ONE).equals(n))
                    return true;
                b=b.modPow(BigInteger.valueOf(2), n);
            }
        }
        return false;
    }
    /**
     * factor the RSA modulus using the encryption and decryption key. 
     * @param n modulus
     * @param e encryption power
     * @param d decryption power
     * @param rounds rounds in Miller-Rabin algorithm
     * @return 
     */    
    public static BigInteger RSAFactor(BigInteger n, BigInteger e, BigInteger d, long rounds){
        for(long i=0; i<rounds; i++){ // repeats the check 1000 times. 
            BigInteger r,s;
            s=BigInteger.ZERO;
            r=(e.multiply(d)).subtract(BigInteger.ONE);
            BigInteger check=r.mod(BigInteger.valueOf(2));
            while(check.equals(BigInteger.ZERO)){
                r=r.divide(BigInteger.valueOf(2));
                s=s.add(BigInteger.ONE);
                check=r.mod(BigInteger.valueOf(2));
            }
            BigInteger w=new BigInteger(n.bitLength(), new Random());
            while(w.compareTo(n)>=0)
                w=new BigInteger(n.bitLength(),new Random());
            BigInteger x=w.gcd(n);
            if(x.compareTo(x)<0 && x.compareTo(BigInteger.ONE)>0)
                return x;
            BigInteger v=w.modPow(r, n);
            BigInteger v0=null;
            while(!(v.mod(n).equals(BigInteger.ONE))){
                v0=v;
                if(v.multiply(v).mod(n).equals(v)) // if this happens, the loop will stuck
                    break;
                v=v.multiply(v).mod(n);
            }
            if(!(v0==null || v0.equals(n.subtract(BigInteger.ONE)))){
                x=(v0.add(BigInteger.ONE)).gcd(n);
                return x;
            }
        }
        return null;
    }
    /**
     * returns the coefficients of in the algorithm.
     * @param a given number
     * @param b given number
     * @return 
     */
    public static Map<BigInteger,BigInteger> EuclideanAlgorithm(BigInteger a, BigInteger b){
        Map<BigInteger,BigInteger> map=new HashMap<>();
        Map<BigInteger,BigInteger> ret=new HashMap<>();
        map.put(BigInteger.ZERO, a);
        map.put(BigInteger.ONE, b);
        BigInteger m=BigInteger.ONE;
        ret.put(BigInteger.ONE,BigInteger.ZERO);
        m.add(BigInteger.ONE);
        while(!(map.get(m).equals(BigInteger.ZERO))){
            BigInteger qm=((BigInteger)map.get(m.subtract(BigInteger.ONE))).divide((BigInteger)map.get(m));
            map.put(m.add(BigInteger.ONE),((BigInteger)(map.get(m.subtract(BigInteger.ONE)))).subtract(qm.multiply((BigInteger)map.get(m))));
            ret.put(m, qm);
            m=m.add(BigInteger.ONE);
        }
        map.remove(m);
        return ret;
    }
    /**
     * finds decryption key using modulus and encryption key.
     * @param n modulus
     * @param b encryption power
     * @return 
     */
    public static BigInteger WienerAlgorithm(BigInteger n,BigInteger b){
        Map<BigInteger,BigInteger> q=EuclideanAlgorithm(n, b);
        Map<BigInteger,BigInteger> c=new HashMap<>();
        c.put(BigInteger.ZERO,BigInteger.ONE);
        c.put(BigInteger.ONE, q.get(BigInteger.ONE));
        Map<BigInteger,BigInteger> d=new HashMap<>();
        d.put(BigInteger.ZERO,BigInteger.ZERO);
        d.put(BigInteger.ONE, BigInteger.ONE);
        for (BigInteger j = BigInteger.valueOf(2); q.containsKey(j); j=j.add(BigInteger.ONE)) {
            BigInteger qj=(BigInteger)q.get(j);
            c.put(j,qj.multiply((BigInteger)c.get(j.subtract(BigInteger.ONE))).add((BigInteger)c.get(j.subtract(BigInteger.valueOf(2)))));
            d.put(j,qj.multiply((BigInteger)d.get(j.subtract(BigInteger.ONE))).add((BigInteger)d.get(j.subtract(BigInteger.valueOf(2)))));
            if(isDivisible((((BigInteger)c.get(j)).multiply(b)).subtract(BigInteger.ONE), (BigInteger)d.get(j))){
                BigInteger nt=((((BigInteger)c.get(j)).multiply(b)).subtract(BigInteger.ONE)).divide((BigInteger)d.get(j));
                BigInteger a1=BigInteger.ONE;
                BigInteger b1=BigInteger.ZERO.subtract(n.subtract(nt).add(BigInteger.ONE));
                BigInteger c1=n;
                BigInteger delta=(b1.pow(2)).subtract(BigInteger.valueOf(4).multiply(a1).multiply(c1));
                if(delta.compareTo(BigInteger.ZERO)>0){ // the equation has solution
                    BigInteger root=sqrt(delta);
                    if(root.multiply(root).equals(delta)){ // intger square root
                        BigInteger p=BigInteger.ZERO.subtract(b1).add(root);
                        if(isDivisible(p, BigInteger.valueOf(2).multiply(a1))){
                            p=p.divide(BigInteger.valueOf(2).multiply(a1));
                            BigInteger q2=BigInteger.ZERO.subtract(b1).subtract(root);
                            if(isDivisible(q2, BigInteger.valueOf(2).multiply(a1))){
                                q2=q2.divide(BigInteger.valueOf(2).multiply(a1));
                                if(q2.compareTo(n)<0 && !q2.equals(BigInteger.ZERO)
                                        && p.compareTo(n)<0 && !p.equals(BigInteger.ZERO)) // both roots of the equation are positive integers
                                    return p;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    /**
     * returns true if a is divisible by b.
     * @param a given number
     * @param b given number
     * @return 
     */
    private static boolean isDivisible(BigInteger a,BigInteger b){
        return a.mod(b).equals(BigInteger.ZERO);
    }
    /**
     * returns the factoring is all the prime factors of n-1 are smaller than B.
     * @param n modulus
     * @param B limit for the prime factors of p-1
     * @return 
     */
    public static BigInteger PolardFactoring(BigInteger n,BigInteger B){
        BigInteger a=BigInteger.valueOf(2);
        BigInteger j=BigInteger.valueOf(2);
        for(; j.compareTo(B)<0 && !a.modPow(j, n).equals(BigInteger.ONE); j=j.add(BigInteger.ONE)){
            a=a.modPow(j, n);
        }
        BigInteger d=(a.subtract(BigInteger.ONE)).gcd(n);
        if(!d.equals(BigInteger.ONE) && !d.equals(n))
            return d;
        return null;
    } 
    /**
     * returns the decryption power given the factors of the modulus and the encryption power.
     * @param e encryption power
     * @param p modulus factor
     * @param q modulus factor
     * @return 
     */
    public static BigInteger computeDecryption(BigInteger e, BigInteger p, BigInteger q){
        return (e.modInverse((p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE))));
    } 
    /**
     * returns the square root of a number. 
     * @param x the number whose square root is needed
     * @return 
     */
    private static BigInteger sqrt(BigInteger x) {
        BigInteger div=BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2=div;
        while(true){
            BigInteger y=div.add(x.divide(div)).shiftRight(1);
            if(y.equals(div) || y.equals(div2))
                return y;
            div2=div;
            div=y;
        }
    }
    /**
     * returns true if the input i is not 0 or 1. 
     * @param i number entered by the user.
     * @return 
     */
    public static boolean checkInput(BigInteger i){
        return !i.equals(BigInteger.ZERO) && !i.equals(BigInteger.ONE);
    }
}
