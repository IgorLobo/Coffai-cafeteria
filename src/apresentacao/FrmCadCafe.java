package apresentacao;

import entidades.Adstringente;
import entidades.Amendoa;
import entidades.Cafe;
import entidades.Caramelizado;
import entidades.Cor;
import entidades.Fermentado;
import entidades.GostoAcido;
import entidades.GostoAmargo;
import entidades.GostoDoce;
import entidades.GraoVerde;
import entidades.Oleosidade;
import entidades.Queimado;
import entidades.Turbidez;
import java.awt.Dimension;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import negocio.NAdstringente;
import negocio.NAmendoa;
import negocio.NCafe;
import negocio.NCaramelizado;
import negocio.NCor;
import negocio.NFermentado;
import negocio.NGostoAcido;
import negocio.NGostoAmargo;
import negocio.NGostoDoce;
import negocio.NGraoVerde;
import negocio.NOleosidade;
import negocio.NQueimado;
import negocio.NTurbidez;

/**
 *
 * @author Igor
 */
public class FrmCadCafe extends javax.swing.JInternalFrame {

    JDesktopPane pnlPrincipal;
    Cafe auxCafe;
    JDialogEditarCafe telaListaCafe;
//LISTAS DOS COMPONENTES DE CAFÉ CARREGADOS PELO BANCO
    List<Adstringente> listaAdstringente;
    List<Amendoa> listAmendoa;
    List<Caramelizado> listCaramelizado;
    List<Cor> listCor;
    List<Fermentado> listFermentado;
    List<GostoAcido> listAcido;
    List<GostoAmargo> listAmargo;
    List<GostoDoce> listDoce;
    List<GraoVerde> listGraoVerde;
    List<Oleosidade> listOleosidade;
    List<Queimado> listQueimado;
    List<Turbidez> listTurbidez;

    public FrmCadCafe() {
        initComponents();
    }

    public FrmCadCafe(JDesktopPane parametro) {
        this();
        pnlPrincipal = parametro;
        carregarComboBox();
        btn_Pesquisar.setContentAreaFilled(false);
    }

    public FrmCadCafe(JDesktopPane parametro, Cafe cafe) {
        this();
        pnlPrincipal = parametro;
        carregarComboBox();
        btn_Pesquisar.setContentAreaFilled(false);
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel_Cafe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cb_Caracteristico = new javax.swing.JComboBox();
        txf_preco = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_ID = new javax.swing.JTextField();
        btn_Pesquisar = new javax.swing.JButton();
        jPanel_Aparencia = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbAparencia_Cor = new javax.swing.JComboBox();
        cbAparencia_Oleosidade = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbAparencia_Turbidez = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel_Aroma = new javax.swing.JPanel();
        cbAroma_GraoVerde = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cbAroma_Doce = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbAroma_Caramelizado = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbAroma_Amendoa = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cbAroma_Fermentado = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cbAroma_Queimado = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel_Sabor = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cbSabor_Fermentado = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cbSabor_Adstringente = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cbSabor_Queimado = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cbSabor_Amargo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cbSabor_Doce = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        cbSabor_Acido = new javax.swing.JComboBox();
        btn_cadastrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Café");
        setToolTipText("Formulário para a manutenção de dados do café.");
        setMaximumSize(new java.awt.Dimension(401, 204));
        setMinimumSize(new java.awt.Dimension(401, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");

        jLabel2.setText("Preço:");

        jLabel13.setText("Popular:");

        cb_Caracteristico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pouco", "Muito" }));

        txf_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ID:");

        txf_ID.setEditable(false);

        btn_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagens/lupa.png"))); // NOI18N
        btn_Pesquisar.setToolTipText("Pesquisar café");
        btn_Pesquisar.setBorder(null);
        btn_Pesquisar.setBorderPainted(false);
        btn_Pesquisar.setIconTextGap(0);
        btn_Pesquisar.setMaximumSize(new java.awt.Dimension(20, 20));
        btn_Pesquisar.setMinimumSize(new java.awt.Dimension(20, 20));
        btn_Pesquisar.setPreferredSize(new java.awt.Dimension(20, 20));
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CafeLayout = new javax.swing.GroupLayout(jPanel_Cafe);
        jPanel_Cafe.setLayout(jPanel_CafeLayout);
        jPanel_CafeLayout.setHorizontalGroup(
            jPanel_CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CafeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel_CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CafeLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CafeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel_CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_CafeLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Caracteristico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CafeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel_CafeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cb_Caracteristico, txf_preco});

        jPanel_CafeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel6});

