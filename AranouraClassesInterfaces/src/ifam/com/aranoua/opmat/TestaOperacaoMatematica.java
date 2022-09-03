package ifam.com.aranoua.opmat;
import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class TestaOperacaoMatematica {

	public static void main(String[] args) {
		
		
		String op = menu();
		int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro valor","Opera��es Matem�ticas: A Miss�o",JOptionPane.DEFAULT_OPTION));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo valor","Opera��es Matem�ticas: A Miss�o",JOptionPane.DEFAULT_OPTION));
		
		//String message = casos(op,x,y);
		JOptionPane.showMessageDialog(null, casos(op,x,y),"RESPOSTA",1);
		
}
	public static String menu() {
		String message = "Digite a opera��o que deseja \n"
				+ "1 - Soma \n"
				+ "2 - Subtra��o \n"
				+ "3 - multipli��o \n"
				+ "4 - divi��o \n";
		String op = JOptionPane.showInputDialog(null,message,"Opera��es Matem�ticas: A Miss�o",JOptionPane.QUESTION_MESSAGE);
		return op;
	}
	
	public static String casos(String op, int x, int y) {
		String message;
		switch (op) {
		case "1":
			Soma soma = new Soma();
			message = "Soma de " + x + " + " + y + " � igual a "+ soma.calcula(x, y);
			break;
		case "2":
			Subtracao subt = new Subtracao();
			message = "Subtra��o de " + x + " - " + y + " � igual a "+ subt.calcula(x, y);
			break;
		case "3":
			Multiplicacao mult = new Multiplicacao();
			message = "Multipli��o de " + x + " X " + y + " � igual a "+ mult.calcula(x, y);
			break;
		case "4":
			Divisao divi = new Divisao();
			message = "Divis�o de " + x + " / " + y + " � igual a "+ divi.calcula(x, y);
			break;
		default:
			message = "PROGRAMA ENCERRADO";
			break;
		}
	return message;
	}
	
}
	