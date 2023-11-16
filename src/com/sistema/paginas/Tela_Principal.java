package com.sistema.paginas;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.sistema.Cliente;
import com.sistema.Core;
import com.sistema.Higrometro;
import com.sistema.Main;
import javax.swing.JComboBox;

public class Tela_Principal extends javax.swing.JFrame {

    private Cliente cliente;
    
    public void setCliente(Cliente cliente) {
    	this.cliente = cliente;
    }
    
    public Cliente getCliente() {
    	return this.cliente;
    }

    public Tela_Principal(Cliente cliente) {
    	setCliente(cliente);
        initComponents();
        
        tblTemperaturaExterna.setRowHeight(82);
        tblTemperaturaInterna.setRowHeight(82);
        tblUmidadeExterna.setRowHeight(82);
        tblUmidadeInterna.setRowHeight(82);
        tblUltimaIrrigacao.setRowHeight(82);
        tblPoximaIrrigacao.setRowHeight(82);
        tblAlertas.setRowHeight(44);
        
        CenteredCellRenderer centeredRenderer = new CenteredCellRenderer();
        tblTemperaturaExterna.setDefaultRenderer(Double.class, centeredRenderer);
        tblTemperaturaInterna.setDefaultRenderer(Double.class, centeredRenderer);
        tblUmidadeExterna.setDefaultRenderer(Double.class, centeredRenderer);
        tblUmidadeInterna.setDefaultRenderer(Double.class, centeredRenderer);
        tblPoximaIrrigacao.setDefaultRenderer(String.class, centeredRenderer);
        tblUltimaIrrigacao.setDefaultRenderer(String.class, centeredRenderer);
        tblAlertas.setDefaultRenderer(String.class, centeredRenderer);
        
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

    aplicarRenderizadorCabecalho(tblTemperaturaExterna, corCabecalho, fonteCabecalho);
    aplicarRenderizadorCabecalho(tblTemperaturaInterna, corCabecalho, fonteCabecalho);
    aplicarRenderizadorCabecalho(tblUmidadeExterna, corCabecalho, fonteCabecalho);
    aplicarRenderizadorCabecalho(tblUmidadeInterna, corCabecalho, fonteCabecalho);
    aplicarRenderizadorCabecalho(tblPoximaIrrigacao, corCabecalho, fonteCabecalho);
    aplicarRenderizadorCabecalho(tblUltimaIrrigacao, corCabecalho, fonteCabecalho);
    aplicarRenderizadorCabecalho(tblAlertas, corCabecalho, fonteCabecalho);
}
    

                  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new JPanelGradient();
        logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUmidadeExterna = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTemperaturaExterna = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAlertas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        listPlantio = new javax.swing.JList<>();
        btnHistorico = new javax.swing.JButton();
        lblPlantio = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblUmidade = new javax.swing.JLabel();
        lblIrrigacao = new javax.swing.JLabel();
        lblAlertas = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTemperaturaInterna = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblUmidadeInterna = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblPoximaIrrigacao = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblUltimaIrrigacao = new javax.swing.JTable();
        lblAlerta = new javax.swing.JLabel();
        lblTermometro = new javax.swing.JLabel();
        lblGota = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPlanta = new javax.swing.JLabel();
        ComboBox_Dados = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/Logo_P.png"))); // NOI18N

