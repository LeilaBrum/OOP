package Cinemas;

public class Consulta_Cinemas {
	public static void main (String args[]) {
		// Cine_Roxy roxy = new Cine_Roxy();
		Cine_Caiçara caiçara = new Cine_Caiçara ("Antigo cinema da " + "Av. Conselheiro Nébias - Boqueirão");
		
		caiçara.setLocalizacao("Avenida Conselheiro Nébias com a praia");
		caiçara.setNome("Cine Caiçara");
		System.out.println("O " + caiçara.getNome() + " ficava na esquina da: " + caiçara.getLocalizacao());
		
		// roxy.setLocalizacao("Avenida Conselheiro Nébias com a praia");
		// roxy.setNome("Cine Caiçara");
		// System.out.println("O " + roxy.getNome() + " fica na: " + roxy.getLocalizacao());
		
		Cine_Cinemark mark = new Cine_Cinemark("Cinemark");
		mark.setLocalizacao("Rua Alexandre Martins, 80 - Aparecida");
		mark.setNomeShopping("Cinemark");
		System.out.println("O " + mark.getNomeCinema() + " fica na " + mark.getLocalizacao());
	}
}
