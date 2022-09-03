package ifam.com.aranoua.opmat;

public class Subtracao extends Object implements OperacaoMatematica {
		
	public Subtracao() {
		
	}

	@Override
	public int calcula(int a, int b) {
		return a-b;
	}
}
