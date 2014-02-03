
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private Controlador controlador = new Controlador(); // @jve:decl-index=0:

	private JPanel jContentPane = null;

	private JPanel jPanelOpcoes = null;

	private JPanel jPanelIngredientes = null;

	private JPanel jPanelEstado = null;

	private JButton btnSimular = null;

	private JLabel lblAgua = null;

	private JLabel lblTempAgua = null;

	private JLabel lblPo = null;

	private JLabel lblGrao = null;

	private JLabel lblAcucar = null;

	private JComboBox cmbNivelAgua = null;

	private JComboBox cmbTemperaturaAgua = null;

	private JComboBox cmbNivelPoCafe = null;

	private JComboBox cmbNivelGraoCafe = null;

	private JComboBox cmbNivelAcucar = null;

	private JLabel lblCopos = null;

	private JLabel lblTamanho = null;

	private JLabel Tipo = null;

	private JComboBox cmbCopos = null;

	private JComboBox cmbTamanho = null;

	private JComboBox cmbTipo = null;

	private JLabel lblEstado = null;

	private JLabel lblCafeteira = null;

	private JComboBox cmbCafeteira = null;

	/**
	 * This method initializes jPanelOpcoes
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanelOpcoes() {
		if (jPanelOpcoes == null) {
			Tipo = new JLabel();
			Tipo.setBounds(new Rectangle(15, 76, 62, 16));
			Tipo.setText("Tipo");
			lblTamanho = new JLabel();
			lblTamanho.setBounds(new Rectangle(15, 57, 62, 16));
			lblTamanho.setText("Tamanho");
			lblCopos = new JLabel();
			lblCopos.setBounds(new Rectangle(15, 37, 62, 16));
			lblCopos.setText("Copos");
			jPanelOpcoes = new JPanel();
			jPanelOpcoes.setLayout(null);
			jPanelOpcoes.setBounds(new Rectangle(202, 13, 187, 133));
			jPanelOpcoes.setBorder(BorderFactory.createTitledBorder(null,
					"Opções", TitledBorder.DEFAULT_JUSTIFICATION,
					TitledBorder.DEFAULT_POSITION, new Font("Dialog",
							Font.BOLD, 12), new Color(51, 51, 51)));
			jPanelOpcoes.add(lblCopos, null);
			jPanelOpcoes.add(lblTamanho, null);
			jPanelOpcoes.add(Tipo, null);
			jPanelOpcoes.add(getCmbCopos(), null);
			jPanelOpcoes.add(getCmbTamanho(), null);
			jPanelOpcoes.add(getCmbTipo(), null);
		}
		return jPanelOpcoes;
	}

	/**
	 * This method initializes jPanelIngredientes
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanelIngredientes() {
		if (jPanelIngredientes == null) {
			lblAcucar = new JLabel();
			lblAcucar.setBounds(new Rectangle(10, 105, 122, 13));
			lblAcucar.setText("Nível de açúcar");
			lblGrao = new JLabel();
			lblGrao.setBounds(new Rectangle(10, 87, 122, 13));
			lblGrao.setText("Nível de grão de café");
			lblPo = new JLabel();
			lblPo.setBounds(new Rectangle(10, 67, 122, 13));
			lblPo.setText("Nível de pó de café");
			lblTempAgua = new JLabel();
			lblTempAgua.setBounds(new Rectangle(10, 48, 122, 13));
			lblTempAgua.setText("Temperatura da água");
			lblAgua = new JLabel();
			lblAgua.setText("Nível da água");
			lblAgua.setBounds(new Rectangle(10, 28, 122, 13));
			jPanelIngredientes = new JPanel();
			jPanelIngredientes.setLayout(null);
			jPanelIngredientes.setBounds(new Rectangle(398, 13, 297, 133));
			jPanelIngredientes.setBorder(BorderFactory.createTitledBorder(null,
					"Ingredientes", TitledBorder.DEFAULT_JUSTIFICATION,
					TitledBorder.DEFAULT_POSITION, new Font("Dialog",
							Font.BOLD, 12), new Color(51, 51, 51)));
			jPanelIngredientes.add(lblAgua, null);
			jPanelIngredientes.add(lblTempAgua, null);
			jPanelIngredientes.add(lblPo, null);
			jPanelIngredientes.add(lblGrao, null);
			jPanelIngredientes.add(lblAcucar, null);
			jPanelIngredientes.add(getCmbNivelAgua(), null);
			jPanelIngredientes.add(getCmbTemperaturaAgua(), null);
			jPanelIngredientes.add(getCmbNivelPoCafe(), null);
			jPanelIngredientes.add(getCmbNivelGraoCafe(), null);
			jPanelIngredientes.add(getCmbNivelAcucar(), null);
		}
		return jPanelIngredientes;
	}

	/**
	 * This method initializes jPanelEstado
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanelEstado() {
		if (jPanelEstado == null) {
			lblCafeteira = new JLabel();
			lblCafeteira.setBounds(new Rectangle(9, 71, 58, 17));
			lblCafeteira.setText("Cafeteira");
			lblEstado = new JLabel();
			lblEstado.setText("Estado");
			lblEstado.setBounds(new Rectangle(10, 46, 58, 17));
			jPanelEstado = new JPanel();
			jPanelEstado.setLayout(null);
			jPanelEstado.setBounds(new Rectangle(12, 13, 178, 133));
			jPanelEstado.setBorder(BorderFactory.createTitledBorder(null,
					"Estado", TitledBorder.DEFAULT_JUSTIFICATION,
					TitledBorder.DEFAULT_POSITION, new Font("Dialog",
							Font.BOLD, 12), new Color(51, 51, 51)));
			jPanelEstado.add(lblCafeteira, null);
			jPanelEstado.add(getCmbCafeteira(), null);
		}
		return jPanelEstado;
	}

	/**
	 * This method initializes bntSimular
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBntSimular() {
		if (btnSimular == null) {
			btnSimular = new JButton();
			btnSimular.setBounds(new Rectangle(12, 164, 679, 40));
			btnSimular.setText("Simular");
			btnSimular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String resposta = controlador.executaOps(cmbCafeteira
							.getSelectedItem().toString(), cmbCopos
							.getSelectedItem().toString(), cmbTamanho
							.getSelectedItem().toString(), cmbTipo
							.getSelectedItem().toString(), cmbNivelAgua
							.getSelectedItem().toString(), cmbTemperaturaAgua
							.getSelectedItem().toString(), cmbNivelPoCafe
							.getSelectedItem().toString(), cmbNivelGraoCafe
							.getSelectedItem().toString(), cmbNivelAcucar
							.getSelectedItem().toString());

					JOptionPane.showMessageDialog(null, resposta);
				}
			});

		}
		return btnSimular;
	}

	/**
	 * This method initializes cmbNivelAgua
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbNivelAgua() {

		if (cmbNivelAgua == null) {
			String[] agua = { "completar", "bom", "demais" };
			cmbNivelAgua = new JComboBox(agua);
			// cmbNivelAgua = new JComboBox();
			cmbNivelAgua.setBounds(new Rectangle(139, 30, 141, 20));
		}
		return cmbNivelAgua;
	}

	/**
	 * This method initializes cmbTemperaturaAgua
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbTemperaturaAgua() {
		if (cmbTemperaturaAgua == null) {
			String[] temperatura = { "fria", "quente", "vapor" };
			cmbTemperaturaAgua = new JComboBox(temperatura);
			// cmbTemperaturaAgua = new JComboBox();
			cmbTemperaturaAgua.setBounds(new Rectangle(139, 49, 141, 20));
		}
		return cmbTemperaturaAgua;
	}

	/**
	 * This method initializes cmbNivelPoCafe
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbNivelPoCafe() {
		if (cmbNivelPoCafe == null) {
			String[] po = { "completar", "bom", "demais" };
			cmbNivelPoCafe = new JComboBox(po);
			// cmbNivelPoCafe = new JComboBox();
			cmbNivelPoCafe.setBounds(new Rectangle(139, 68, 141, 20));
		}
		return cmbNivelPoCafe;
	}

	/**
	 * This method initializes cmbNivelGraoCafe
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbNivelGraoCafe() {
		if (cmbNivelGraoCafe == null) {
			String[] grao = { "completar", "bom", "demais" };
			cmbNivelGraoCafe = new JComboBox(grao);
			// cmbNivelGraoCafe = new JComboBox();
			cmbNivelGraoCafe.setBounds(new Rectangle(139, 86, 141, 20));
		}
		return cmbNivelGraoCafe;
	}

	/**
	 * This method initializes cmbNivelAcucar
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbNivelAcucar() {
		if (cmbNivelAcucar == null) {
			String[] acucar = { "completar", "bom", "demais" };
			cmbNivelAcucar = new JComboBox(acucar);
			// cmbNivelAcucar = new JComboBox();
			cmbNivelAcucar.setBounds(new Rectangle(139, 107, 141, 20));
		}
		return cmbNivelAcucar;
	}

	/**
	 * This method initializes cmbCopos
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbCopos() {
		if (cmbCopos == null) {
			String[] copos = { "1", "2" };
			cmbCopos = new JComboBox(copos);
			// cmbCopos = new JComboBox();
			cmbCopos.setBounds(new Rectangle(80, 37, 95, 20));
		}
		return cmbCopos;
	}

	/**
	 * This method initializes cmbTamanho
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbTamanho() {
		if (cmbTamanho == null) {
			String[] tamanho = { "copinho", "grande" };
			cmbTamanho = new JComboBox(tamanho);
			// cmbTamanho = new JComboBox();
			cmbTamanho.setBounds(new Rectangle(80, 58, 95, 20));
		}
		return cmbTamanho;
	}

	/**
	 * This method initializes cmbTipo
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbTipo() {
		if (cmbTipo == null) {
			String[] tipoCafe = { "amargo", "medio", "forte" };
			cmbTipo = new JComboBox(tipoCafe);
			// cmbTipo = new JComboBox();
			cmbTipo.setBounds(new Rectangle(80, 77, 95, 20));
		}
		return cmbTipo;
	}


	/**
	 * This method initializes cmbCafeteira
	 * 
	 * @return javax.swing.JComboBox
	 */
	private JComboBox getCmbCafeteira() {
		if (cmbCafeteira == null) {
			String[] cafeteira = { "on", "off" };
			cmbCafeteira = new JComboBox(cafeteira);
			// cmbCafeteira = new JComboBox();
			cmbCafeteira.setBounds(new Rectangle(70, 71, 92, 20));
		}
		return cmbCafeteira;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JanelaPrincipal thisClass = new JanelaPrincipal();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public JanelaPrincipal() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(716, 263);
		this.setContentPane(getJContentPane());
		this.setTitle("Cafeteira");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJPanelOpcoes(), null);
			jContentPane.add(getJPanelIngredientes(), null);
			jContentPane.add(getJPanelEstado(), null);
			jContentPane.add(getBntSimular(), null);
		}
		return jContentPane;
	}

} // @jve:decl-index=0:visual-constraint="10,10"
