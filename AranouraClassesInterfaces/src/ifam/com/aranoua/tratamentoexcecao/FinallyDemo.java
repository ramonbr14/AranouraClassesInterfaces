package ifam.com.aranoua.tratamentoexcecao;

class FinallyDemo{
	static void metodoA(){
		try{
			System.out.println("dentro do metodo A");
			throw new RuntimeException("DEMO");
		}finally{
			System.out.println("dentro finally do metodoA");
		}
	}
	
	static void metodoB(){
		try{
			System.out.println("dentro do metodo B");
			return;
		}finally{
			System.out.println("dentro finally do metodoA");
		}
	}
	static void metodoC(){
		try{
			System.out.println("dentro do metodo C");
		}finally{
			System.out.println("dentro finally do metodoC");
		}
	}
	
	public static void main(String args[]){
		try{
			metodoA();
		}catch(Exception e){
			System.out.println("Exceção identificada");
		}
		metodoB();
		metodoC();
	}
}