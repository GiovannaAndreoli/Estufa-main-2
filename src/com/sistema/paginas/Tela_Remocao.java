
package com.sistema.paginas;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sistema.Cliente;
import com.sistema.Core;
import com.sistema.Main;

public class Tela_Remocao extends javax.swing.JFrame {

	private Cliente cliente;

    public Tela_Remocao(Cliente cliente) {
    	this.cliente=cliente;
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
        lblEscolha = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listPlantio = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblEscolha.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lblEscolha.setText("ESCOLHA O CULTIVO A SER REMOVIDO");

        btnConfirmar.setBackground(new java.awt.Color(204, 255, 204));
        btnConfirmar.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmar.setOpaque(true);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        listPlantio.setBackground(new java.awt.Color(224, 236, 248));
        listPlantio.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        listPlantio.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = Main.getCore().getSessao().getTiposPlantio();
            public int getSize() { return strings.size(); }
            public String getElementAt(int i) { return strings.get(i); }
        });
        listPlantio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listPlantioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(listPlantio);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/Logo_P.png"))); // NOI18N

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblEscolha))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblEscolha)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
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

        setSize(new java.awt.Dimension(587, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listPlantioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listPlantioAncestorAdded
    	
    }//GEN-LAST:event_listPlantioAncestorAdded

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
    	  List<String> selectedItem = listPlantio.getSelectedValuesList();
          Core.removerCultivo(cliente, selectedItem);
    }//GEN-LAST:event_btnConfirmarActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	JFrame frame = new Tela_Remocao(null);
            	frame.setVisible(false);
                Main.getCore().addPage(Core.PAGINA_REMOVE_PLANTIO,frame );
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblEscolha;
    private javax.swing.JList<String> listPlantio;
    // End of variables declaration//GEN-END:variables
}
