/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrmAparencia extends javax.swing.JInternalFrame {

    JDesktopPane pnlPrincipal
            ;

    /**
     * Creates new form FrmCadCliente
     */
    public FrmAparencia() {
        initComponents();

    }

    public FrmAparencia(JDesktopPane parametro) {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel_Aparencia2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbCor = new javax.swing.JComboBox();
        cbOleosidade = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cbTurbidez = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jbIncluir_Cor = new javax.swing.JToggleButton();
        jbExcluir_Cor = new javax.swing.JToggleButton();
        jbIncluir_Oleosidade = new javax.swing.JToggleButton();
        jbExcluir_Oleosidade = new javax.swing.JToggleButton();
        jbIncluir_Turbidez = new javax.swing.JToggleButton();
        jbExcluir_Turbidez = new javax.swing.JToggleButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Cadastro de Aparência");
        setToolTipText("Formulário para a manutenção de dados do cliente.");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cor:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Oleosidade:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Turbidez:");

        jbIncluir_Cor.setText("Incluir");

        jbExcluir_Cor.setText("Excluir");

        jbIncluir_Oleosidade.setText("Incluir");

        jbExcluir_Oleosidade.setText("Excluir");

        jbIncluir_Turbidez.setText("Incluir");

        jbExcluir_Turbidez.setText("Excluir");

        javax.swing.GroupLayout jPanel_Aparencia2Layout = new javax.swing.GroupLayout(jPanel_Aparencia2);
        jPanel_Aparencia2.setLayout(jPanel_Aparencia2Layout);
        jPanel_Aparencia2Layout.setHorizontalGroup(
            jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Aparencia2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Aparencia2Layout.createSequentialGroup()
                        .addComponent(cbTurbidez, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbIncluir_Turbidez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbExcluir_Turbidez))
                    .addGroup(jPanel_Aparencia2Layout.createSequentialGroup()
                        .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbOleosidade, 0, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_Aparencia2Layout.createSequentialGroup()
                                .addComponent(jbIncluir_Cor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir_Cor))
                            .addGroup(jPanel_Aparencia2Layout.createSequentialGroup()
                                .addComponent(jbIncluir_Oleosidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir_Oleosidade)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel_Aparencia2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel9});

        jPanel_Aparencia2Layout.setVerticalGroup(
            jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Aparencia2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIncluir_Cor)
                    .addComponent(jbExcluir_Cor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbOleosidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbIncluir_Oleosidade)
                        .addComponent(jbExcluir_Oleosidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbIncluir_Turbidez)
                        .addComponent(jbExcluir_Turbidez))
                    .addGroup(jPanel_Aparencia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cbTurbidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel_Aparencia2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel9});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel_Aparencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Aparencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbCor;
    private javax.swing.JComboBox cbOleosidade;
    private javax.swing.JComboBox cbTurbidez;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_Aparencia2;
    private javax.swing.JToggleButton jbExcluir_Cor;
    private javax.swing.JToggleButton jbExcluir_Oleosidade;
    private javax.swing.JToggleButton jbExcluir_Turbidez;
    private javax.swing.JToggleButton jbIncluir_Cor;
    private javax.swing.JToggleButton jbIncluir_Oleosidade;
    private javax.swing.JToggleButton jbIncluir_Turbidez;
    // End of variables declaration//GEN-END:variables

    private void limpar() {

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}