        jPanel_CafeLayout.setVerticalGroup(
            jPanel_CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CafeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(cb_Caracteristico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_CafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jTabbedPane2.addTab("Café", jPanel_Cafe);

        jLabel3.setText("Cor:");

        jLabel4.setText("Oleosidade:");

        jLabel5.setText("Turbidez:");

        javax.swing.GroupLayout jPanel_AparenciaLayout = new javax.swing.GroupLayout(jPanel_Aparencia);
        jPanel_Aparencia.setLayout(jPanel_AparenciaLayout);
        jPanel_AparenciaLayout.setHorizontalGroup(
            jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AparenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbAparencia_Cor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAparencia_Oleosidade, 0, 84, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAparencia_Turbidez, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel_AparenciaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbAparencia_Cor, cbAparencia_Oleosidade, cbAparencia_Turbidez});

        jPanel_AparenciaLayout.setVerticalGroup(
            jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AparenciaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbAparencia_Turbidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbAparencia_Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_AparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbAparencia_Oleosidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel_AparenciaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbAparencia_Cor, cbAparencia_Oleosidade, cbAparencia_Turbidez});

        jTabbedPane2.addTab("Aparência", jPanel_Aparencia);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Grão verde:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Doce:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Caramelizado:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Amêndoa:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Fermentado:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Queimado:");

