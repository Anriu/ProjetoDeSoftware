/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vision;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Anriu Oliveira
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadastro
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEmailLogin = new javax.swing.JTextField();
        botaoLogin = new javax.swing.JButton();
        txtSenhaLogin1 = new javax.swing.JPasswordField();
        lblLogin1 = new javax.swing.JLabel();
        botaoCadastro = new javax.swing.JButton();
        txtUsuarioCadastro = new javax.swing.JTextField();
        txtEmailCadastro = new javax.swing.JTextField();
        txtSenhaCadastro = new javax.swing.JPasswordField();
        lblCadastro = new javax.swing.JLabel();
        botaoRecup = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1260, 726));
        setMinimumSize(new java.awt.Dimension(1260, 726));
        setPreferredSize(new java.awt.Dimension(1260, 726));

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        txtEmailLogin.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtEmailLogin.setForeground(new java.awt.Color(153, 153, 153));
        txtEmailLogin.setText("Email\n"); // NOI18N
        txtEmailLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        txtEmailLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailLoginFocusLost(evt);
            }
        });
        txtEmailLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailLoginKeyPressed(evt);
            }
        });

        botaoLogin.setBackground(new java.awt.Color(51, 51, 255));
        botaoLogin.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        botaoLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoLogin.setText("ENTRAR");

        txtSenhaLogin1.setForeground(new java.awt.Color(153, 153, 153));
        txtSenhaLogin1.setText("Senha");
        txtSenhaLogin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        txtSenhaLogin1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaLogin1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaLogin1FocusLost(evt);
            }
        });
        txtSenhaLogin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaLogin1KeyPressed(evt);
            }
        });

        lblLogin1.setBackground(new java.awt.Color(0, 0, 0));
        lblLogin1.setFont(new java.awt.Font("NSimSun", 0, 40)); // NOI18N
        lblLogin1.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenhaLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addComponent(txtEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(lblLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(223, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(txtEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(txtSenhaLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(lblLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(555, Short.MAX_VALUE)))
        );

        botaoCadastro.setBackground(new java.awt.Color(51, 51, 255));
        botaoCadastro.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        botaoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastro.setText("CADASTRAR");

        txtUsuarioCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtUsuarioCadastro.setText("Usuario"); // NOI18N
        txtUsuarioCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        txtUsuarioCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioCadastroFocusLost(evt);
            }
        });
        txtUsuarioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCadastroActionPerformed(evt);
            }
        });
        txtUsuarioCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioCadastroKeyPressed(evt);
            }
        });

        txtEmailCadastro.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        txtEmailCadastro.setText("Email"); // NOI18N
        txtEmailCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        txtEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCadastroActionPerformed(evt);
            }
        });

        txtSenhaCadastro.setText("...........");
        txtSenhaCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        lblCadastro.setBackground(new java.awt.Color(0, 0, 0));
        lblCadastro.setFont(new java.awt.Font("NSimSun", 0, 40)); // NOI18N
        lblCadastro.setText("CADASTRO");

        botaoRecup.setBackground(new java.awt.Color(51, 51, 255));
        botaoRecup.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        botaoRecup.setForeground(new java.awt.Color(255, 255, 255));
        botaoRecup.setText("RECUPERAR SENHA");

        botaoSair.setBackground(new java.awt.Color(51, 51, 255));
        botaoSair.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(255, 255, 255));
        botaoSair.setText("SAIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(lblCadastro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(139, 139, 139))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmailCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                                        .addComponent(txtSenhaCadastro))
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(265, 265, 265)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoRecup, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245)
                                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(txtUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRecup, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCadastroActionPerformed

    private void txtEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCadastroActionPerformed

    private void txtEmailLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailLoginFocusGained
        if(txtEmailLogin.getText().equals("Email")){
            txtEmailLogin.setCaretPosition(0);
            txtEmailLogin.setCaretColor(Color.BLACK);
        } else{
            txtEmailLogin.setSelectionStart(0);
        }
    }//GEN-LAST:event_txtEmailLoginFocusGained

    private void txtEmailLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailLoginFocusLost
        if(txtEmailLogin.getText().equals("")){
            txtEmailLogin.setText("Email");
            txtEmailLogin.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtEmailLoginFocusLost

    private void txtEmailLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailLoginKeyPressed
        if(txtEmailLogin.getText().equals("Email")){
            txtEmailLogin.setText("");
            txtEmailLogin.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtEmailLoginKeyPressed

    private void txtSenhaLogin1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaLogin1FocusGained
        if(txtSenhaLogin1.getText().equals("Senha")){
            txtSenhaLogin1.setCaretPosition(0);
            txtSenhaLogin1.setCaretColor(Color.BLACK);
        } else{
            txtSenhaLogin1.setSelectionStart(0);
        }
    }//GEN-LAST:event_txtSenhaLogin1FocusGained

    private void txtSenhaLogin1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaLogin1FocusLost
        if(txtSenhaLogin1.getText().equals("")){
            txtSenhaLogin1.setEchoChar((char) 0);
            txtSenhaLogin1.setText("Senha");
            txtSenhaLogin1.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSenhaLogin1FocusLost

    private void txtSenhaLogin1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaLogin1KeyPressed
        if(txtSenhaLogin1.getText().equals("Senha")){
            txtSenhaLogin1.setText("");
            txtSenhaLogin1.setForeground(Color.BLACK);
            txtSenhaLogin1.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_txtSenhaLogin1KeyPressed

    private void txtUsuarioCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroFocusGained
        if(txtUsuarioCadastro.getText().equals("Usuario")){
            txtUsuarioCadastro.setCaretPosition(0);
            txtUsuarioCadastro.setCaretColor(Color.BLACK);
        } else{
            txtUsuarioCadastro.setSelectionStart(0);
        }
    }//GEN-LAST:event_txtUsuarioCadastroFocusGained

    private void txtUsuarioCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroFocusLost
        if(txtUsuarioCadastro.getText().equals("")){
            txtUsuarioCadastro.setText("Usuario");
            txtUsuarioCadastro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUsuarioCadastroFocusLost

    private void txtUsuarioCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroKeyPressed
        if(txtUsuarioCadastro.getText().equals("Usuario")){
            txtUsuarioCadastro.setText("");
            txtUsuarioCadastro.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsuarioCadastroKeyPressed

    public JButton getBotaoCadastro() {
        return botaoCadastro;
    }


    public JButton getBotaoLogin() {
        return botaoLogin;
    }

    public JButton getBotaoRecup() {
        return botaoRecup;
    }

    public JButton getBotaoSair() {
        return botaoSair;
    }

    public JTextField getTxtEmailCadastro() {
        return txtEmailCadastro;
    }

    public JTextField getTxtEmailLogin() {
        return txtEmailLogin;
    }
 

    public JTextField getTxtEmailLogin2() {
        return txtEmailCadastro;
    }

    public JPasswordField getTxtSenhaCadastro() {
        return txtSenhaCadastro;
    }

    public JPasswordField getTxtSenhaLogin1() {
        return txtSenhaLogin1;
    }

    public JTextField getTxtUsuarioCadastro() {
        return txtUsuarioCadastro;
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoRecup;
    private javax.swing.JButton botaoSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JTextField txtEmailCadastro;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JPasswordField txtSenhaCadastro;
    private javax.swing.JPasswordField txtSenhaLogin1;
    private javax.swing.JTextField txtUsuarioCadastro;
    // End of variables declaration//GEN-END:variables
    public void abrirAlerta(String titulo, String mensagem, int tipo) {
        JOptionPane.showMessageDialog(this, mensagem, titulo, tipo); 
    }
    
    public String openDialog(){
        return JOptionPane.showInputDialog(this, "Informe seu email:", 
                                            "Solicita????o de C??digo de Recupera????o",0);        
    }

}
