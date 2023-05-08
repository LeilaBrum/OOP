package Organiza_Cidade;

public class Prefeitura {
	public static void main(String args[]) {
		Regiao_de_Santos r = new Regiao_de_Santos();
		Bairro_de_Santos b = new Bairro_de_Santos();
		Cidade_de_Santos c = new Cidade_de_Santos();
		
		b.setBairro("Jardim Radio Club");
		b.setRegiao("Zona Noroeste");
		b.setRua("Álvaro Guimarães");
		b.setPopulacao(1000000);
		
		System.out.println("Bairro: " + b.getBairro());
		System.out.println("Região: " + b.getRegiao());
		System.out.println("Rua: " + b.getRua());
		System.out.println("População: " + b.getPopulacao());
		
		r.setRegiao("Zona Leste");
		r.setBairro("Marapé");
		r.setPopulacao(99000);
		
		System.out.println("Bairro: " + r.getBairro());
		System.out.println("Região: " + r.getRegiao());
		System.out.println("População: " + r.getPopulacao());
		
		c.setRegiao("Região Central");
		c.setPopulacao(20000);
		
		System.out.println("Região: " + c.getRegiao());
		System.out.println("População: " + c.getPopulacao());
	}
}
