package com.sistema.paginas;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.sistema.Cliente;
import com.sistema.Core;
import com.sistema.Main;

public class Tela_Historico extends javax.swing.JFrame {

	private Cliente cliente;
    
    public void setCliente(Cliente cliente) {
    	this.cliente = cliente;
    }
    
    public Cliente getCliente() {
    	return this.cliente;
    }

    public Tela_Historico(Cliente cliente) {
    	this.cliente = cliente;
        initComponents();
        
        tblHist_Temp.setRowHeight(59);
        tblHist_Umd.setRowHeight(59);

        
        CenteredCellRenderer centeredRenderer = new CenteredCellRenderer();
        tblHist_Temp.setDefaultRenderer(Double.class, centeredRenderer);
        tblHist_Umd.setDefaultRenderer(Double.class, centeredRenderer);

        
        configurarCoresCabecalhosTabelas();
        
        
       
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
            
    public class CenteredCellRenderer extends DefaultTableCellRenderer {
        
    @Override
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component rendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setHorizontalAlignment(CENTER);

        return rendererComponent;
    }
}
    
class CustomHeaderRenderer extends DefaultTableCellRenderer {
    private final Color corCabecalho;
    private final Font fonteCabecalho;

    public CustomHeaderRenderer(Color corCabecalho, Font fonteCabecalho) {
        this.corCabecalho = corCabecalho;
        this.fonteCabecalho = fonteCabecalho;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setBackground(corCabecalho);
        setForeground(Color.WHITE);
        setFont(fonteCabecalho); // Configura a fonte
        setHorizontalAlignment(SwingConstants.CENTER);
        return this;
    }

    }
        
private void aplicarRenderizadorCabecalho(JTable table, Color corCabecalho, Font fonteCabecalho) {
    JTableHeader header = table.getTableHeader();
    header.setDefaultRenderer(new CustomHeaderRenderer(corCabecalho, fonteCabecalho));
}
            
private void configurarCoresCabecalhosTabelas() {
    Color corCabecalho = new Color(56,176,222); // Substitua pela cor desejada
    int tamanhoFonteCabecalho = 14; // Tamanho da fonte
    Font fonteCabecalho = new Font("Helvetica Neue", Font.BOLD, tamanhoFonteCabecalho); // Negrito

    aplicarRenderizadorCabecalho(tblHist_Temp, corCabecalho, fonteCabecalho);
    aplicarRenderizadorCabecalho(tblHist_Umd, corCabecalho, fonteCabecalho);

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanelGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHist_Temp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHist_Umd = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblHist_Temp.setBackground(new java.awt.Color(206, 228, 250));
        tblHist_Temp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblHist_Temp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "Plantio", "Externa", "Interna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHist_Temp.setSelectionBackground(new java.awt.Color(206, 228, 250));
        jScrollPane1.setViewportView(tblHist_Temp);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel1.setText("HISTÓRICO DOS PLANTIOS");

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel2.setText("TEMPERATURA ");

        tblHist_Umd.setBackground(new java.awt.Color(206, 228, 250));
        tblHist_Umd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblHist_Umd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "Plantio", "Externa", "Interna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHist_Umd.setSelectionBackground(new java.awt.Color(206, 228, 250));
        jScrollPane2.setViewportView(tblHist_Umd);

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel3.setText("UMIDADE");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/umidade .png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/temperatura.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton1.setText("SAIR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(453, 453, 453))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1013, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            
            JFrame frame = new Tela_Historico(null);
        	frame.setVisible(false);
            Main.getCore().addPage(Core.PAGINA_HISTORICO,frame );
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHist_Temp;
    private javax.swing.JTable tblHist_Umd;
    // End of variables declaration//GEN-END:variables
}
