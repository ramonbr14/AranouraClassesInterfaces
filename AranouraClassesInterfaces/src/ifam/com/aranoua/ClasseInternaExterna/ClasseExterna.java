package ifam.com.aranoua.ClasseInternaExterna;

class ClasseExterna {
	private String nome = "variable privada da classe externa";
		class ClasseInterna{
			public void acesso() {
				System.out.println("Acesso pegou a "+ nome);
			}
	}
}
