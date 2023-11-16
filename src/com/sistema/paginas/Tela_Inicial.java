package com.sistema.paginas;



import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sistema.Core;
import com.sistema.Main;

public class Tela_Inicial extends javax.swing.JFrame {

    public Tela_Inicial() {
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

        BackGround = new JPanelGradient();
        imgLogo = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/Logo_G.png"))); // NOI18N

        btnCadastro.setBackground(new java.awt.Color(204, 255, 204));
        btnCadastro.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        btnCadastro.setText("CADASTRE-SE");
        btnCadastro.setToolTipText("Ainda não tem cadastro? Clique aqui!");
        btnCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastro.setOpaque(true);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(204, 255, 204));
        btnEntrar.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.setToolTipText("Já possui cadastro? Efetue o login aqui!");
        btnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar.setOpaque(true);
        btnEntrar.setPreferredSize(new java.awt.Dimension(146, 34));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(204, 255, 204));
        btnSair.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setToolTipText("Fechar o HigronoEconomy");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setOpaque(true);
        btnSair.setPreferredSize(new java.awt.Dimension(146, 34));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(imgLogo))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(imgLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1150, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
     new Tela_Cadastro().setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
new Tela_Login().setVisible(true);    
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
        	new Core().iniciar();
            JFrame frame = new Tela_Inicial();
        	frame.setVisible(false);
            Main.getCore().addPage(Core.PAGINA_INICIAL,frame );
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imgLogo;
    // End of variables declaration//GEN-END:variables
}
