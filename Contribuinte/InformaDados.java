package Contribuinte;

import javax.swing.JOptionPane;

public class InformaDados {
    public static void main(String[] args) {
        DadosContribuinte a = new DadosContribuinte();

        String nm, cp, cpj, cart;

        nm = JOptionPane.showInputDialog("Digite o nome: ");
        a.setNome(nm);

        cp = JOptionPane.showInputDialog("Digite o CPF: ");
        a.setCPF(cp);

        cpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
        a.setCNPJ(cpj);

        cart = JOptionPane.showInputDialog("Digite o cartão: ");
        a.setCartao(cart);

        System.out.println("Nome do contribuinte: " + a.getNome());
        System.out.println("CPF do contribuinte: " + a.getCPF());
        System.out.println("CNPJ do contribuinte:" + a.getCNPJ());
        System.out.println("Cartão do contribuinte: " + a.getCartao());

        /*
         * a.setNome("Leila Brum");
         * a.setCPF("000.111.222-33");
         * a.setCNPJ("444 555 /0001");
         * a.setCartao("9776-J");
         */
    }
}
