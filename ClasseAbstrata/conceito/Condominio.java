package conceito;

public class Condominio extends Conceito {
	protected String getNome_Condominio() {
		return "Vila Nova";
	}
	
	protected double calcula_condominio(double a) {
		return a*1.066;
	}
	
	public void endereço_condomínio(){
		System.out.println("Rua A, nº 22");
	}
}
