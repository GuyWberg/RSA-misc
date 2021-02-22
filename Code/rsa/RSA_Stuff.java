package rsa;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author guyweissenberg
 */
public class RSA_Stuff extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public RSA_Stuff() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * (Generated automatically by NetBeans IDE when building the UI).  
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainTabsPanel = new javax.swing.JTabbedPane();
        RSAGenerator = new javax.swing.JPanel();
        GeneratorTitle = new javax.swing.JLabel();
        sizeText = new javax.swing.JLabel();
        sizeValue = new javax.swing.JTextField();
        generateParameters = new javax.swing.JButton();
        dValue = new javax.swing.JTextField();
        dText = new javax.swing.JLabel();
        eText = new javax.swing.JLabel();
        eValue = new javax.swing.JTextField();
        nValue = new javax.swing.JTextField();
        nText = new javax.swing.JLabel();
        pText = new javax.swing.JLabel();
        pValue = new javax.swing.JTextField();
        qText = new javax.swing.JLabel();
        qValue = new javax.swing.JTextField();
        cyclesMillerRabinText = new javax.swing.JLabel();
        cyclesMillerRabinValue = new javax.swing.JTextField();
        dSizeValue = new javax.swing.JTextField();
        dSizeText = new javax.swing.JLabel();
        explained1 = new javax.swing.JLabel();
        EncryptionDecryption = new javax.swing.JPanel();
        fEncValue = new javax.swing.JTextField();
        fEncText = new javax.swing.JLabel();
        nEncText = new javax.swing.JLabel();
        nEncValue = new javax.swing.JTextField();
        eEncValue = new javax.swing.JTextField();
        eEncText = new javax.swing.JLabel();
        EncTitle = new javax.swing.JLabel();
        Encrypt = new javax.swing.JButton();
        Decrypt = new javax.swing.JButton();
        fDecValue = new javax.swing.JTextField();
        fDecText = new javax.swing.JLabel();
        nDecText = new javax.swing.JLabel();
        nDecValue = new javax.swing.JTextField();
        dDecValue = new javax.swing.JTextField();
        dDecText = new javax.swing.JLabel();
        sep12 = new javax.swing.JSeparator();
        DecTitle = new javax.swing.JLabel();
        RSAFactoring = new javax.swing.JPanel();
        eFactoringText = new javax.swing.JLabel();
        eFactoringValue = new javax.swing.JTextField();
        dFactoringText = new javax.swing.JLabel();
        dFactoringValue = new javax.swing.JTextField();
        nFactoringText = new javax.swing.JLabel();
        nFactoringValue = new javax.swing.JTextField();
        pFactoringText = new javax.swing.JLabel();
        pFactoringValue = new javax.swing.JTextField();
        qFactoringValue = new javax.swing.JTextField();
        qFactoringText = new javax.swing.JLabel();
        FactoringTitle = new javax.swing.JLabel();
        FactoringParameters = new javax.swing.JButton();
        cyclesFactoringText = new javax.swing.JLabel();
        cyclesFactoringValue = new javax.swing.JTextField();
        explained2 = new javax.swing.JLabel();
        sep13 = new javax.swing.JSeparator();
        WinerAlgorithm = new javax.swing.JPanel();
        WienerTitle = new javax.swing.JLabel();
        eWienerText = new javax.swing.JLabel();
        eWienerValue = new javax.swing.JTextField();
        nWienerText = new javax.swing.JLabel();
        nWienerValue = new javax.swing.JTextField();
        qWienerText = new javax.swing.JLabel();
        qWienerValue = new javax.swing.JTextField();
        pWienerValue = new javax.swing.JTextField();
        pWienerText = new javax.swing.JLabel();
        WienerFactor = new javax.swing.JButton();
        explained3 = new javax.swing.JLabel();
        sep11 = new javax.swing.JSeparator();
        PolardFactoring = new javax.swing.JPanel();
        nPolardText = new javax.swing.JLabel();
        nPolardValue = new javax.swing.JTextField();
        sep10 = new javax.swing.JSeparator();
        qPolardText = new javax.swing.JLabel();
        qPolardValue = new javax.swing.JTextField();
        pPolardValue = new javax.swing.JTextField();
        qPollardText = new javax.swing.JLabel();
        PolardTitle = new javax.swing.JLabel();
        PolardFactor = new javax.swing.JButton();
        bText = new javax.swing.JLabel();
        bValue = new javax.swing.JTextField();
        explained4 = new javax.swing.JLabel();
        PrimalityTest = new javax.swing.JPanel();
        cyclesMillerRabinText1 = new javax.swing.JLabel();
        cyclesMillerRabinValue1 = new javax.swing.JTextField();
        PrimalityTestTitle = new javax.swing.JLabel();
        numberCheckValue = new javax.swing.JTextField();
        numberCheckText = new javax.swing.JLabel();
        Check = new javax.swing.JButton();
        ComputeDecryption = new javax.swing.JPanel();
        eComputeDecText = new javax.swing.JLabel();
        eComputeDecValue = new javax.swing.JTextField();
        pComputeDecText = new javax.swing.JLabel();
        pComputeDecValue = new javax.swing.JTextField();
        qComputeDecText = new javax.swing.JLabel();
        qComputeDecValue = new javax.swing.JTextField();
        dComputeDecText = new javax.swing.JLabel();
        dComputeDecValue = new javax.swing.JTextField();
        ComputeDecryptionTitle = new javax.swing.JLabel();
        Compute = new javax.swing.JButton();
        sep15 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RSA Stuff");
        setResizable(false);

        GeneratorTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        GeneratorTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GeneratorTitle.setText("RSA Parameters Generator");

        sizeText.setText("Size (Bits):");

        generateParameters.setText("Generate");
        generateParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateParametersActionPerformed(evt);
            }
        });

        dText.setText("Decryption Power:");

        eText.setText("Encryption Power:");

        nText.setText("Modulus:");

        pText.setText("Prime Factor #1:");

        qText.setText("Prime Factor #2:");

        cyclesMillerRabinText.setText("Cycles (Miller-Rabin):");

        dSizeText.setText("d Size (Bits):");

        explained1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        explained1.setText("Press the Generate button to generate parameters. You can add your specifications for the parameters.");

        javax.swing.GroupLayout RSAGeneratorLayout = new javax.swing.GroupLayout(RSAGenerator);
        RSAGenerator.setLayout(RSAGeneratorLayout);
        RSAGeneratorLayout.setHorizontalGroup(
            RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RSAGeneratorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RSAGeneratorLayout.createSequentialGroup()
                        .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qText)
                            .addComponent(pText)
                            .addComponent(dText)
                            .addComponent(nText)
                            .addComponent(eText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                            .addComponent(nValue, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qValue)
                            .addComponent(eValue)
                            .addComponent(pValue))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RSAGeneratorLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(generateParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))))
            .addComponent(explained1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GeneratorTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RSAGeneratorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(dSizeText)
                .addGap(4, 4, 4)
                .addComponent(dSizeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sizeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cyclesMillerRabinText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cyclesMillerRabinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RSAGeneratorLayout.setVerticalGroup(
            RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RSAGeneratorLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(GeneratorTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explained1)
                .addGap(8, 8, 8)
                .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cyclesMillerRabinText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cyclesMillerRabinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sizeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dSizeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pText)
                    .addComponent(pValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eText)
                    .addComponent(eValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dText)
                    .addComponent(dValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nText))
                .addGap(18, 18, 18)
                .addComponent(generateParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        MainTabsPanel.addTab("RSA Generator", RSAGenerator);

        fEncText.setText("File Address:");

        nEncText.setText("Modulus:");

        eEncText.setText("Encryption Power:");

        EncTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        EncTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EncTitle.setText("Encryption");

        Encrypt.setText("Encrypt");
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });

        Decrypt.setText("Decrypt");
        Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptActionPerformed(evt);
            }
        });

        fDecText.setText("File Address:");

        nDecText.setText("Modulus:");

        dDecText.setText("Decryption Power:");

        DecTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        DecTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DecTitle.setText("Decryption");

        javax.swing.GroupLayout EncryptionDecryptionLayout = new javax.swing.GroupLayout(EncryptionDecryption);
        EncryptionDecryption.setLayout(EncryptionDecryptionLayout);
        EncryptionDecryptionLayout.setHorizontalGroup(
            EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(EncTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DecTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EncryptionDecryptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncryptionDecryptionLayout.createSequentialGroup()
                        .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EncryptionDecryptionLayout.createSequentialGroup()
                                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nEncText)
                                    .addComponent(fEncText)
                                    .addComponent(eEncText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nEncValue, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fEncValue, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eEncValue)))
                            .addGroup(EncryptionDecryptionLayout.createSequentialGroup()
                                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nDecText)
                                    .addComponent(fDecText)
                                    .addComponent(dDecText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nDecValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                                    .addComponent(fDecValue, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dDecValue))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionDecryptionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncryptionDecryptionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        EncryptionDecryptionLayout.setVerticalGroup(
            EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptionDecryptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EncTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eEncText)
                    .addComponent(eEncValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nEncText)
                    .addComponent(nEncValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fEncText)
                    .addComponent(fEncValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DecTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dDecText)
                    .addComponent(dDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nDecText)
                    .addComponent(nDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EncryptionDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fDecText)
                    .addComponent(fDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        MainTabsPanel.addTab("Encryption/Decription", EncryptionDecryption);

        eFactoringText.setText("Encryption Power:");

        dFactoringText.setText("Decryption Power:");

        nFactoringText.setText("Modulus:");

        pFactoringText.setText("Prime Factor #1:");

        qFactoringText.setText("Prime Factor #2:");

        FactoringTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        FactoringTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FactoringTitle.setText("RSA Factoring");

        FactoringParameters.setText("Factor");
        FactoringParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactoringParametersActionPerformed(evt);
            }
        });

        cyclesFactoringText.setText("Cycles:");

        explained2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        explained2.setText(" Enter the parameters and press Factor to factor the modulus.You can choose number of cycles in the algorithm.  ");

        javax.swing.GroupLayout RSAFactoringLayout = new javax.swing.GroupLayout(RSAFactoring);
        RSAFactoring.setLayout(RSAFactoringLayout);
        RSAFactoringLayout.setHorizontalGroup(
            RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RSAFactoringLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FactoringParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addComponent(sep13)
            .addGroup(RSAFactoringLayout.createSequentialGroup()
                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RSAFactoringLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RSAFactoringLayout.createSequentialGroup()
                                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qFactoringText)
                                    .addComponent(pFactoringText))
                                .addGap(18, 18, 18)
                                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qFactoringValue)
                                    .addComponent(pFactoringValue)))
                            .addGroup(RSAFactoringLayout.createSequentialGroup()
                                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dFactoringText)
                                    .addComponent(nFactoringText)
                                    .addComponent(eFactoringText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dFactoringValue, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nFactoringValue, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eFactoringValue)))))
                    .addGroup(RSAFactoringLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(cyclesFactoringText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cyclesFactoringValue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(explained2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FactoringTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RSAFactoringLayout.setVerticalGroup(
            RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RSAFactoringLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(FactoringTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explained2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cyclesFactoringText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cyclesFactoringValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eFactoringText)
                    .addComponent(eFactoringValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dFactoringText)
                    .addComponent(dFactoringValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nFactoringText)
                    .addComponent(nFactoringValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pFactoringText)
                    .addComponent(pFactoringValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RSAFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qFactoringValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qFactoringText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FactoringParameters, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );

        MainTabsPanel.addTab("RSA Factoring", RSAFactoring);

        WienerTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        WienerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WienerTitle.setText("Wiener Algorithm");

        eWienerText.setText("Encryption Power:");

        nWienerText.setText("Modulus:");

        qWienerText.setText("Prime Factor #1:");

        pWienerText.setText("Prime Factor #2:");

        WienerFactor.setText("Factor");
        WienerFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WienerFactorActionPerformed(evt);
            }
        });

        explained3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        explained3.setText("Enter the parameters and press Factor to factor the modulus using Wiener algorithm.");

        javax.swing.GroupLayout WinerAlgorithmLayout = new javax.swing.GroupLayout(WinerAlgorithm);
        WinerAlgorithm.setLayout(WinerAlgorithmLayout);
        WinerAlgorithmLayout.setHorizontalGroup(
            WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep11, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(WinerAlgorithmLayout.createSequentialGroup()
                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WinerAlgorithmLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(WienerFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(WinerAlgorithmLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WinerAlgorithmLayout.createSequentialGroup()
                                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nWienerText)
                                    .addComponent(eWienerText))
                                .addGap(8, 8, 8)
                                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nWienerValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                                    .addComponent(eWienerValue)))
                            .addGroup(WinerAlgorithmLayout.createSequentialGroup()
                                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qWienerText)
                                    .addComponent(pWienerText))
                                .addGap(18, 18, 18)
                                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pWienerValue)
                                    .addComponent(qWienerValue))))))
                .addContainerGap())
            .addComponent(explained3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WienerTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WinerAlgorithmLayout.setVerticalGroup(
            WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WinerAlgorithmLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(WienerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explained3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eWienerText)
                    .addComponent(eWienerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nWienerText)
                    .addComponent(nWienerValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sep11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qWienerText)
                    .addComponent(qWienerValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WinerAlgorithmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pWienerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pWienerText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WienerFactor)
                .addGap(66, 66, 66))
        );

        MainTabsPanel.addTab("Wiener Algorithm", WinerAlgorithm);

        nPolardText.setText("Modulus:");

        qPolardText.setText("Prime Factor #1:");

        qPollardText.setText("Prime Factor #2:");

        PolardTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        PolardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PolardTitle.setText("Pollard p-1 Factoring");

        PolardFactor.setText("Factor");
        PolardFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolardFactorActionPerformed(evt);
            }
        });

        bText.setText("Choose B value:");

        explained4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        explained4.setText("Enter the parameters and press Factor to factor the modulus. You can choose the limit B in the algorithm.");
        explained4.setToolTipText("");
        explained4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PolardFactoringLayout = new javax.swing.GroupLayout(PolardFactoring);
        PolardFactoring.setLayout(PolardFactoringLayout);
        PolardFactoringLayout.setHorizontalGroup(
            PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep10)
            .addComponent(explained4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(PolardTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PolardFactoringLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PolardFactoringLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PolardFactoringLayout.createSequentialGroup()
                                .addComponent(PolardFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PolardFactoringLayout.createSequentialGroup()
                                .addComponent(bText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bValue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245))))
                    .addGroup(PolardFactoringLayout.createSequentialGroup()
                        .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PolardFactoringLayout.createSequentialGroup()
                                .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qPolardText)
                                    .addComponent(qPollardText))
                                .addGap(18, 18, 18)
                                .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pPolardValue)
                                    .addComponent(qPolardValue)))
                            .addGroup(PolardFactoringLayout.createSequentialGroup()
                                .addComponent(nPolardText)
                                .addGap(62, 62, 62)
                                .addComponent(nPolardValue)))
                        .addContainerGap())))
        );
        PolardFactoringLayout.setVerticalGroup(
            PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PolardFactoringLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PolardTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(explained4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nPolardText)
                    .addComponent(nPolardValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sep10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qPolardText)
                    .addComponent(qPolardValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PolardFactoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qPollardText)
                    .addComponent(pPolardValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PolardFactor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(147, 147, 147))
        );

        MainTabsPanel.addTab("Pollard Factoring", PolardFactoring);

        cyclesMillerRabinText1.setText("Cycles (Miller-Rabin):");

        PrimalityTestTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        PrimalityTestTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrimalityTestTitle.setText("Primality Test");

        numberCheckText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberCheckText.setText("Enter Number:");

        Check.setText("Check");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrimalityTestLayout = new javax.swing.GroupLayout(PrimalityTest);
        PrimalityTest.setLayout(PrimalityTestLayout);
        PrimalityTestLayout.setHorizontalGroup(
            PrimalityTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimalityTestTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(numberCheckText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrimalityTestLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PrimalityTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrimalityTestLayout.createSequentialGroup()
                        .addComponent(cyclesMillerRabinText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cyclesMillerRabinValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrimalityTestLayout.createSequentialGroup()
                        .addComponent(numberCheckValue, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrimalityTestLayout.createSequentialGroup()
                        .addComponent(Check)
                        .addGap(311, 311, 311))))
        );
        PrimalityTestLayout.setVerticalGroup(
            PrimalityTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrimalityTestLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PrimalityTestTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrimalityTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cyclesMillerRabinText1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cyclesMillerRabinValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(numberCheckText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberCheckValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Check)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        MainTabsPanel.addTab("Primality Test", PrimalityTest);

        eComputeDecText.setText("Encryption Power:");

        pComputeDecText.setText("Prime Factor #1:");

        qComputeDecText.setText("Prime Factor #2:");

        dComputeDecText.setText("Decryption Power:");

        ComputeDecryptionTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ComputeDecryptionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ComputeDecryptionTitle.setText("Compute Decryption Power");

        Compute.setText("Compute");
        Compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ComputeDecryptionLayout = new javax.swing.GroupLayout(ComputeDecryption);
        ComputeDecryption.setLayout(ComputeDecryptionLayout);
        ComputeDecryptionLayout.setHorizontalGroup(
            ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep15)
            .addGroup(ComputeDecryptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ComputeDecryptionLayout.createSequentialGroup()
                        .addComponent(dComputeDecText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dComputeDecValue))
                    .addGroup(ComputeDecryptionLayout.createSequentialGroup()
                        .addGroup(ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pComputeDecText)
                            .addComponent(qComputeDecText)
                            .addComponent(eComputeDecText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pComputeDecValue, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qComputeDecValue, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eComputeDecValue))))
                .addContainerGap())
            .addComponent(ComputeDecryptionTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComputeDecryptionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Compute, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        ComputeDecryptionLayout.setVerticalGroup(
            ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputeDecryptionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ComputeDecryptionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eComputeDecText)
                    .addComponent(eComputeDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pComputeDecText)
                    .addComponent(pComputeDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qComputeDecText)
                    .addComponent(qComputeDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep15, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputeDecryptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dComputeDecText)
                    .addComponent(dComputeDecValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Compute)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        MainTabsPanel.addTab("Compute Decryption", ComputeDecryption);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainTabsPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainTabsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * generate and display (on the panel) RSA parameters (possibly with user's specifications).
     * @param evt 
     */
    private void generateParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateParametersActionPerformed
        try{
            int NOB, dSize, rounds;
            try{ // if user input exists or valid for the size of the prime factors (in bits). 
                NOB=Integer.parseInt(sizeValue.getText());
                if(NOB<2)
                    throw new Exception();
            }
            catch (NumberFormatException name){
                NOB=64; // default size
            }
            try{ // if user input exists or valid for number of round in Miller Rabin algorithm.
                rounds=Integer.parseInt(cyclesMillerRabinValue.getText());
            }
            catch (NumberFormatException name){
                rounds=1000; // default size
            }
            BigInteger p=Utilities.findPrime(NOB,rounds);
            pValue.setText(p.toString());
            BigInteger q=Utilities.findPrime(NOB,rounds);
            qValue.setText(q.toString());
            BigInteger n=p.multiply(q); 
            nValue.setText(n.toString());
            BigInteger e,d;
            try{ // if user input exists or valid for the size of d (in bits).
                dSize=Integer.parseInt(dSizeValue.getText());
                d=Utilities.findRelativePrime((q.subtract(BigInteger.ONE)).multiply(p.subtract(BigInteger.ONE)),dSize,rounds); 
                if(d==null){ // if no relative prime could be found
                    eValue.setText("Could not find relative prime number");
                    dValue.setText("Could not find relative prime number");
                    return;
                }
                e=d.modInverse((q.subtract(BigInteger.ONE)).multiply(p.subtract(BigInteger.ONE))); 
            }
            catch (NumberFormatException name){
                e=Utilities.findRelativePrime((q.subtract(BigInteger.ONE)).multiply(p.subtract(BigInteger.ONE)),0,rounds); 
                d=e.modInverse((q.subtract(BigInteger.ONE)).multiply(p.subtract(BigInteger.ONE))); 
            }
            eValue.setText(e.toString());
            dValue.setText(d.toString());
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_generateParametersActionPerformed
    /**
     * factor the modulus using polard's algorithm, and display the factors. 
     * @param evt 
     */
    private void PolardFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolardFactorActionPerformed
        try{
            BigInteger n=new BigInteger(nPolardValue.getText());
            if(!Utilities.checkInput(n))
                throw new Exception();
            if(n.bitLength()>50) // arbitrary limit so the program wouldn't run too long 
                throw new Exception();
            BigInteger q;
            try{  // if user input exists or valid for the limit B.
                q=Utilities.PolardFactoring(n, new BigInteger(bValue.getText()));
            }
            catch (NumberFormatException name){
                q=Utilities.PolardFactoring(n, new BigInteger("10000000")); // using default value.
            }
            if(q==null){
                qPolardValue.setText("Could not factor the number");
                pPolardValue.setText("Could not factor the number"); 
            }
            else{
                BigInteger p=n.divide(q);
                qPolardValue.setText(p.toString());
                pPolardValue.setText(q.toString());
            }
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PolardFactorActionPerformed
    /**
     * decrypt user file with given modulus and decryption power, and save it in the original file
     * folder with _decrypt added to the file's name.
     * @param evt 
     */
    private void DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptActionPerformed
        try{
            BigInteger d,n;
            d=new BigInteger(dDecValue.getText());
            n=new BigInteger(nDecValue.getText());
            if(!Utilities.checkInput(d) || !Utilities.checkInput(n))
                throw new Exception();
            String file=fDecValue.getText();
            ByteArrayOutputStream ous2;
            InputStream ios2;
            byte[] buffer2 = new byte[n.toByteArray().length]; // block size in encrypted files is set to be the size of n in bytes.
            ous2 = new ByteArrayOutputStream();
            ios2 = new FileInputStream(file);
            int read=0;
            while (ios2.read(buffer2) != -1) {     
                BigInteger c2=new BigInteger(buffer2);
                BigInteger cd=c2.modPow(d, n);
                if(cd.toByteArray().length>n.toByteArray().length/2) // the original block size is n.toByteArray().length/2
                    cd=cd.subtract(n);
                if(cd.toByteArray().length<n.toByteArray().length/2) // padding if the block is smaller than n.toByteArray().length/2
                {
                    System.out.println(read+" "+Arrays.toString(cd.toByteArray()));
                    int gap=n.toByteArray().length/2-cd.toByteArray().length;
                    while(gap>0){
                        if(cd.compareTo(BigInteger.ZERO)>0)
                            ous2.write(0); // for positive numbers
                        else
                            ous2.write(255); // for negative numbers (two's complement)
                        gap--;
                    }
                }
                ous2.write(cd.toByteArray());
                buffer2 = new byte[n.toByteArray().length];              
            }
            ous2.close();
            ios2.close();
            OutputStream outputStream = new FileOutputStream(file+"_decrypted");
            ous2.writeTo(outputStream);
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DecryptActionPerformed
    /**
     * encrypt user file with given modulus and encryption power, and save it in the original file
     * folder with _encrypt added to the file's name.
     * @param evt 
     */
    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
        try{
            BigInteger e,n;
            e=new BigInteger(eEncValue.getText());
            n=new BigInteger(nEncValue.getText());
            if(!Utilities.checkInput(e) || !Utilities.checkInput(n))
                throw new Exception();
            String file=fEncValue.getText();
            ByteArrayOutputStream ous;
            InputStream ios;
            byte[] buffer = new byte[n.toByteArray().length/2]; // the original block size is n.toByteArray().length/2
            ous = new ByteArrayOutputStream();
            ios = new FileInputStream(file);
            while (ios.read(buffer) != -1){  
                BigInteger c=new BigInteger(buffer);
                BigInteger ce=c.modPow(e, n);
                if(ce.toByteArray().length<n.toByteArray().length) // padding if the block is smaller than n.toByteArray().length
                {
                    int gap=n.toByteArray().length-ce.toByteArray().length;
                    while(gap>0){
                        ous.write(0);
                        gap--;
                    }
                }
                ous.write(ce.toByteArray());
                buffer = new byte[n.toByteArray().length/2];                
            }
            ous.close();
            ios.close();    
            OutputStream outputStream = new FileOutputStream(file+"_encrypted");
            ous.writeTo(outputStream);   
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EncryptActionPerformed
    /**
     * factor the modulus using RSA factoring algorithm, and display the factors. 
     * @param evt 
     */
    private void FactoringParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactoringParametersActionPerformed
        BigInteger e,d,n;
        try{
            e=new BigInteger(eFactoringValue.getText());
            n=new BigInteger(nFactoringValue.getText());
            d=new BigInteger(dFactoringValue.getText());
            if(!Utilities.checkInput(e) || !Utilities.checkInput(n) || !Utilities.checkInput(d))
                throw new Exception();
            BigInteger q;
            try{ // if user input exists or valid for the number of cycles.
                q=Utilities.RSAFactor(n, e, d,Integer.parseInt(cyclesFactoringValue.getText()));
            }
            catch (NumberFormatException exc){
                q=Utilities.RSAFactor(n, e, d,1000); // using defaulf value
            }
            if(q==null){
                pFactoringValue.setText("Could not factor the number");
                qFactoringValue.setText("Could not factor the number");
            }
            else{
                BigInteger p=n.divide(q);
                pFactoringValue.setText(p.toString());
                qFactoringValue.setText(q.toString());
            }
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FactoringParametersActionPerformed
    /**
     * factor the modulus using wiener's algorithm, and display the factors. 
     * @param evt 
     */
    private void WienerFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WienerFactorActionPerformed
        try{
            BigInteger e,n;
            e=new BigInteger(eWienerValue.getText());
            n=new BigInteger(nWienerValue.getText());
            if(!Utilities.checkInput(e) || !Utilities.checkInput(n))
                throw new Exception();
            BigInteger q=Utilities.WienerAlgorithm(n, e);
            if(q==null){ // if the algorithm failed (n,d,e do not satisfy the terms).
                pWienerValue.setText("Could not factor the number");
                qWienerValue.setText("Could not factor the number");
            }
            else{
                BigInteger p=n.divide(q);
                pWienerValue.setText(p.toString());
                qWienerValue.setText(q.toString());
            }
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_WienerFactorActionPerformed
    /**
     * checks if a the number entered by the user is prime and display a message with the resault.
     * @param evt 
     */
    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        try{
            int cycles;
            try{
                cycles=Integer.parseInt(cyclesMillerRabinValue1.getText());
            }
            catch (NumberFormatException exc){
                cycles=10;
            }
            BigInteger n=new BigInteger(numberCheckValue.getText());
            if(!Utilities.checkInput(n))
                throw new Exception();
            if(Utilities.MillerRabinTest(n, cycles))
                JOptionPane.showMessageDialog(null, n.toString()+" is probably prime.","Probably Prime",JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, n.toString()+" is composite.","Composite",JOptionPane.PLAIN_MESSAGE);
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CheckActionPerformed
    /**
     * computes the decryption power when encryption power and factors of the modulus are given
     * and displays it.
     * @param evt 
     */
    private void ComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeActionPerformed
        try{
            BigInteger e=new BigInteger(eComputeDecValue.getText());
            BigInteger p=new BigInteger(pComputeDecValue.getText());
            BigInteger q=new BigInteger(qComputeDecValue.getText());
            if(Utilities.checkInput(e) && Utilities.checkInput(q) && Utilities.checkInput(p))
                dComputeDecValue.setText(Utilities.computeDecryption(e, p, q).toString());
            else 
                throw new Exception();
        }
        catch (Exception exc){
            JOptionPane.showMessageDialog(null, "Please write the input as required.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ComputeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RSA_Stuff().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check;
    private javax.swing.JButton Compute;
    private javax.swing.JPanel ComputeDecryption;
    private javax.swing.JLabel ComputeDecryptionTitle;
    private javax.swing.JLabel DecTitle;
    private javax.swing.JButton Decrypt;
    private javax.swing.JLabel EncTitle;
    private javax.swing.JButton Encrypt;
    private javax.swing.JPanel EncryptionDecryption;
    private javax.swing.JButton FactoringParameters;
    private javax.swing.JLabel FactoringTitle;
    private javax.swing.JLabel GeneratorTitle;
    private javax.swing.JTabbedPane MainTabsPanel;
    private javax.swing.JButton PolardFactor;
    private javax.swing.JPanel PolardFactoring;
    private javax.swing.JLabel PolardTitle;
    private javax.swing.JPanel PrimalityTest;
    private javax.swing.JLabel PrimalityTestTitle;
    private javax.swing.JPanel RSAFactoring;
    private javax.swing.JPanel RSAGenerator;
    private javax.swing.JButton WienerFactor;
    private javax.swing.JLabel WienerTitle;
    private javax.swing.JPanel WinerAlgorithm;
    private javax.swing.JLabel bText;
    private javax.swing.JTextField bValue;
    private javax.swing.JLabel cyclesFactoringText;
    private javax.swing.JTextField cyclesFactoringValue;
    private javax.swing.JLabel cyclesMillerRabinText;
    private javax.swing.JLabel cyclesMillerRabinText1;
    private javax.swing.JTextField cyclesMillerRabinValue;
    private javax.swing.JTextField cyclesMillerRabinValue1;
    private javax.swing.JLabel dComputeDecText;
    private javax.swing.JTextField dComputeDecValue;
    private javax.swing.JLabel dDecText;
    private javax.swing.JTextField dDecValue;
    private javax.swing.JLabel dFactoringText;
    private javax.swing.JTextField dFactoringValue;
    private javax.swing.JLabel dSizeText;
    private javax.swing.JTextField dSizeValue;
    private javax.swing.JLabel dText;
    private javax.swing.JTextField dValue;
    private javax.swing.JLabel eComputeDecText;
    private javax.swing.JTextField eComputeDecValue;
    private javax.swing.JLabel eEncText;
    private javax.swing.JTextField eEncValue;
    private javax.swing.JLabel eFactoringText;
    private javax.swing.JTextField eFactoringValue;
    private javax.swing.JLabel eText;
    private javax.swing.JTextField eValue;
    private javax.swing.JLabel eWienerText;
    private javax.swing.JTextField eWienerValue;
    private javax.swing.JLabel explained1;
    private javax.swing.JLabel explained2;
    private javax.swing.JLabel explained3;
    private javax.swing.JLabel explained4;
    private javax.swing.JLabel fDecText;
    private javax.swing.JTextField fDecValue;
    private javax.swing.JLabel fEncText;
    private javax.swing.JTextField fEncValue;
    private javax.swing.JButton generateParameters;
    private javax.swing.JLabel nDecText;
    private javax.swing.JTextField nDecValue;
    private javax.swing.JLabel nEncText;
    private javax.swing.JTextField nEncValue;
    private javax.swing.JLabel nFactoringText;
    private javax.swing.JTextField nFactoringValue;
    private javax.swing.JLabel nPolardText;
    private javax.swing.JTextField nPolardValue;
    private javax.swing.JLabel nText;
    private javax.swing.JTextField nValue;
    private javax.swing.JLabel nWienerText;
    private javax.swing.JTextField nWienerValue;
    private javax.swing.JLabel numberCheckText;
    private javax.swing.JTextField numberCheckValue;
    private javax.swing.JLabel pComputeDecText;
    private javax.swing.JTextField pComputeDecValue;
    private javax.swing.JLabel pFactoringText;
    private javax.swing.JTextField pFactoringValue;
    private javax.swing.JTextField pPolardValue;
    private javax.swing.JLabel pText;
    private javax.swing.JTextField pValue;
    private javax.swing.JLabel pWienerText;
    private javax.swing.JTextField pWienerValue;
    private javax.swing.JLabel qComputeDecText;
    private javax.swing.JTextField qComputeDecValue;
    private javax.swing.JLabel qFactoringText;
    private javax.swing.JTextField qFactoringValue;
    private javax.swing.JLabel qPolardText;
    private javax.swing.JTextField qPolardValue;
    private javax.swing.JLabel qPollardText;
    private javax.swing.JLabel qText;
    private javax.swing.JTextField qValue;
    private javax.swing.JLabel qWienerText;
    private javax.swing.JTextField qWienerValue;
    private javax.swing.JSeparator sep10;
    private javax.swing.JSeparator sep11;
    private javax.swing.JSeparator sep12;
    private javax.swing.JSeparator sep13;
    private javax.swing.JSeparator sep15;
    private javax.swing.JLabel sizeText;
    private javax.swing.JTextField sizeValue;
    // End of variables declaration//GEN-END:variables
}
