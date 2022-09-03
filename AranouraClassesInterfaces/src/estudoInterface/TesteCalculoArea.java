package estudoInterface;

public class TesteCalculoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo t = new Triangulo(3,9);
		Retangulo r = new Retangulo(2,6);
		
		System.out.println("A area do Triangulo é: "+t.area());
		System.out.println("A area do Retangulo é: "+r.area());

	}

}
