package ifam.com.aranoua.ClasseInternaExterna;

public interface Teste {
	public void beta();
}
/*
class ClasseExterna{
	Teste t = new Teste() {
		public void beta() {
			System.out.println("Classe interna que implementa uma interface.");
		}
	};
	
	public void alfa(Teste p) {
			System.out.println("A classe anonima como argumento de metodo.");
	}
}

class Implementa{
	public static void main(String [] args){
		ClasseExterna ce = new ClasseExterna();
		ce.t.beta();
		Implementa i = new Implementa();
		i.gama();
		Runnable r = new Runnable(){public void run(){}};
		System.out.println(new Runnable(){public void run(){}});
		System.out.println(new Teste(){public void beta(){}});

		}
		public void gama(){

		ClasseExterna ce2 = new ClasseExterna();
		ce2.alfa(new Teste(){public void beta(){System.out.println("XXXX");}});
	}
}


//Ver Slide entre 110 e 115*/