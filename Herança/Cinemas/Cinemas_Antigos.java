package Cinemas;

public class Cinemas_Antigos extends Cinemas_Santos {
	private String nome;
	
	Cinemas_Antigos(String antigo){
		System.out.println("História dos cinemas de Santos\n" + antigo);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
