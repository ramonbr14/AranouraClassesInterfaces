package ifam.com.aranoua.tratamentoexcecao;

public class ThrowDemo {
	static void demoThrow(){
		try{
			//gera uma exce��o
			throw new NullPointerException("DEMO");
		}catch(NullPointerException e){
			System.out.println("Identificada dentro de demoThrow");
			//gera novamente a mesma exce��o
			throw e;
		}
	}
	public static void main(String args[]){
		try{
			demoThrow();
		}catch(NullPointerException e){
			System.out.println("Identificada novamente: "+e);
		}
	}
}