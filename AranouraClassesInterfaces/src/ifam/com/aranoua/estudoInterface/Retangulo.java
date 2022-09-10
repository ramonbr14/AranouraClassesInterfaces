package ifam.com.aranoua.estudoInterface;

import javax.swing.JOptionPane;

public class Retangulo extends Figura2d{
	Retangulo(double b, double a) {
		super(a,b);//invocando o construtor da superclasse
	}
	double area() {
		JOptionPane.showConfirmDialog(null, "Calculando area do Retangulo","Aviso",JOptionPane.INFORMATION_MESSAGE);
		return base*altura;
	}
}
