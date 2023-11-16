
package com.sistema.paginas;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sistema.Cliente;
import com.sistema.Core;
import com.sistema.Main;


public class Tela_AdicionarCultivo extends javax.swing.JFrame {
	
	private Cliente cliente;

    public Tela_AdicionarCultivo(Cliente cliente) {
    	this.cliente = cliente;
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
        lblAddCultivo = new javax.swing.JLabel();
        txtAddCultivo = new javax.swing.JTextField();
        btnAddCultivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblAddCultivo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAddCultivo.setText("ADICIONE O CULTIVO DESEJADO");

        txtAddCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddCultivoActionPerformed(evt);
            }
        });

        btnAddCultivo.setBackground(new java.awt.Color(204, 255, 204));
        btnAddCultivo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnAddCultivo.setText("ADICIONAR");
        btnAddCultivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddCultivo.setOpaque(true);
        btnAddCultivo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnAddCultivoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnAddCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCultivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddCultivo)
                            .addComponent(btnAddCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblAddCultivo)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lblAddCultivo)
                .addGap(28, 28, 28)
                .addComponent(txtAddCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAddCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(527, 286));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddCultivoActionPerformed
     
    }//GEN-LAST:event_txtAddCultivoActionPerformed

    private void btnAddCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCultivoActionPerformed
    	Core.adicionarCultivo(cliente,txtAddCultivo.getText());
    	new Tela_DadosCultivo(cliente,txtAddCultivo.getText()).setVisible(true); 
    	//Main.getCore().abrirPagina(Core.PAGINA_DADOS_CULTIVO);
    	
    	dispose();
    }//GEN-LAST:event_btnAddCultivoActionPerformed

    private void btnAddCultivoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnAddCultivoAncestorAdded

    }//GEN-LAST:event_btnAddCultivoAncestorAdded


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	JFrame frame = new Tela_AdicionarCultivo(null);
            	frame.setVisible(false);
                Main.getCore().addPage(Core.PAGINA_ADICIONAR_CULTIVO,frame );
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton btnAddCultivo;
    private javax.swing.JLabel lblAddCultivo;
    private javax.swing.JTextField txtAddCultivo;
    // End of variables declaration//GEN-END:variables
}
