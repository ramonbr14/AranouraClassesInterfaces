package ifam.com.aranoua.estudoInterface;

public abstract class Empregado {
	private String PrimNome = "";
	private String UltNome = "";
	
	public Empregado(String primeiro, String ultimo) {
		PrimNome = primeiro;
		UltNome = ultimo;
	}
	
	public String getPrimNome(){
		return PrimNome;
	}
}
