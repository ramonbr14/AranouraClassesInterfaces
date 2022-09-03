package ifam.com.aranoua.opmat;

public class Divisao extends Object implements OperacaoMatematica {
	
	public Divisao() {
	}

	@Override
	public int calcula(int a, int b) {
		int c;
		try {
			c = a/b;
		} catch (Exception e) {
			c = 0;
		}
		
		return c;
	}
}