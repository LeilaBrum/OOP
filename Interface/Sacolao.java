public class Sacolao {
	public static void main (String args[]) {
		Imprementa_Interface a = new Imprementa_Interface();
		a.fruta_citrica = "laranja";
		a.fruta_vermelha = "maçã";
		
		System.out.println("Fruta cítrica: " + a.identifica_fruta(a.fruta_citrica));
		System.out.println("Fruta vermelha: " + a.identifica_fruta(a.fruta_vermelha));
		System.out.println("Quantidade de frutas: " + a.quantidade_frutas(12));
		System.out.println("Preço por kilo: R$ " + a.preco_kilo(5.66));
	}
}
