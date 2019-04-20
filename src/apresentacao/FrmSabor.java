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
public class FrmSabor extends InternalFrameComponentesDoCafe {

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
        jLabel1 = new javax.swing.JLabel();
        bIncluir_Fermentado = new javax.swing.JButton();
        bExcluir_Fermentado = new javax.swing.JButton();
        bIncluir_Adstringente = new javax.swing.JButton();
        bExcluir_Adstringente = new javax.swing.JButton();
        bExcluir_Queimado = new javax.swing.JButton();
        bIncluir_Queimado = new javax.swing.JButton();
        bExcluir_Amargo = new javax.swing.JButton();
        bIncluir_Amargo = new javax.swing.JButton();
        bExcluir_Gosto_Doce = new javax.swing.JButton();
        bIncluir_Gosto_Doce = new javax.swing.JButton();
        bExcluir_Acido = new javax.swing.JButton();
        bIncluir_Acido = new javax.swing.JButton();

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

        bExcluir_Fermentado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        bExcluir_Fermentado.setMaximumSize(new java.awt.Dimension(20, 20));
        bExcluir_Fermentado.setMinimumSize(new java.awt.Dimension(20, 20));
        bExcluir_Fermentado.setPreferredSize(new java.awt.Dimension(20, 20));
        bExcluir_Fermentado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_FermentadoActionPerformed(evt);
            }
        });

        bIncluir_Adstringente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        bIncluir_Adstringente.setMaximumSize(new java.awt.Dimension(20, 20));
        bIncluir_Adstringente.setMinimumSize(new java.awt.Dimension(20, 20));
        bIncluir_Adstringente.setPreferredSize(new java.awt.Dimension(20, 20));
        bIncluir_Adstringente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluir_AdstringenteActionPerformed(evt);
            }
        });

        bExcluir_Adstringente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        bExcluir_Adstringente.setMaximumSize(new java.awt.Dimension(20, 20));
        bExcluir_Adstringente.setMinimumSize(new java.awt.Dimension(20, 20));
        bExcluir_Adstringente.setPreferredSize(new java.awt.Dimension(20, 20));
        bExcluir_Adstringente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_AdstringenteActionPerformed(evt);
            }
        });

        bExcluir_Queimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        bExcluir_Queimado.setMaximumSize(new java.awt.Dimension(20, 20));
        bExcluir_Queimado.setMinimumSize(new java.awt.Dimension(20, 20));
        bExcluir_Queimado.setPreferredSize(new java.awt.Dimension(20, 20));
        bExcluir_Queimado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_QueimadoActionPerformed(evt);
            }
        });

        bIncluir_Queimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        bIncluir_Queimado.setMaximumSize(new java.awt.Dimension(20, 20));
        bIncluir_Queimado.setMinimumSize(new java.awt.Dimension(20, 20));
        bIncluir_Queimado.setPreferredSize(new java.awt.Dimension(20, 20));
        bIncluir_Queimado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluir_QueimadoActionPerformed(evt);
            }
        });

        bExcluir_Amargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        bExcluir_Amargo.setMaximumSize(new java.awt.Dimension(20, 20));
        bExcluir_Amargo.setMinimumSize(new java.awt.Dimension(20, 20));
        bExcluir_Amargo.setPreferredSize(new java.awt.Dimension(20, 20));
        bExcluir_Amargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_AmargoActionPerformed(evt);
            }
        });

        bIncluir_Amargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        bIncluir_Amargo.setMaximumSize(new java.awt.Dimension(20, 20));
        bIncluir_Amargo.setMinimumSize(new java.awt.Dimension(20, 20));
        bIncluir_Amargo.setPreferredSize(new java.awt.Dimension(20, 20));
        bIncluir_Amargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluir_AmargoActionPerformed(evt);
            }
        });

        bExcluir_Gosto_Doce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        bExcluir_Gosto_Doce.setMaximumSize(new java.awt.Dimension(20, 20));
        bExcluir_Gosto_Doce.setMinimumSize(new java.awt.Dimension(20, 20));
        bExcluir_Gosto_Doce.setPreferredSize(new java.awt.Dimension(20, 20));
        bExcluir_Gosto_Doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_Gosto_DoceActionPerformed(evt);
            }
        });

        bIncluir_Gosto_Doce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        bIncluir_Gosto_Doce.setMaximumSize(new java.awt.Dimension(20, 20));
        bIncluir_Gosto_Doce.setMinimumSize(new java.awt.Dimension(20, 20));
        bIncluir_Gosto_Doce.setPreferredSize(new java.awt.Dimension(20, 20));
        bIncluir_Gosto_Doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluir_Gosto_DoceActionPerformed(evt);
            }
        });

        bExcluir_Acido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        bExcluir_Acido.setMaximumSize(new java.awt.Dimension(20, 20));
        bExcluir_Acido.setMinimumSize(new java.awt.Dimension(20, 20));
        bExcluir_Acido.setPreferredSize(new java.awt.Dimension(20, 20));
        bExcluir_Acido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluir_AcidoActionPerformed(evt);
            }
        });

        bIncluir_Acido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        bIncluir_Acido.setMaximumSize(new java.awt.Dimension(20, 20));
        bIncluir_Acido.setMinimumSize(new java.awt.Dimension(20, 20));
        bIncluir_Acido.setPreferredSize(new java.awt.Dimension(20, 20));
        bIncluir_Acido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluir_AcidoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                        .addComponent(bExcluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bIncluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bExcluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bIncluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                    .addComponent(cbSabor_Acido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bExcluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bIncluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bExcluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bIncluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bExcluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bIncluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bExcluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bIncluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(cbSabor_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bExcluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIncluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExcluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIncluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cbSabor_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(cbSabor_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bExcluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bIncluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bExcluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bIncluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cbSabor_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(cbSabor_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bExcluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIncluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExcluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIncluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel14, jLabel15, jLabel16});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIncluir_FermentadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_FermentadoActionPerformed
        try {
            new JDialogCapturarIntensidadeEPorcentagem(this);
            if (porcentagem > 0 && texto != null) {

                Fermentado fermentado = new Fermentado();
                fermentado.setQuantidade(porcentagem);
                fermentado.setIntensidade(texto);
                new NFermentado().salvar(fermentado);
                for (Fermentado obj : new NFermentado().listar()) {
                    cbSabor_Fermentado.addItem(obj);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bIncluir_FermentadoActionPerformed

    private void bExcluir_FermentadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_FermentadoActionPerformed
        try {
            Fermentado selecionado = (Fermentado) cbSabor_Fermentado.getSelectedItem();
            new NFermentado().excluir(selecionado.getId());
            cbSabor_Fermentado.removeItemAt(cbSabor_Fermentado.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bExcluir_FermentadoActionPerformed

    private void bExcluir_AdstringenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_AdstringenteActionPerformed
        try {
            Adstringente selecionado = (Adstringente) cbSabor_Adstringente.getSelectedItem();
            new NAdstringente().excluir(selecionado.getId());
            cbSabor_Adstringente.removeItemAt(cbSabor_Adstringente.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bExcluir_AdstringenteActionPerformed

    private void bExcluir_QueimadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_QueimadoActionPerformed
        try {
            Queimado selecionado = (Queimado) cbSabor_Queimado.getSelectedItem();
            new NQueimado().excluir(selecionado.getId());
            cbSabor_Queimado.removeItemAt(cbSabor_Queimado.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bExcluir_QueimadoActionPerformed

    private void bExcluir_AmargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_AmargoActionPerformed
        try {
            GostoAmargo selecionado = (GostoAmargo) cbSabor_Amargo.getSelectedItem();
            new NGostoAmargo().excluir(selecionado.getId());
            cbSabor_Amargo.removeItemAt(cbSabor_Amargo.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bExcluir_AmargoActionPerformed

    private void bExcluir_Gosto_DoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_Gosto_DoceActionPerformed
        try {
            GostoDoce selecionado = (GostoDoce) cbSabor_Doce.getSelectedItem();
            new NGostoDoce().excluir(selecionado.getId());
            cbSabor_Doce.removeItemAt(cbSabor_Doce.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bExcluir_Gosto_DoceActionPerformed

    private void bExcluir_AcidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluir_AcidoActionPerformed
        try {
            GostoAcido selecionado = (GostoAcido) cbSabor_Acido.getSelectedItem();
            new NGostoAcido().excluir(selecionado.getId());
            cbSabor_Acido.removeItemAt(cbSabor_Acido.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bExcluir_AcidoActionPerformed

    private void bIncluir_AdstringenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_AdstringenteActionPerformed
        try {
            new JDialogCapturarPorcentagem(this);
            if (porcentagem > 0) {

                Adstringente adstringente = new Adstringente();
                adstringente.setQuantidade(porcentagem);
                new NAdstringente().salvar(adstringente);
                for (Adstringente obj : new NAdstringente().listar()) {
                    cbSabor_Adstringente.addItem(obj);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bIncluir_AdstringenteActionPerformed

    private void bIncluir_QueimadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_QueimadoActionPerformed
        try {
            new JDialogCapturarIntensidadeEPorcentagem(this);
            if (porcentagem > 0 && texto != null) {
                Queimado queimado = new Queimado();
                queimado.setQuantidade(porcentagem);
                queimado.setIntensidade(texto);
                new NQueimado().Salvar(queimado);
                for (Queimado obj : new NQueimado().listar()) {
                    cbSabor_Queimado.addItem(obj);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bIncluir_QueimadoActionPerformed

    private void bIncluir_AmargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_AmargoActionPerformed
        try {
            new JDialogCapturarIntensidadeEPorcentagem(this);
            if (porcentagem > 0 && texto != null) {

                GostoAmargo gostoAmargo = new GostoAmargo();
                gostoAmargo.setQuantidade(porcentagem);
                gostoAmargo.setIntensidade(texto);
                new NGostoAmargo().salvar(gostoAmargo);
                for (GostoAmargo obj : new NGostoAmargo().listar()) {
                    cbSabor_Amargo.addItem(obj);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bIncluir_AmargoActionPerformed

    private void bIncluir_Gosto_DoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_Gosto_DoceActionPerformed
        try {
            new JDialogCapturarIntensidadeEPorcentagem(this);
            if (porcentagem > 0 && texto != null) {
                GostoDoce gostoDoce = new GostoDoce();
                gostoDoce.setQuantidade(porcentagem);
                gostoDoce.setIntensidade(texto);
                new NGostoDoce().salvar(gostoDoce);
                for (GostoDoce obj : new NGostoDoce().listar()) {
                    cbSabor_Doce.addItem(obj);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bIncluir_Gosto_DoceActionPerformed

    private void bIncluir_AcidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluir_AcidoActionPerformed
       try {
            new JDialogCapturarIntensidadeEPorcentagem(this);
            if (porcentagem > 0 && texto != null) {
                GostoAcido gostoAcido = new GostoAcido();
                gostoAcido.setQuantidade(porcentagem);
                gostoAcido.setIntensidade(texto);
                new NGostoAcido().salvar(gostoAcido);
                for (GostoAcido obj : new NGostoAcido().listar()) {
                    cbSabor_Acido.addItem(obj);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_bIncluir_AcidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExcluir_Acido;
    private javax.swing.JButton bExcluir_Adstringente;
    private javax.swing.JButton bExcluir_Amargo;
    private javax.swing.JButton bExcluir_Fermentado;
    private javax.swing.JButton bExcluir_Gosto_Doce;
    private javax.swing.JButton bExcluir_Queimado;
    private javax.swing.JButton bIncluir_Acido;
    private javax.swing.JButton bIncluir_Adstringente;
    private javax.swing.JButton bIncluir_Amargo;
    private javax.swing.JButton bIncluir_Fermentado;
    private javax.swing.JButton bIncluir_Gosto_Doce;
    private javax.swing.JButton bIncluir_Queimado;
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
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
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
