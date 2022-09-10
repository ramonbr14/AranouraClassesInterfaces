package ifam.com.aranoua.tratamentoexcecao;

class ThrowsDemo{
	static void demoThrows() throws IllegalAccessException{
		System.out.println("Identificada dentro de demoThrows");
		//gera a exce��o
		throw new IllegalAccessException("DEMO");
	}
	public static void main(String args[]){
		try{
			demoThrows();
		}catch(IllegalAccessException e){
			System.out.println("Identificada novamente: "+e);
		}
	}
}