package MetodoGetSet;

import javax.swing.JOptionPane;

public class Concessionaria {
    public static void main(String[] args) {
        Automovel a = new Automovel();

        String mr, md, cr, pr;
        double pc;

        mr = JOptionPane.showInputDialog("Digite a marca: ");
        a.setMarca(mr);

        md = JOptionPane.showInputDialog("Digite o modelo: ");
        a.setModelo(md);

        cr = JOptionPane.showInputDialog("Digite a cor: ");
        a.setCor(cr);

        pr = JOptionPane.showInputDialog("Digite o preço: ");
        pc = Double.parseDouble(pr);

        a.setPreco(pc);

        System.out.println("Marca: " + a.getMarca());
        System.out.println("Modelo: " + a.getModelo());
        System.out.println("Cor:" + a.getCor());
        System.out.println("Preço: " + a.getPreco());

    }
}
