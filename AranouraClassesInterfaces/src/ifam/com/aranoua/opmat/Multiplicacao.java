package ifam.com.aranoua.opmat;

public class Multiplicacao extends Object implements OperacaoMatematica {
	protected int a,b;
	
	public Multiplicacao() {
	
	}

	@Override
	public int calcula(int a, int b) {
		
		return a*b;
	}

}
