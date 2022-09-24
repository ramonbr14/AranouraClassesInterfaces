package ifam.com.aranoua.tratamentoexcecao;

public class MinhaExcecao extends Exception{
	private int codigo;
	public MinhaExcecao(int cod) {
		codigo = cod;
	}
	public String toString(){
		return "MinhaExcecao, codigo ="+ codigo;
	}
}
