/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author karioka
 */
public class FrmSabor extends javax.swing.JInternalFrame {

    JDesktopPane pnlPrincipal
            ;

    /**
     * Creates new form FrmSabor
     */
    public FrmSabor() {
        initComponents();
    }

    public FrmSabor(JDesktopPane parametro) {
        this();
        pnlPrincipal = parametro;
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
        jbIncluir_Fermentado = new javax.swing.JToggleButton();
        jbExcluir_Fermentado = new javax.swing.JToggleButton();
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

        setClosable(true);
        setTitle("Cadastro de Sabor");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Fermentado:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Adstringente:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Queimado:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Gosto amargo:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Gosto doce:");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Gosto acido:");

        jbIncluir_Fermentado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbIncluir_Fermentado.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Fermentado.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Fermentado.setPreferredSize(new java.awt.Dimension(20, 20));

        jbExcluir_Fermentado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbExcluir_Fermentado.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Fermentado.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Fermentado.setPreferredSize(new java.awt.Dimension(20, 20));

        jbIncluir_Adstringente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbIncluir_Adstringente.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Adstringente.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Adstringente.setPreferredSize(new java.awt.Dimension(20, 20));

        jbExcluir_Adstringente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbExcluir_Adstringente.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Adstringente.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Adstringente.setPreferredSize(new java.awt.Dimension(20, 20));

        jbIncluir_Queimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbIncluir_Queimado.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Queimado.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Queimado.setPreferredSize(new java.awt.Dimension(20, 20));

        jbExcluir_Queimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbExcluir_Queimado.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Queimado.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Queimado.setPreferredSize(new java.awt.Dimension(20, 20));

        jbIncluir_Amargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbIncluir_Amargo.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Amargo.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Amargo.setPreferredSize(new java.awt.Dimension(20, 20));

        jbExcluir_Amargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbExcluir_Amargo.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Amargo.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Amargo.setPreferredSize(new java.awt.Dimension(20, 20));

        jbIncluir_Gosto_Doce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbIncluir_Gosto_Doce.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Gosto_Doce.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Gosto_Doce.setPreferredSize(new java.awt.Dimension(20, 20));

        jbExcluir_Gosto_Doce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbExcluir_Gosto_Doce.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Gosto_Doce.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Gosto_Doce.setPreferredSize(new java.awt.Dimension(20, 20));

        jbIncluir_Acido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/menos.png"))); // NOI18N
        jbIncluir_Acido.setMaximumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Acido.setMinimumSize(new java.awt.Dimension(20, 20));
        jbIncluir_Acido.setPreferredSize(new java.awt.Dimension(20, 20));

        jbExcluir_Acido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/mais.png"))); // NOI18N
        jbExcluir_Acido.setMaximumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Acido.setMinimumSize(new java.awt.Dimension(20, 20));
        jbExcluir_Acido.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/Sabor.png"))); // NOI18N

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
                                        .addComponent(cbSabor_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSabor_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbIncluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbExcluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbIncluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbExcluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(cbSabor_Doce, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbSabor_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbSabor_Acido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jbExcluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(cbSabor_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbIncluir_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(cbSabor_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(cbSabor_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbIncluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbIncluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbExcluir_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbExcluir_Gosto_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbExcluir_Amargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbIncluir_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cbSabor_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(cbSabor_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbIncluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExcluir_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbIncluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExcluir_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel14, jLabel15, jLabel16});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JToggleButton jbExcluir_Fermentado;
    private javax.swing.JToggleButton jbExcluir_Gosto_Doce;
    private javax.swing.JToggleButton jbExcluir_Queimado;
    private javax.swing.JToggleButton jbIncluir_Acido;
    private javax.swing.JToggleButton jbIncluir_Adstringente;
    private javax.swing.JToggleButton jbIncluir_Amargo;
    private javax.swing.JToggleButton jbIncluir_Fermentado;
    private javax.swing.JToggleButton jbIncluir_Gosto_Doce;
    private javax.swing.JToggleButton jbIncluir_Queimado;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}