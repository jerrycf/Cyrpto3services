package Interface;

import com.oracle.jrockit.jfr.DataType;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import Clases.*;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class MainInterface extends javax.swing.JFrame {
    private static File actualFile;
    private static boolean bandIntegrity, bandConfidentiality, bandAutentification;
    public MainInterface() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.KpCheck.setVisible(false);
        this.KprCheck.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenKeyBtn = new javax.swing.JButton();
        DesPubKeyBtn = new javax.swing.JButton();
        OwnPubKeyBtn = new javax.swing.JButton();
        Services = new javax.swing.JPanel();
        rbIntegrity = new javax.swing.JRadioButton();
        rbAutentication = new javax.swing.JRadioButton();
        rbConfidentiality = new javax.swing.JRadioButton();
        FileBtn = new javax.swing.JButton();
        FileText = new javax.swing.JTextField();
        EncryptBtn = new javax.swing.JButton();
        DecryptBtn = new javax.swing.JButton();
        Mode = new javax.swing.JComboBox();
        Key = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        KpCheck = new javax.swing.JLabel();
        KprCheck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GenKeyBtn.setText("Generate Keys!");
        GenKeyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenKeyBtnActionPerformed(evt);
            }
        });

        DesPubKeyBtn.setText("Select destination  Public Key");
        DesPubKeyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesPubKeyBtnActionPerformed(evt);
            }
        });

        OwnPubKeyBtn.setText("Select own Public Key");
        OwnPubKeyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnPubKeyBtnActionPerformed(evt);
            }
        });

        Services.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Services", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        rbIntegrity.setText("Integrity");
        rbIntegrity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIntegrityActionPerformed(evt);
            }
        });

        rbAutentication.setText("Autentication");
        rbAutentication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAutenticationActionPerformed(evt);
            }
        });

        rbConfidentiality.setText("Confidentiality");
        rbConfidentiality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConfidentialityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicesLayout = new javax.swing.GroupLayout(Services);
        Services.setLayout(ServicesLayout);
        ServicesLayout.setHorizontalGroup(
            ServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicesLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(ServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbConfidentiality)
                    .addComponent(rbAutentication, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbIntegrity, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(24, 24, 24))
        );
        ServicesLayout.setVerticalGroup(
            ServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rbIntegrity)
                .addGap(30, 30, 30)
                .addComponent(rbAutentication)
                .addGap(29, 29, 29)
                .addComponent(rbConfidentiality)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        FileBtn.setText("Select File");
        FileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileBtnActionPerformed(evt);
            }
        });

        FileText.setEnabled(false);

        EncryptBtn.setText("ENCRYPT!");
        EncryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptBtnActionPerformed(evt);
            }
        });

        DecryptBtn.setText("DECRYPT!");
        DecryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptBtnActionPerformed(evt);
            }
        });

        Mode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES", "DES" }));
        Mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeActionPerformed(evt);
            }
        });

        Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyActionPerformed(evt);
            }
        });

        jLabel1.setText("Key");

        KpCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Check.png"))); // NOI18N

        KprCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Check.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FileBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FileText, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EncryptBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DecryptBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Key, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DesPubKeyBtn)
                                    .addComponent(Services, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(GenKeyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(OwnPubKeyBtn)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KpCheck)
                            .addComponent(KprCheck)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel1)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileBtn)
                    .addComponent(FileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(KprCheck))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Services, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GenKeyBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DesPubKeyBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KpCheck, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(OwnPubKeyBtn)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EncryptBtn)
                    .addComponent(DecryptBtn))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private File getFile() throws IOException{
        File f = new File("");
        JFileChooser jf = new JFileChooser(f.getAbsolutePath());
        jf.showOpenDialog(this);
        f = jf.getSelectedFile();
        if (f == null){
            System.out.println("Error selecting File");
        }
        return f;
    }
    
    private boolean checkFields(){
        //Check that a file is selected
        if (actualFile == null){
            JOptionPane.showMessageDialog(null, "Info Missing: No file to Encrypt/Decrypt selected :(");
            return false;
        }
        //Check that at least one service is selected
        if (!bandAutentification && !bandConfidentiality && !bandIntegrity){
            JOptionPane.showMessageDialog(null, "Info Missing: No service to provide selected :( ");
            return false;
        }
        //Check that the public and private key are uploaded
        if (!this.KpCheck.isVisible()){
            JOptionPane.showMessageDialog(null, "Info Missing: No Public Key selected :(");
            return false;
        }
        if (!this.KprCheck.isVisible()){
            JOptionPane.showMessageDialog(null, "Info Missing: No Private Key selected :(");
            return false;
        }
        //Check the key given by the user
        if (this.Key.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Info missing: No key to encrypt :(");
            return false;
        }
        
        
        return true;
    }
    
    
    
    private void GenKeyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenKeyBtnActionPerformed
        
    }//GEN-LAST:event_GenKeyBtnActionPerformed

    private void DesPubKeyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesPubKeyBtnActionPerformed
        //Obtain the public key to cipher
        this.KpCheck.setVisible(true);
    }//GEN-LAST:event_DesPubKeyBtnActionPerformed

    private void FileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileBtnActionPerformed
        try{
            actualFile = getFile();
            this.FileText.setText(actualFile.getName());
            //String msg = FileUtils.readFileToString(toEncryptFile, "UTF-8");
            //System.out.println("Mensaje del archivo= " + msg);
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_FileBtnActionPerformed

    private void rbIntegrityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIntegrityActionPerformed
        this.bandIntegrity = this.rbIntegrity.isSelected();
    }//GEN-LAST:event_rbIntegrityActionPerformed

    private void integrityEncryption() throws IOException, NoSuchAlgorithmException{
        String message = FileUtils.readFileToString(actualFile, "UTF-8");
        String hash = SHA1.sha1(message);
        FileWriter file = new FileWriter("m_hash.txt");
        file.write(message + "-10" + hash);
        file.close();
        JOptionPane.showMessageDialog(null, "Message Hashed succesfully");
    }
    private void integrityDecryption() throws IOException, NoSuchAlgorithmException{
        String message = FileUtils.readFileToString(actualFile, "UTF-8");
        String[] splited;
        try{
            splited = message.split("-10");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Message Corrupted!!! D: ");
            return;
        }
        String toCheck = splited[0];
        String hash = splited[1];
        System.out.println("toCheck= " + toCheck);
        System.out.println("SHA1= " + hash);
        if (SHA1.sha1(toCheck).equals(hash))
            JOptionPane.showMessageDialog(null, "MESSAGE COMPLETELY FINE!!! :D");
        else
            JOptionPane.showMessageDialog(null, "MESSAGE CORRUPTED!!! D:");
    }
    private void EncryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptBtnActionPerformed
        if (checkFields()){
            try{
                if (bandIntegrity && !bandAutentification && !bandConfidentiality){//Solo Integridad
                //Solo se debe de realizar el HASH
                integrityEncryption();
                }

            }catch(NoSuchAlgorithmException nsae){
                nsae.printStackTrace();
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_EncryptBtnActionPerformed

    private void DecryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptBtnActionPerformed
        //if (validate())
        try{
            if (bandIntegrity && !bandAutentification && !bandConfidentiality){//Solo Integridad
                //Solo se debe de realizar el HASH
                integrityDecryption();
            }
            
        }catch(NoSuchAlgorithmException nsae){
            nsae.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_DecryptBtnActionPerformed

    private void rbAutenticationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAutenticationActionPerformed
        this.bandAutentification = this.rbAutentication.isSelected();
        if (!this.rbIntegrity.isSelected())
            this.rbIntegrity.doClick();
    }//GEN-LAST:event_rbAutenticationActionPerformed

    private void rbConfidentialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConfidentialityActionPerformed
        this.bandConfidentiality = this.rbConfidentiality.isSelected();
    }//GEN-LAST:event_rbConfidentialityActionPerformed

    private void ModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeActionPerformed
        
    }//GEN-LAST:event_ModeActionPerformed

    private void KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyActionPerformed
        
    }//GEN-LAST:event_KeyActionPerformed

    private void OwnPubKeyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnPubKeyBtnActionPerformed
        //Obtain the private key to cipher
        this.KprCheck.setVisible(true);
    }//GEN-LAST:event_OwnPubKeyBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DecryptBtn;
    private javax.swing.JButton DesPubKeyBtn;
    private javax.swing.JButton EncryptBtn;
    private javax.swing.JButton FileBtn;
    private javax.swing.JTextField FileText;
    private javax.swing.JButton GenKeyBtn;
    private javax.swing.JTextField Key;
    private javax.swing.JLabel KpCheck;
    private javax.swing.JLabel KprCheck;
    private javax.swing.JComboBox Mode;
    private javax.swing.JButton OwnPubKeyBtn;
    private javax.swing.JPanel Services;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbAutentication;
    private javax.swing.JRadioButton rbConfidentiality;
    private javax.swing.JRadioButton rbIntegrity;
    // End of variables declaration//GEN-END:variables
}