        tblUmidadeExterna.setBackground(new java.awt.Color(224, 236, 248));
        tblUmidadeExterna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblUmidadeExterna.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tblUmidadeExterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "EXTERNA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUmidadeExterna.setToolTipText("Ideal: Entre 60 e 80%");
        tblUmidadeExterna.setSelectionBackground(new java.awt.Color(224, 236, 248));
        tblUmidadeExterna.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tblUmidadeExterna.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUmidadeExterna.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblUmidadeExternaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblUmidadeExterna);

        tblTemperaturaExterna.setBackground(new java.awt.Color(224, 236, 248));
        tblTemperaturaExterna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblTemperaturaExterna.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tblTemperaturaExterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "EXTERNA ºC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTemperaturaExterna.setToolTipText("Ideal: Entre 20 e 25 Cº");
        tblTemperaturaExterna.setSelectionBackground(new java.awt.Color(224, 236, 248));
        tblTemperaturaExterna.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tblTemperaturaExterna.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTemperaturaExterna.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTemperaturaExternaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tblTemperaturaExterna);

        tblAlertas.setBackground(new java.awt.Color(224, 236, 248));
        tblAlertas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblAlertas.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        tblAlertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ALERTAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAlertas.setSelectionBackground(new java.awt.Color(224, 236, 248));
        tblAlertas.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tblAlertas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAlertas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblAlertasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(tblAlertas);

        listPlantio.setBackground(new java.awt.Color(224, 236, 248));
        listPlantio.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        listPlantio.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = cliente.getTiposPlantio();
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
        listPlantio.addListSelectionListener(new MyListSelectionListener());
        jScrollPane5.setViewportView(listPlantio);

        btnHistorico.setBackground(new java.awt.Color(204, 255, 204));
        btnHistorico.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnHistorico.setText("HISTÓRICO");
        btnHistorico.setToolTipText("Histórico completo dos plantios");
        btnHistorico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHistorico.setOpaque(true);
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        lblPlantio.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        lblPlantio.setText("PLANTIOS");

        lblTemperatura.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        lblTemperatura.setText("TEMPERATURA");

        lblUmidade.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        lblUmidade.setText("UMIDADE");

        lblIrrigacao.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        lblIrrigacao.setText("IRRIGAÇÃO");

        lblAlertas.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        lblAlertas.setText("ALERTAS");

        tblTemperaturaInterna.setBackground(new java.awt.Color(224, 236, 248));
        tblTemperaturaInterna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblTemperaturaInterna.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tblTemperaturaInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "INTERNA  ºC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTemperaturaInterna.setToolTipText("Ideal: Entre 20 e 25 Cº");
        tblTemperaturaInterna.setSelectionBackground(new java.awt.Color(224, 236, 248));
        tblTemperaturaInterna.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tblTemperaturaInterna.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTemperaturaInterna.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTemperaturaInternaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(tblTemperaturaInterna);

        tblUmidadeInterna.setBackground(new java.awt.Color(224, 236, 248));
        tblUmidadeInterna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblUmidadeInterna.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tblUmidadeInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "INTERNA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUmidadeInterna.setToolTipText("Ideal: Entre 60 e 80%");
        tblUmidadeInterna.setSelectionBackground(new java.awt.Color(224, 236, 248));
        tblUmidadeInterna.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tblUmidadeInterna.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUmidadeInterna.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblUmidadeInternaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane7.setViewportView(tblUmidadeInterna);

        tblPoximaIrrigacao.setBackground(new java.awt.Color(224, 236, 248));
        tblPoximaIrrigacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblPoximaIrrigacao.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tblPoximaIrrigacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "PRÓXIMA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPoximaIrrigacao.setSelectionBackground(new java.awt.Color(224, 236, 248));
        tblPoximaIrrigacao.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tblPoximaIrrigacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPoximaIrrigacao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblPoximaIrrigacaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane8.setViewportView(tblPoximaIrrigacao);

        tblUltimaIrrigacao.setBackground(new java.awt.Color(224, 236, 248));
        tblUltimaIrrigacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblUltimaIrrigacao.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        tblUltimaIrrigacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "ÚLTIMA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUltimaIrrigacao.setSelectionBackground(new java.awt.Color(224, 236, 248));
        tblUltimaIrrigacao.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tblUltimaIrrigacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUltimaIrrigacao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblUltimaIrrigacaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane9.setViewportView(tblUltimaIrrigacao);

        lblAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/ponto-de-exclamacao.png"))); // NOI18N

        lblTermometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/temperatura.png"))); // NOI18N

        lblGota.setIcon(new javax.swing.ImageIcon("/Users/thiagofaroribeiro/Desktop/ADS/Github/HigronoEconomy/src/main/java/img/umidade .png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/thiagofaroribeiro/Desktop/ADS/Github/HigronoEconomy/src/main/java/img/regando-plantas .png")); // NOI18N

        lblPlanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sistema/img/planta.png"))); // NOI18N

        ComboBox_Dados.setBackground(new java.awt.Color(204, 255, 204));
        ComboBox_Dados.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ComboBox_Dados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adicionar Cultivo", "Alterar Dados do Cultivo", "Remover Cultivo", " " }));
        ComboBox_Dados.setBorder(null);
        ComboBox_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_DadosActionPerformed(evt);
            }
        });
        
        

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("SAIR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(lblPlanta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlantio))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackGroundLayout.createSequentialGroup()
                            .addComponent(lblTermometro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTemperatura))
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackGroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackGroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackGroundLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(BackGroundLayout.createSequentialGroup()
                            .addComponent(lblGota)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblUmidade)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIrrigacao)
                        .addGap(142, 142, 142)))
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackGroundLayout.createSequentialGroup()
                                .addComponent(lblAlerta)
                                .addGap(18, 18, 18)
                                .addComponent(lblAlertas))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(logo)
                        .addGap(64, 64, 64))))
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel2))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(15, 86, Short.MAX_VALUE)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlertas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlerta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(logo)
                .addGap(83, 83, 83))
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTemperatura)
                    .addComponent(lblTermometro)
                    .addComponent(lblPlantio)
                    .addComponent(lblPlanta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUmidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGota, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIrrigacao)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackGroundLayout.createSequentialGroup()
                        .addComponent(ComboBox_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
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

        setSize(new java.awt.Dimension(974, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
       new Tela_Historico(cliente).setVisible(true);
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void listPlantioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listPlantioAncestorAdded
       
    }//GEN-LAST:event_listPlantioAncestorAdded

    private void tblTemperaturaExternaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTemperaturaExternaAncestorAdded

    }//GEN-LAST:event_tblTemperaturaExternaAncestorAdded

    private void tblUmidadeExternaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblUmidadeExternaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUmidadeExternaAncestorAdded

    private void tblAlertasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblAlertasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAlertasAncestorAdded

    private void tblTemperaturaInternaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTemperaturaInternaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTemperaturaInternaAncestorAdded

    private void tblUmidadeInternaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblUmidadeInternaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUmidadeInternaAncestorAdded

    private void tblPoximaIrrigacaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblPoximaIrrigacaoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPoximaIrrigacaoAncestorAdded

    private void tblUltimaIrrigacaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblUltimaIrrigacaoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUltimaIrrigacaoAncestorAdded

    private void ComboBox_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_DadosActionPerformed
         
        String selectedItem = (String) ComboBox_Dados.getSelectedItem();
         if("Adicionar Cultivo".equals(selectedItem)){
            new Tela_AdicionarCultivo(cliente).setVisible(true);
         }
         if("Alterar Dados do Cultivo".equals(selectedItem)){
            new Tela_Alteracao(cliente).setVisible(true);
             
         }
         if ("Remover Cultivo".equals(selectedItem)){
             new Tela_Remocao(cliente).setVisible(true);
             
         
         }
    }//GEN-LAST:event_ComboBox_DadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	Main.getCore().mudarDePagina(Core.PAGINA_INICIAL);
    	dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JFrame frame = new Tela_Principal(null);
            	frame.setVisible(false);
                Main.getCore().addPage(Core.PAGINA_PRINCIPAL,frame );
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JComboBox<String> ComboBox_Dados;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblAlertas;
    private javax.swing.JLabel lblGota;
    private javax.swing.JLabel lblIrrigacao;
    private javax.swing.JLabel lblPlanta;
    private javax.swing.JLabel lblPlantio;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTermometro;
    private javax.swing.JLabel lblUmidade;
    private javax.swing.JList<String> listPlantio;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tblAlertas;
    private javax.swing.JTable tblPoximaIrrigacao;
    private javax.swing.JTable tblTemperaturaExterna;
    private javax.swing.JTable tblTemperaturaInterna;
    private javax.swing.JTable tblUltimaIrrigacao;
    private javax.swing.JTable tblUmidadeExterna;
    private javax.swing.JTable tblUmidadeInterna;
    // End of variables declaration//GEN-END:variables
    class MyListSelectionListener implements ListSelectionListener {
        
        public void valueChanged(ListSelectionEvent evt) {
             //Para que esse metodo possa ser usado por outras JList's
             //o ListSelectionEvent nos fornece qual list originou o evento
             JList list = (JList)evt.getSource();

            //Aqui vai o código, que no seu caso, mostrará o nome em um JLabel.

            //pega o objeto selecionado na lista
            String plantio = (String) list.getSelectedValue();

            //Exibe o dado no label
            Core.getPlantioInfo(cliente, plantio);
            Higrometro higrometro = Core.getHigrometro(cliente, plantio);
            tblTemperaturaExterna.setValueAt(higrometro.getTemperaturaExterna(), 0, 0);
            tblTemperaturaInterna.setValueAt(higrometro.getTemperaturaInterna(), 0, 0);
            tblUmidadeExterna.setValueAt(higrometro.getUmidadeAr(), 0, 0);
            tblUmidadeInterna.setValueAt(higrometro.getUmidadeSolo(), 0, 0);
            int count = 0;
            for(String alerta: higrometro.getAlertas()) {
            	tblAlertas.setValueAt(alerta, count, 0);
            	count++;
            }
            count = 0;
        }
    }
}


