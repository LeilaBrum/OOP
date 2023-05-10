package Cinemas;

public class Cinemas_Shopping extends Cinemas_Santos{
	private String nome_cinema;
	
	Cinemas_Shopping(String shopping){
		System.out.println("\nO shopping " + shopping + " cinema fica no Praiamar.");
	}
	
	public void setNomeShopping(String nome_cinema) {
		this.nome_cinema = nome_cinema;
	}
	
	public String getNomeCinema() {
		return nome_cinema;
	}
}
