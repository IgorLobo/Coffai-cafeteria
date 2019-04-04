/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidades.Adstringente;
import entidades.Fermentado;
import entidades.GostoAcido;
import entidades.GostoAmargo;
import entidades.GostoDoce;
import entidades.Queimado;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import negocio.NAdstringente;
import negocio.NFermentado;
import negocio.NGostoAcido;
import negocio.NGostoAmargo;
import negocio.NGostoDoce;
import negocio.NQueimado;

/**
 *
 * @author karioka
 */
public class FrmSabor extends javax.swing.JInternalFrame {

    JDesktopPane pnlPrincipal;

    /**
     * Creates new form FrmSabor
     */
    public FrmSabor() {
        initComponents();
    }

    public FrmSabor(JDesktopPane parametro) {
        this();
        pnlPrincipal = parametro;
        carregarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        cbSabor_Fermentado = new javax.swing.JComboBox();
        cbSabor_Adstringente = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbSabor_Queimado = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cbSabor_Amargo = new javax.swing.JComboBox();
        cbSabor_Doce = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbSabor_Acido = new javax.swing.JComboBox();
        jbIncluir_Adstringente = new javax.swing.JToggleButton();
        jbExcluir_Adstringente = new javax.swing.JToggleButton();
        jbIncluir_Queimado = new javax.swing.JToggleButton();
        jbExcluir_Queimado = new javax.swing.JToggleButton();
        jbIncluir_Amargo = new javax.swing.JToggleButton();
        jbExcluir_Amargo = new javax.swing.JToggleButton();
        jbIncluir_Gosto_Doce = new javax.swing.JToggleButton();
        jbExcluir_Gosto_Doce = new javax.swing.JToggleButton();
        jbIncluir_Acido = new javax.swing.JToggleButton();
        jbExcluir_Acido = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        bIncluir_Fermentado = new javax.swing.JButton();
        bIncluir_Fermentado1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Sabor");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Fermentado:");

        cbSabor_Fermentado.setMaximumSize(new java.awt.Dimension(80, 20));
        cbSabor_Fermentado.setMinimumSize(new java.awt.Dimension(80, 20));
        cbSabor_Fermentado.setPreferredSize(new java.awt.Dimension(80, 20));

        cbSabor_Adstringente.setMaximumSize(new java.awt.Dimension(80, 20));
        cbSabor_Adstringente.setMinimumSize(new java.awt.Dimension(80, 20));
        cbSabor_Adstringente.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Adstringente:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Queimado:");

        cbSabor_Queimado.setMaximumSize(new java.awt.Dimension(80, 20));
        cbSabor_Queimado.setMinimumSize(new java.awt.Dimension(80, 20));
        cbSabor_Queimado.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Gosto amargo:");

        cbSabor_Amargo.setMaximumSize(new java.awt.Dimension(80, 20));
        cbSabor_Amargo.setMinimumSize(new java.awt.Dimension(80, 20));
        cbSabor_Amargo.setPreferredSize(new java.awt.Dimension(80, 20));

