package ifam.com.aranoua.opmat;
import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class TestaOperacaoMatematica {

	public static void main(String[] args) {
		
		
		String op = menu();
		int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro valor","Operações Matemáticas: A Missão",JOptionPane.DEFAULT_OPTION));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo valor","Operações Matemáticas: A Missão",JOptionPane.DEFAULT_OPTION));
		
		//String message = casos(op,x,y);
		JOptionPane.showMessageDialog(null, casos(op,x,y),"RESPOSTA",1);
		
}
	public static String menu() {
		String message = "Digite a operação que deseja \n"
				+ "1 - Soma \n"
				+ "2 - Subtração \n"
				+ "3 - multiplição \n"
				+ "4 - divição \n";
		String op = JOptionPane.showInputDialog(null,message,"Operações Matemáticas: A Missão",JOptionPane.QUESTION_MESSAGE);
		return op;
	}
	
	public static String casos(String op, int x, int y) {
		String message;
		switch (op) {
		case "1":
			Soma soma = new Soma();
			message = "Soma de " + x + " + " + y + " é igual a "+ soma.calcula(x, y);
			break;
		case "2":
			Subtracao subt = new Subtracao();
			message = "Subtração de " + x + " - " + y + " é igual a "+ subt.calcula(x, y);
			break;
		case "3":
			Multiplicacao mult = new Multiplicacao();
			message = "Multiplição de " + x + " X " + y + " é igual a "+ mult.calcula(x, y);
			break;
		case "4":
			Divisao divi = new Divisao();
			message = "Divisão de " + x + " / " + y + " é igual a "+ divi.calcula(x, y);
			break;
		default:
			message = "PROGRAMA ENCERRADO";
			break;
		}
	return message;
	}
	
}
	