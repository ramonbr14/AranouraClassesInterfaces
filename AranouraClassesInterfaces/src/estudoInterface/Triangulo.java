package estudoInterface;

import javax.swing.JOptionPane;

public class Triangulo extends Figura2d {
	Triangulo(double b, double a) {
		super(a,b);//invocando o construtor da superclasse
	}
	double area() {
		JOptionPane.showConfirmDialog(null, "Calculando area do Triangulo","Alerta!!!!",JOptionPane.INFORMATION_MESSAGE);
		return (base*altura)/2;
	}
}