        javax.swing.GroupLayout jPanel_AromaLayout = new javax.swing.GroupLayout(jPanel_Aroma);
        jPanel_Aroma.setLayout(jPanel_AromaLayout);
        jPanel_AromaLayout.setHorizontalGroup(
            jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AromaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_AromaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAroma_Caramelizado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_AromaLayout.createSequentialGroup()
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbAroma_GraoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAroma_Doce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AromaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAroma_Amendoa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AromaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAroma_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AromaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAroma_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel_AromaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbAroma_Caramelizado, cbAroma_Doce, cbAroma_Fermentado, cbAroma_GraoVerde, cbAroma_Queimado});

        jPanel_AromaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel7, jLabel8, jLabel9});

        jPanel_AromaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12});

        jPanel_AromaLayout.setVerticalGroup(
            jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AromaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AromaLayout.createSequentialGroup()
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbAroma_Amendoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbAroma_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbAroma_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_AromaLayout.createSequentialGroup()
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbAroma_GraoVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbAroma_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_AromaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbAroma_Caramelizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_AromaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbAroma_Amendoa, cbAroma_Caramelizado, cbAroma_Doce, cbAroma_Fermentado, cbAroma_GraoVerde, cbAroma_Queimado});

        jTabbedPane2.addTab("Aroma", jPanel_Aroma);

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

        javax.swing.GroupLayout jPanel_SaborLayout = new javax.swing.GroupLayout(jPanel_Sabor);
        jPanel_Sabor.setLayout(jPanel_SaborLayout);
        jPanel_SaborLayout.setHorizontalGroup(
            jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SaborLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel_SaborLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbSabor_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_SaborLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_SaborLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSabor_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbSabor_Doce, 0, 82, Short.MAX_VALUE)
                        .addComponent(cbSabor_Amargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbSabor_Acido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel_SaborLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbSabor_Acido, cbSabor_Adstringente, cbSabor_Amargo, cbSabor_Doce, cbSabor_Fermentado, cbSabor_Queimado});

        jPanel_SaborLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel14, jLabel15, jLabel16});

        jPanel_SaborLayout.setVerticalGroup(
            jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SaborLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbSabor_Fermentado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cbSabor_Amargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbSabor_Adstringente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbSabor_Doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_SaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbSabor_Queimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cbSabor_Acido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Sabor", jPanel_Sabor);

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrar)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        try {
            System.out.println("botao acadastrar");
            Cafe cafe = new Cafe();
            cafe.setPopularidade(cb_Caracteristico.getSelectedItem().toString());
            cafe.setNome(txf_nome.getText());
            cafe.setPreco(Double.parseDouble(txf_preco.getText()));
            cafe.setAdstringenteId(((Adstringente) cbSabor_Adstringente.getSelectedItem()).getId());
            cafe.setGostoAcidoId(((GostoAcido) cbSabor_Acido.getSelectedItem()).getId());
            cafe.setGostoAmargoId(((GostoAmargo) cbSabor_Amargo.getSelectedItem()).getId());
            cafe.setSaborDoceId(((GostoDoce) cbSabor_Doce.getSelectedItem()).getId());
            cafe.setSaborFermentadoId(((Fermentado) cbSabor_Fermentado.getSelectedItem()).getId());
            cafe.setSaborQueimadoId(((Queimado) cbSabor_Queimado.getSelectedItem()).getId());
            cafe.setCorId(((Cor) cbAparencia_Cor.getSelectedItem()).getId());
            cafe.setOleosidadeId(((Oleosidade) cbAparencia_Oleosidade.getSelectedItem()).getId());
            cafe.setTurbidezId(((Turbidez) cbAparencia_Turbidez.getSelectedItem()).getId());
            cafe.setAmendoaId(((Amendoa) cbAroma_Amendoa.getSelectedItem()).getId());
            cafe.setCaramelizadoId(((Caramelizado) cbAroma_Caramelizado.getSelectedItem()).getId());
            cafe.setAromaDoceId(((GostoDoce) cbAroma_Doce.getSelectedItem()).getId());
            cafe.setAromaFermentadoId(((Fermentado) cbAroma_Fermentado.getSelectedItem()).getId());
            cafe.setGraoVerdeId(((GraoVerde) cbAroma_GraoVerde.getSelectedItem()).getId());
            cafe.setAromaQueimadoId(((Queimado) cbAroma_Queimado.getSelectedItem()).getId());
            if(!txf_ID.getText().isEmpty()){
                cafe.setId(auxCafe.getId());
            }
            new NCafe().salvar(cafe);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        if (telaListaCafe == null) {
            telaListaCafe = new JDialogEditarCafe(this, true);
        }
        telaListaCafe.setVisible(true);
    }//GEN-LAST:event_btn_PesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JComboBox cbAparencia_Cor;
    private javax.swing.JComboBox cbAparencia_Oleosidade;
    private javax.swing.JComboBox cbAparencia_Turbidez;
    private javax.swing.JComboBox cbAroma_Amendoa;
    private javax.swing.JComboBox cbAroma_Caramelizado;
    private javax.swing.JComboBox cbAroma_Doce;
    private javax.swing.JComboBox cbAroma_Fermentado;
    private javax.swing.JComboBox cbAroma_GraoVerde;
    private javax.swing.JComboBox cbAroma_Queimado;
    private javax.swing.JComboBox cbSabor_Acido;
    private javax.swing.JComboBox cbSabor_Adstringente;
    private javax.swing.JComboBox cbSabor_Amargo;
    private javax.swing.JComboBox cbSabor_Doce;
    private javax.swing.JComboBox cbSabor_Fermentado;
    private javax.swing.JComboBox cbSabor_Queimado;
    private javax.swing.JComboBox cb_Caracteristico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_Aparencia;
    private javax.swing.JPanel jPanel_Aroma;
    private javax.swing.JPanel jPanel_Cafe;
    private javax.swing.JPanel jPanel_Sabor;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txf_ID;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JFormattedTextField txf_preco;
    // End of variables declaration//GEN-END:variables
