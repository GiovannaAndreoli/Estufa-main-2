
package com.sistema.paginas;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sistema.Cliente;
import com.sistema.Core;
import com.sistema.Higrometro;
import com.sistema.Main;


public class Tela_DadosCultivo extends javax.swing.JFrame {
	private Cliente cliente;
	private String plantio;

    public Tela_DadosCultivo(Cliente cliente, String plantio) {
    	this.plantio = plantio;
    	this.cliente = cliente;
    	
        initComponents();
        
        Higrometro higrometro = Core.getHigrometro(cliente, plantio);
    	
    	if(higrometro != null) {
        	txtTempExterna.setValue(higrometro.getTemperaturaExterna());
        	txtTempInterna.setValue(higrometro.getTemperaturaInterna());
        	txtUmdExterna.setValue(higrometro.getUmidadeAr());
        	txtUmdInterna.setValue(higrometro.getUmidadeSolo());
    	}
        
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
        lblTempInterna = new javax.swing.JLabel();
        lblTempExterna = new javax.swing.JLabel();
        lblUmdInterna = new javax.swing.JLabel();
        lblUmdExterna = new javax.swing.JLabel();
        lblDados = new javax.swing.JLabel();
        txtUmdInterna = new javax.swing.JFormattedTextField();
        txtTempInterna = new javax.swing.JFormattedTextField();
        txtUmdExterna = new javax.swing.JFormattedTextField();
        txtTempExterna = new javax.swing.JFormattedTextField();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblTempInterna.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTempInterna.setText("TEMPERATURA INTERNA");

        lblTempExterna.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTempExterna.setText("TEMPERATURA EXTERNA");

        lblUmdInterna.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUmdInterna.setText("UMIDADE INTERNA");

        lblUmdExterna.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUmdExterna.setText("UMIDADE EXTERNA");

        lblDados.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblDados.setText("DADOS DO CULTIVO");

        try {
            txtUmdInterna.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUmdInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmdInternaActionPerformed(evt);
            }
        });

        try {
            txtTempInterna.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTempInterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempInternaActionPerformed(evt);
            }
        });

        try {
            txtUmdExterna.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUmdExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmdExternaActionPerformed(evt);
            }
        });

        try {
            txtTempExterna.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTempExterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempExternaActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(204, 255, 204));
        btnConfirmar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmar.setOpaque(true);
        btnConfirmar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnConfirmarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTempInterna)
                            .addComponent(lblUmdInterna))
                        .addGap(18, 18, 18)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUmdInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTempInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTempExterna)
                                    .addComponent(lblUmdExterna))
                                .addGap(18, 18, 18)
                                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUmdExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTempExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblDados)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblDados)
                .addGap(69, 69, 69)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempInterna)
                    .addComponent(txtTempInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTempExterna)
                    .addComponent(txtTempExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUmdInterna)
                    .addComponent(txtUmdInterna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUmdExterna)
                    .addComponent(txtUmdExterna, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
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

        setSize(new java.awt.Dimension(690, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUmdInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmdInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmdInternaActionPerformed

    private void txtTempInternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempInternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempInternaActionPerformed

    private void txtUmdExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmdExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmdExternaActionPerformed

    private void txtTempExternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempExternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempExternaActionPerformed

    private void btnConfirmarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnConfirmarAncestorAdded
    	
    }//GEN-LAST:event_btnConfirmarAncestorAdded

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
    	if(cliente.getHigrometro(plantio) == null) {
	    	Higrometro higrometro = new Higrometro(plantio);
	    	higrometro.setTemperaturaExterna(Double.parseDouble(txtTempExterna.getText()));
	    	higrometro.setTemperaturaInterna(Double.parseDouble(txtTempInterna.getText()));
	    	higrometro.setUmidadeAr(Double.parseDouble(txtUmdExterna.getText()));
	    	higrometro.setUmidadeSolo(Double.parseDouble(txtUmdInterna.getText()));
	    	cliente.adicionarHigrometro(higrometro);
    	} else {
    		Higrometro higrometro = cliente.getHigrometro(plantio);
    		higrometro.setTemperaturaExterna(Double.parseDouble(txtTempExterna.getText()));
	    	higrometro.setTemperaturaInterna(Double.parseDouble(txtTempInterna.getText()));
	    	higrometro.setUmidadeAr(Double.parseDouble(txtUmdExterna.getText()));
	    	higrometro.setUmidadeSolo(Double.parseDouble(txtUmdInterna.getText()));
	    	Core.refreshPaginas(cliente);
	    	//cliente.adicionarHigrometro(higrometro);
    	}
    	dispose();     
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	JFrame frame = new Tela_DadosCultivo(null,null);
            	frame.setVisible(false);
                Main.getCore().addPage(Core.PAGINA_DADOS_CULTIVO,frame );
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblTempExterna;
    private javax.swing.JLabel lblTempInterna;
    private javax.swing.JLabel lblUmdExterna;
    private javax.swing.JLabel lblUmdInterna;
    private javax.swing.JFormattedTextField txtTempExterna;
    private javax.swing.JFormattedTextField txtTempInterna;
    private javax.swing.JFormattedTextField txtUmdExterna;
    private javax.swing.JFormattedTextField txtUmdInterna;
    // End of variables declaration//GEN-END:variables
}
