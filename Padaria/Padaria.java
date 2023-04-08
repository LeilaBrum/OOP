public class Padaria {
	private String produto;
	private int quant;
	private double preco;
	private static String tipo;
	
	public void setProduto (String produto) {
		this.produto = produto;	}
	public void setQuantidade (int quant) {
		this.quant = quant;	}
	public void setPreco (double preco) {
		this.preco = preco;	}
	
	public String getProduto() {
		return produto;	}
	public int getQuantidade() {
		return quant; }
	public double getPreco () {
		return preco; }
	
	static {
		tipo = "Pao"; }
	
	public void mostraTipo () {
		System.out.println("Tipo: " + tipo);
	}
	
}
