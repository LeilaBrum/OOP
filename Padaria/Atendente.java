import javax.swing.JOptionPane;
public class Atendente {
	public static void main (String args []) {
		Padaria a = new Padaria();
		
		String pr, qt, vl;
		int b;
		double c;
		
		pr = JOptionPane.showInputDialog("Digite o produto: ");
		qt = JOptionPane.showInputDialog("Digite a quantidade: ");
		b = Integer.parseInt(qt);
		vl = JOptionPane.showInputDialog("Digite o Preço: ");
		c = Double.parseDouble(vl);
		
		a.setProduto(pr);
		a.setQuantidade(b);
		a.setPreco(c);
		
		System.out.println("Produto: " + a.getProduto());
		System.out.println("Quantidade: " + a.getQuantidade());
		System.out.println("Preco: " + a.getPreco());
		a.mostraTipo();
	}
}
