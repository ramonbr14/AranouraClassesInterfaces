package ifam.com.aranoua.tratamentoexcecao;

public class ExcecaoDemo {

	public static void main(String[] args) {
		int i,a;
		for(i=5;i>=0;i--) {
			try {
				//Monitora o bloco do codigo
				System.out.println("Dividindo 35 por "+i+"...");
				a = 35/i;
				System.out.println("35/"+i+" = "+a);
			}catch(ArithmeticException e){
				//Verifica Divisão por zero
				System.out.println("Erro! Divisão por zero!");
			}
		}

	}

}
