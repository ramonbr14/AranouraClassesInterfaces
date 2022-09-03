package estudoInterface;

public abstract class Figura2d {
	double base;
	double altura;
	
	Figura2d(double b, double a) {
		base = b;
		altura = a;
	}
	abstract double area();
}
