package ifam.com.aranoua.tratamentoexcecao;

public class MinhaExcesaoDemo {
	
	static void registra(int a) throws MinhaExcecao{
		System.out.println("registrando codigo = "+a);
		if(a>10)throw new MinhaExcecao(a);
		System.out.println("codigo = "+a+" registrado");
	}
	
	public static void main(String[] args) {
		try {
			registra(5);
			registra(29);
		}catch(MinhaExcecao e) {
			System.out.println("Excecao identificada: "+e);
		}
	}
}