private void carregarComboBox() {
        try {
            listaAdstringente = new NAdstringente().listar();
            listAcido = new NGostoAcido().listar();
            listAmargo = new NGostoAmargo().listar();
            listDoce = new NGostoDoce().listar();
            listFermentado = new NFermentado().listar();
            listQueimado = new NQueimado().listar();
            listCor = new NCor().listar();
            listOleosidade = new NOleosidade().listar();
            listTurbidez = new NTurbidez().listar();
            listAmendoa = new NAmendoa().listar();
            listCaramelizado = new NCaramelizado().listar();
            listDoce = new NGostoDoce().listar();
            listFermentado = new NFermentado().listar();
            listGraoVerde = new NGraoVerde().listar();
            listQueimado = new NQueimado().listar();

            for (Adstringente obj : listaAdstringente) {
                cbSabor_Adstringente.addItem(obj);
            }
            for (GostoAcido obj : listAcido) {
                cbSabor_Acido.addItem(obj);
            }
            for (GostoAmargo obj : listAmargo) {
                cbSabor_Amargo.addItem(obj);
            }
            for (GostoDoce obj : listDoce) {
                cbSabor_Doce.addItem(obj);
            }
            for (Fermentado obj : listFermentado) {
                cbSabor_Fermentado.addItem(obj);
            }
            for (Queimado obj : listQueimado) {
                cbSabor_Queimado.addItem(obj);
            }
            for (Cor obj : listCor) {
                cbAparencia_Cor.addItem(obj);
            }
            for (Oleosidade obj : listOleosidade) {
                cbAparencia_Oleosidade.addItem(obj);
            }
            for (Turbidez obj : listTurbidez) {
                cbAparencia_Turbidez.addItem(obj);
            }
            for (Amendoa obj : listAmendoa) {
                cbAroma_Amendoa.addItem(obj);
            }
            for (Caramelizado obj : listCaramelizado) {
                cbAroma_Caramelizado.addItem(obj);
            }
            for (GostoDoce obj : listDoce) {
                cbAroma_Doce.addItem(obj);
            }
            for (Fermentado obj : listFermentado) {
                cbAroma_Fermentado.addItem(obj);
            }
            for (GraoVerde obj : listGraoVerde) {
                cbAroma_GraoVerde.addItem(obj);
            }
            for (Queimado obj : listQueimado) {
                cbAroma_Queimado.addItem(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void adicionarCafe(int id) {
        try {
            auxCafe = new NCafe().consultar(id);
            txf_ID.setText(Integer.toString(auxCafe.getId()));
            txf_nome.setText(auxCafe.getNome());
            txf_preco.setText(Double.toString(auxCafe.getPreco()));
            selecionarItem(listCor, cbAparencia_Cor, auxCafe.getCor().toString());
            selecionarItem(listOleosidade, cbAparencia_Oleosidade, auxCafe.getOleosidade().toString());
            selecionarItem(listTurbidez, cbAparencia_Turbidez, auxCafe.getTurbidez().toString());
            selecionarItem(listAmendoa, cbAroma_Amendoa, auxCafe.getAmendoa().toString());
            selecionarItem(listCaramelizado, cbAroma_Caramelizado, auxCafe.getCaramelizado().toString());
            selecionarItem(listDoce, cbAroma_Doce, auxCafe.getAromaDoce().toString());//atenção
            selecionarItem(listFermentado, cbAroma_Fermentado, auxCafe.getAromaFermentado().toString());
            selecionarItem(listGraoVerde, cbAroma_GraoVerde, auxCafe.getGraoVerde().toString());
            selecionarItem(listQueimado, cbAroma_Queimado, auxCafe.getAromaQueimado().toString());
            selecionarItem(listCor, cbSabor_Acido, auxCafe.getGostoAcido().toString());
            selecionarItem(listCor, cbSabor_Adstringente, auxCafe.getAdstringente().toString());
            selecionarItem(listCor, cbSabor_Amargo, auxCafe.getGostoAmargo().toString());
            selecionarItem(listCor, cbSabor_Doce, auxCafe.getSaborDoce().toString());
            selecionarItem(listCor, cbSabor_Fermentado, auxCafe.getSaborFermentado().toString());
            selecionarItem(listCor, cbSabor_Queimado, auxCafe.getSaborFermentado().toString());
            if (auxCafe.getPopularidade().equalsIgnoreCase("Pouco")) {
                cb_Caracteristico.setSelectedIndex(0);
            } else {
                cb_Caracteristico.setSelectedIndex(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void selecionarItem(List lista, JComboBox cb, String toStringAlvo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).toString().equalsIgnoreCase(toStringAlvo)) {
                cb.setSelectedItem(lista.get(i));
                return;
            }
        }
    }
}
