/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifmt.maromba2a;
 
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author geekaia
 */
public class Comida extends javax.swing.JFrame {

    
    /// oK
    /**
     * Creates new form Comida
     */
    String idSelEdit="-1";
    
    ConexaoDB con = new ConexaoDB();
    public Comida() {
        
        initComponents();
        con.connect(); 
        PreencherTablela();
    }
    
    public void PreencherTablela(){
        List<Object[]> comidas = con.ListarComida();
        
          String col[] = {"id","descricao","unidade", "valproteina", "valcalorias"};

         DefaultTableModel tableModel = new DefaultTableModel(col, 0);
         
         for (Object[] al: comidas) {
              tableModel.addRow(al);
         }                                           // The 0 argument is number rows.

         tbAlimentos.setModel(tableModel);
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlimentos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbUnidade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtQuantCalo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantProt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setRollover(true);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnSalvar);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novoregistro.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnNovo);

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/removerregistro.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setFocusable(false);
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jToolBar2.add(btnRemover);

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizarregistro.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setFocusable(false);
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAtualizar);

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.setFocusable(false);
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jToolBar2.add(btnRelatorio);

        jLabel1.setText("Pesquisar");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tbAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbAlimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlimentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAlimentos);

        jLabel2.setText("Descrição");

        txtDescricao.setEnabled(false);

        jLabel3.setText("Unidade");

        cbUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUnidade.setEnabled(false);

        jLabel4.setText("Valor Calórico");

        txtQuantCalo.setEnabled(false);

        jLabel5.setText("Valor Proteico");

        txtQuantProt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtQuantCalo)
                                    .addComponent(jLabel5)
                                    .addComponent(txtQuantProt, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                                .addGap(0, 172, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantCalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantProt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        
        txtDescricao.setEnabled(true);
        cbUnidade.setEnabled(true);
        txtQuantCalo.setEnabled(true);
        txtQuantProt.setEnabled(true);
        LimparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
          txtDescricao.setEnabled(false);
        cbUnidade.setEnabled(false);
        txtQuantCalo.setEnabled(false);
        txtQuantProt.setEnabled(false);
        
        con.inserir(txtDescricao.getText(),
                cbUnidade.getSelectedItem().toString(), 
                txtQuantCalo.getText(), 
                txtQuantProt.getText());
        
        LimparCampos();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        txtDescricao.setEnabled(false);
        cbUnidade.setEnabled(false);
        txtQuantCalo.setEnabled(false);
        txtQuantProt.setEnabled(false);
        
        
 
        con.remover(idSelEdit);
        LimparCampos();
        PreencherTablela();
        JOptionPane.showMessageDialog(this,
                "Elemento removido com sucesso!!! :)");
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
          txtDescricao.setEnabled(false);
        cbUnidade.setEnabled(false);
        txtQuantCalo.setEnabled(false);
        txtQuantProt.setEnabled(false);
        
         
          con.atualizar(txtDescricao.getText(),
                cbUnidade.getSelectedItem().toString(), 
                txtQuantCalo.getText(), 
                txtQuantProt.getText(), idSelEdit);
        
        LimparCampos();
        PreencherTablela();
        JOptionPane.showMessageDialog(this, 
                "Registro salvo com sucesso! :)");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        
        // Criar um arquivo TXT, CSV e pdf
        Object[] opcoes = {"CSV","TXT","PDF"};
        Object res = JOptionPane.showInputDialog(null, 
                "Tipo de arquivo" , 
                "Relatório " ,

                JOptionPane.PLAIN_MESSAGE , null ,
                opcoes,"");
        String opc= res.toString(); 
        String arquivoSaida="relatorio2a.txt";
        if (opc.equals("TXT"))
            arquivoSaida="relatorio2a.csv";
        else if (opc.equals("PDF"))
            arquivoSaida="relatorio2a.pdf";
        System.out.println("Arquivo saida: "+arquivoSaida);
        
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void tbAlimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAlimentosMouseClicked
        // TODO add your handling code here:
        
        int linhaAtual = tbAlimentos.getSelectedRow();  
        DefaultTableModel model = (DefaultTableModel) tbAlimentos.getModel(); 
        
        for (int i = 0; model.getRowCount() > i; i++) {
            if (linhaAtual == i) {
                idSelEdit = (String) model.getValueAt(i, 0);
                String desc = (String) model.getValueAt(i, 1);
                String unid = (String) model.getValueAt(i, 2);
                String valproteina =  (String) model.getValueAt(i, 3);
                String  valcalorias =   (String) model.getValueAt(i, 4);
                
                txtDescricao.setText(desc);
                cbUnidade.setSelectedItem(unid);
                txtQuantCalo.setText(valcalorias);
                txtQuantProt.setText(valproteina);
                break; 
            }
        }
        txtDescricao.setEnabled(true);
        cbUnidade.setEnabled(true);
        txtQuantCalo.setEnabled(true);
        txtQuantProt.setEnabled(true);
       
        
    }//GEN-LAST:event_tbAlimentosMouseClicked
    
    public void LimparCampos(){
        txtDescricao.setText("");
        cbUnidade.setSelectedIndex(0);
        txtQuantCalo.setText("");
        txtQuantProt.setText("");
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
            java.util.logging.Logger.getLogger(Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tbAlimentos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantCalo;
    private javax.swing.JTextField txtQuantProt;
    // End of variables declaration//GEN-END:variables
}
