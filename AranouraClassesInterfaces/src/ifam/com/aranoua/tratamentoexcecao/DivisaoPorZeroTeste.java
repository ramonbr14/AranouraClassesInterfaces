package ifam.com.aranoua.tratamentoexcecao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

//DEPOIS TU REFAZ ESSA COISA SLIDES DE 137 A 140
public class DivisaoPorZeroTeste  extends JFrame implements ActionListener{
	/*private JTextField TF1, TF2, TF3;
	private int num1, num2;
	private double resultado;

	public DivisaoPorZeroTeste(){

	super("Demonstração de Exceções");
	Container container = getContentPane();
	container.setLayout(new GridLayout(3,2));
	container.add(new JLabel("Entre com o numerador",SwingConstants.RIGHT));
	TF1 = new JTextField(10);
	container.add(TF1);

	Resumo 138

	Tratamento de exceção

	container.add(new JLabel("Entre com o denominador e pressine ENTER",SwingConstants.RIGHT));
	TF2 = new JTextField(10);
	container.add(TF2);
	TF2.addActionListener(this);

	container.add(new JLabel("RESULTADO",SwingConstants.RIGHT));
	TF3 = new JTextField();
	container.add(TF3);

	setSize(425,100);
	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){

		DecimalFormat precisao3 = new DecimalFormat("0;000");
		TF3.setText( "" );
		try{

		num1 = Integer.parseInt(TF1.getText());
		num2 = Integer.parseInt(TF2.getText());
		resultado = quociente(num1,num2);
		TF3.setText(precisao3.format(resultado));

		}catch(NumberFormatException exc){

		JOptionPane.showMessageDialog(this,

		"Voce pode entrar com dois inteiros", "Formato de numero invalido",
		JOptionPane.ERROR_MESSAGE);

		}catch(ArithmeticException exc){

		JOptionPane.showMessageDialog(this,

		exc.toString(), "Exceção aritmética", JOptionPane.ERROR_MESSAGE);

		}

		}
	
	public double quociente(int numerador, int denominador)
			throws DivisaoPorZeroException{
			if(denominador == 0)

			throw new DivisaoPorZeroException();

			return (double)numerador/denominador;

			}
*/
			public static void main(String args[]){

			DivisaoPorZeroTeste application = new DivisaoPorZeroTeste();

			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
}