        cbSabor_Doce.setMaximumSize(new java.awt.Dimension(80, 20));
        cbSabor_Doce.setMinimumSize(new java.awt.Dimension(80, 20));
        cbSabor_Doce.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Gosto doce:");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Gosto acido:");

        cbSabor_Acido.setMaximumSize(new java.awt.Dimension(80, 20));
        cbSabor_Acido.setMinimumSize(new java.awt.Dimension(80, 20));
        cbSabor_Acido.setPreferredSize(new java.awt.Dimension(80, 20));

        jbIncluir_Adstringente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbIncluir_Adstringente.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Adstringente.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Adstringente.setPreferredSize(new java.awt.Dimension(20, 20));
        jbIncluir_Adstringente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluir_AdstringenteActionPerformed(evt);
            }
        });

        jbExcluir_Adstringente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbExcluir_Adstringente.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Adstringente.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Adstringente.setPreferredSize(new java.awt.Dimension(20, 20));
        jbExcluir_Adstringente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir_AdstringenteActionPerformed(evt);
            }
        });

        jbIncluir_Queimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbIncluir_Queimado.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Queimado.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Queimado.setPreferredSize(new java.awt.Dimension(20, 20));
        jbIncluir_Queimado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluir_QueimadoActionPerformed(evt);
            }
        });

        jbExcluir_Queimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbExcluir_Queimado.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Queimado.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Queimado.setPreferredSize(new java.awt.Dimension(20, 20));
        jbExcluir_Queimado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir_QueimadoActionPerformed(evt);
            }
        });

        jbIncluir_Amargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbIncluir_Amargo.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Amargo.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Amargo.setPreferredSize(new java.awt.Dimension(20, 20));
        jbIncluir_Amargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluir_AmargoActionPerformed(evt);
            }
        });

        jbExcluir_Amargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbExcluir_Amargo.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Amargo.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Amargo.setPreferredSize(new java.awt.Dimension(20, 20));
        jbExcluir_Amargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir_AmargoActionPerformed(evt);
            }
        });

        jbIncluir_Gosto_Doce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbIncluir_Gosto_Doce.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Gosto_Doce.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Gosto_Doce.setPreferredSize(new java.awt.Dimension(20, 20));
        jbIncluir_Gosto_Doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluir_Gosto_DoceActionPerformed(evt);
            }
        });

        jbExcluir_Gosto_Doce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbExcluir_Gosto_Doce.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Gosto_Doce.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Gosto_Doce.setPreferredSize(new java.awt.Dimension(20, 20));
        jbExcluir_Gosto_Doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir_Gosto_DoceActionPerformed(evt);
            }
        });

        jbIncluir_Acido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbIncluir_Acido.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Acido.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Acido.setPreferredSize(new java.awt.Dimension(20, 20));
        jbIncluir_Acido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluir_AcidoActionPerformed(evt);
            }
        });

        jbExcluir_Acido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbExcluir_Acido.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Acido.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Acido.setPreferredSize(new java.awt.Dimension(20, 20));
        jbExcluir_Acido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir_AcidoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/Sabor.png"))); // NOI18N

        bIncluir_Fermentado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        bIncluir_Fermentado.setMaximumSize(new java.awt.Dimension(20, 20));
        bIncluir_Fermentado.setMinimumSize(new java.awt.Dimension(20, 20));
        bIncluir_Fermentado.setPreferredSize(new java.awt.Dimension(20, 20));
        bIncluir_Fermentado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluir_FermentadoActionPerformed(evt);
            }
        });

        bIncluir_Fermentado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        bIncluir_Fermentado1.setMaximumSize(new java.awt.Dimension(20, 20));
        bIncluir_Fermentado1.setMinimumSize(new java.awt.Dimension(20, 20));
        bIncluir_Fermentado1.setPreferredSize(new java.awt.Dimension(20, 20));
        bIncluir_Fermentado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluir_Fermentado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSabor_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSabor_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbIncluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbExcluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bIncluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bIncluir_Fermentado1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbIncluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbExcluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbSabor_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbSabor_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbSabor_Acido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbIncluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbExcluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbIncluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbExcluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbIncluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbExcluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel14, jLabel15, jLabel16});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(cbSabor_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bIncluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bIncluir_Fermentado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbExcluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(cbSabor_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)
                                .addComponent(cbSabor_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbIncluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbIncluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbExcluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbExcluir_Amargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbIncluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbIncluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cbSabor_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(cbSabor_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbIncluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbExcluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel14, jLabel15, jLabel16});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluir_AdstringenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir_AdstringenteActionPerformed
        try {
            Adstringente selecionado = (Adstringente) cbSabor_Adstringente.getSelectedItem();
            new NAdstringente().excluir(selecionado.getId());
            cbSabor_Adstringente.removeItemAt(cbSabor_Adstringente.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbExcluir_AdstringenteActionPerformed

    private void jbIncluir_AdstringenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluir_AdstringenteActionPerformed
        try {
            Adstringente adstringente = new Adstringente();
            adstringente.setQuantidade(capturarPorcentagem("Adstringente"));
            new NAdstringente().salvar(adstringente);
            for (Adstringente obj : new NAdstringente().listar()) {
                cbSabor_Adstringente.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbIncluir_AdstringenteActionPerformed

    private void jbExcluir_QueimadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir_QueimadoActionPerformed
        try {
            Queimado selecionado = (Queimado) cbSabor_Queimado.getSelectedItem();
            new NQueimado().excluir(selecionado.getId());
            cbSabor_Queimado.removeItemAt(cbSabor_Queimado.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbExcluir_QueimadoActionPerformed

    private void jbExcluir_AmargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir_AmargoActionPerformed
        try {
            GostoAmargo selecionado = (GostoAmargo) cbSabor_Amargo.getSelectedItem();
            new NGostoAmargo().excluir(selecionado.getId());
            cbSabor_Amargo.removeItemAt(cbSabor_Amargo.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbExcluir_AmargoActionPerformed

    private void jbExcluir_Gosto_DoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir_Gosto_DoceActionPerformed
        try {
            GostoDoce selecionado = (GostoDoce) cbSabor_Doce.getSelectedItem();
            new NGostoDoce().excluir(selecionado.getId());
            cbSabor_Doce.removeItemAt(cbSabor_Doce.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbExcluir_Gosto_DoceActionPerformed

    private void jbExcluir_AcidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir_AcidoActionPerformed
        try {
            GostoAcido selecionado = (GostoAcido) cbSabor_Acido.getSelectedItem();
            new NGostoAcido().excluir(selecionado.getId());
            cbSabor_Acido.removeItemAt(cbSabor_Acido.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbExcluir_AcidoActionPerformed

    private void jbIncluir_QueimadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluir_QueimadoActionPerformed
        try {
            Queimado queimado = new Queimado();
            queimado.setQuantidade(capturarPorcentagem("Queimado"));
            new NQueimado().Salvar(queimado);
            for (Queimado obj : new NQueimado().listar()) {
                cbSabor_Queimado.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbIncluir_QueimadoActionPerformed

    private void jbIncluir_AmargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluir_AmargoActionPerformed
        try {
            GostoAmargo gostoAmargo = new GostoAmargo();
            gostoAmargo.setQuantidade(capturarPorcentagem("Gosto Amargo"));
            new NGostoAmargo().salvar(gostoAmargo);
            for (GostoAmargo obj : new NGostoAmargo().listar()) {
                cbSabor_Amargo.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbIncluir_AmargoActionPerformed

    private void jbIncluir_Gosto_DoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluir_Gosto_DoceActionPerformed
        try {
            GostoDoce gostoDoce = new GostoDoce();
            gostoDoce.setQuantidade(capturarPorcentagem("Gosto Doce"));
            new NGostoDoce().salvar(gostoDoce);
            for (GostoDoce obj : new NGostoDoce().listar()) {
                cbSabor_Doce.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbIncluir_Gosto_DoceActionPerformed

    private void jbIncluir_AcidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluir_AcidoActionPerformed
        try {
            GostoAcido gostoAcido = new GostoAcido();
            gostoAcido.setQuantidade(capturarPorcentagem("Gosto acido"));
            new NGostoAcido().salvar(gostoAcido);
            for (GostoAcido obj : new NGostoAcido().listar()) {
                cbSabor_Acido.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbIncluir_AcidoActionPerformed

    private void bIncluir_FermentadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_FermentadoActionPerformed

        try {
            Fermentado fermentado = new Fermentado();
            fermentado.setQuantidade(capturarPorcentagem("Fermentado"));
            fermentado.setIntensidade(capturarIntensidade("Fermentado"));
            for (Fermentado obj : new NFermentado().listar()) {
                cbSabor_Fermentado.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bIncluir_FermentadoActionPerformed

    private void bIncluir_Fermentado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_Fermentado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIncluir_Fermentado1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIncluir_Fermentado;
    private javax.swing.JButton bIncluir_Fermentado1;
    private javax.swing.JComboBox cbSabor_Acido;
    private javax.swing.JComboBox cbSabor_Adstringente;
    private javax.swing.JComboBox cbSabor_Amargo;
    private javax.swing.JComboBox cbSabor_Doce;
    private javax.swing.JComboBox cbSabor_Fermentado;
    private javax.swing.JComboBox cbSabor_Queimado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JToggleButton jbExcluir_Acido;
    private javax.swing.JToggleButton jbExcluir_Adstringente;
    private javax.swing.JToggleButton jbExcluir_Amargo;
    private javax.swing.JToggleButton jbExcluir_Gosto_Doce;
    private javax.swing.JToggleButton jbExcluir_Queimado;
    private javax.swing.JToggleButton jbIncluir_Acido;
    private javax.swing.JToggleButton jbIncluir_Adstringente;
    private javax.swing.JToggleButton jbIncluir_Amargo;
    private javax.swing.JToggleButton jbIncluir_Gosto_Doce;
    private javax.swing.JToggleButton jbIncluir_Queimado;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private double capturarPorcentagem(String nomeDoComponente) {
        double porcentagem = -1;
        do {
            try {
                porcentagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a porcentagem", "Cadastrar " + nomeDoComponente, JOptionPane.INFORMATION_MESSAGE));
            } catch (Exception e) {
                continue;
            }
        } while (porcentagem < 1 || porcentagem > 100);
        return porcentagem;
    }

    private String capturarAmostra(String nomeDoComponente) {
        return JOptionPane.showInputDialog(null, "Digite a amostra", "Cadastrar " + nomeDoComponente, JOptionPane.INFORMATION_MESSAGE);
    }

    private String capturarIntensidade(String nomeDoComponente) {
        return JOptionPane.showInputDialog(null, "Digite a intensidade", "Cadastrar " + nomeDoComponente, JOptionPane.INFORMATION_MESSAGE);
    }

    private void carregarComboBox() {
        try {
            for (Adstringente obj : new NAdstringente().listar()) {
                cbSabor_Adstringente.addItem(obj);
            }
            for (GostoAcido obj : new NGostoAcido().listar()) {
                cbSabor_Acido.addItem(obj);
            }
            for (GostoAmargo obj : new NGostoAmargo().listar()) {
                cbSabor_Amargo.addItem(obj);
            }
            for (GostoDoce obj : new NGostoDoce().listar()) {
                cbSabor_Doce.addItem(obj);
            }
            for (Fermentado obj : new NFermentado().listar()) {
                cbSabor_Fermentado.addItem(obj);
            }
            for (Queimado obj : new NQueimado().listar()) {
                cbSabor_Queimado.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
