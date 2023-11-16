package com.sistema.paginas;



import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sistema.Cliente;
import com.sistema.Core;
import com.sistema.Main;


public class Tela_Cadastro extends javax.swing.JFrame {


    public Tela_Cadastro() {
        initComponents();
    }
    
        class JPanelGradient extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(255, 255, 255);
            Color color2 = new Color(153, 204, 255);
            GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanelGradient();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblData_Nasc = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtData_Nasc = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtCpf = new javax.swing.JFormattedTextField();
        btnRegistrar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        lblNome.setText("NOME");

        lblEmail.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        lblEmail.setText("EMAIL");

        lblCelular.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        lblCelular.setText("CELULAR");

        lblData_Nasc.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        lblData_Nasc.setText("DATA DE NASC.");

        lblSenha.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        lblSenha.setText("SENHA");

        lblCpf.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        lblCpf.setText("CPF");

        txtNome.setOpaque(true);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEmail.setOpaque(true);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setOpaque(true);

        try {
            txtData_Nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData_Nasc.setOpaque(true);

        txtSenha.setText("jPasswordField1");
        txtSenha.setOpaque(true);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setOpaque(true);

        btnRegistrar.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrar.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        btnRegistrar.setText("REGISTRE-SE");
        btnRegistrar.setToolTipText("");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.setOpaque(true);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/Logo_P.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpf)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtData_Nasc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblData_Nasc, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSenha)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCelular)
                        .addGap(18, 18, 18)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblData_Nasc)
                        .addGap(17, 17, 17)
                        .addComponent(txtData_Nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblLogo)))
                .addGap(28, 28, 28)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(888, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
        	Cliente cliente = new Cliente();
            cliente.setCelular(txtCelular.getText());
            cliente.setCpf(txtCpf.getText());
            cliente.setDataNascimento(new Date(txtData_Nasc.getText()));
            cliente.setEmail(txtEmail.getText());
            cliente.setNome(txtNome.getText());
            cliente.setSenha(txtSenha.getText());
            Core.criarUsuario(cliente);
        }catch(Exception e) {
        	new Tela_CadastroInvalido().setVisible(true);
        }
        
        dispose();        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
        	JFrame frame = new Tela_Cadastro();
        	frame.setVisible(false);
            Main.getCore().addPage(Core.PAGINA_CADASTRO,frame );
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblData_Nasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData_Nasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
