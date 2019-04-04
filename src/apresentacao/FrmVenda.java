/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidades.Cafe;
import entidades.Cliente;
import entidades.Venda;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.NCafe;
import negocio.NCliente;
import negocio.NVenda;

/**
 *
 * @author Igor Lobo
 */
public class FrmVenda extends javax.swing.JInternalFrame {

    JDesktopPane pnlPrincipal;
    ArrayList<Cafe> listCafe = new ArrayList<Cafe>();
    Cliente cliente;
    double precoTotal = 0;
    DefaultTableModel model;
    JDialogRequisitarCafe telaCafe;
    JDialogRequisitarCliente telaCliente;

    public FrmVenda() {
        initComponents();
    }

    public FrmVenda(JDesktopPane parametro) {
        initComponents();
        pnlPrincipal = parametro;
        model = (DefaultTableModel) tblCafe1.getModel();
        telaCafe = new JDialogRequisitarCafe(this, true);
        telaCliente = new JDialogRequisitarCliente(this, true);
        btn_cliente.setContentAreaFilled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txf_nomeCliente = new javax.swing.JTextField();
        btn_cliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCafe1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txf_Total = new javax.swing.JTextField();
        btn_Adicionar = new javax.swing.JButton();
        btn_Remover = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registro de venda");

        jLabel1.setText("Cliente:");

        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/lupa.png"))); // NOI18N
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        tblCafe1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCafe1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tblCafe1);
        tblCafe1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblCafe1.getColumnModel().getColumnCount() > 0) {
            tblCafe1.getColumnModel().getColumn(0).setMinWidth(40);
            tblCafe1.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblCafe1.getColumnModel().getColumn(0).setMaxWidth(40);
            tblCafe1.getColumnModel().getColumn(2).setMinWidth(100);
            tblCafe1.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCafe1.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jLabel2.setText("Total:");

        txf_Total.setEditable(false);
        txf_Total.setText("0");

        btn_Adicionar.setText("Adicionar");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        btn_Remover.setText("Remover");
        btn_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverActionPerformed(evt);
            }
        });

        btn_finalizar.setText("Finalizar");
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btn_Adicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Remover))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_finalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txf_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Remover)
                        .addComponent(btn_Adicionar)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_finalizar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        telaCafe.setVisible(true);
    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        telaCliente.setVisible(true);
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverActionPerformed
        if (tblCafe1.getSelectedRow() != -1) {
            removerCafeDaLista(tblCafe1.getSelectedRow());
            model.removeRow(tblCafe1.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para remover da lista!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_RemoverActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        if (cliente == null) {
            telaCliente.setVisible(true);
        } else if (listCafe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Adicione itens á lista");
        } else {
            try {
                Venda venda = new Venda();
                venda.setListaCafe(listCafe);
                //venda.setCliente(cliente.getId());
                new NVenda().salvar(venda);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_finalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Remover;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCafe1;
    private javax.swing.JTextField txf_Total;
    private javax.swing.JTextField txf_nomeCliente;
    // End of variables declaration//GEN-END:variables

    public void adicionarCafe(int id) {
        try {
            Cafe cafe = new NCafe().consultar(id);
            listCafe.add(cafe);
            Object[] linha = {cafe.getId(), cafe.getNome(), cafe.getPreco()};
            model.addRow(linha);
            precoTotal += cafe.getPreco();
            txf_Total.setText(Double.toString(precoTotal));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void adicionarCliente(int id) {
        try {
            cliente = new NCliente().consultar(id);
            txf_nomeCliente.setText(cliente.getNome());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void removerCafeDaLista(int selectedRow) {

        for (Cafe cafe : listCafe) {
            if (Integer.toString(cafe.getId()).equals(model.getValueAt(selectedRow, 0).toString())) {
                precoTotal -= cafe.getPreco();
                txf_Total.setText(Double.toString(precoTotal));
                listCafe.remove(cafe);
                return;
            }
        }
    }
}
