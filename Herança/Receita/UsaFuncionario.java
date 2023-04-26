package Herança.Receita;
import javax.swing.JOptionPane;
public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        PessoaJuridica pessoajuridica = new PessoaJuridica();

        String u,v,t,z;
        int x;

        z = JOptionPane.showInputDialog("Digite 1 para pessoa FISICA\n Digite 2 para pessoa JURÍDICA");
        x = Integer.parseInt(z);

        if (z.length()==1){
            switch (x){
                case 1: {u = JOptionPane.showInputDialog("Nome do contribuinte:");
                    v = JOptionPane.showInputDialog("RG do contribuinte:");
                    t = JOptionPane.showInputDialog("Cartão do contribuinte");
                
                    funcionario.setNome(u);
                    funcionario.setRG(v);
                    funcionario.setCartao(t);
                    
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("RG: " + funcionario.getRG());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    
                    break;
                }

                case 2: {u = JOptionPane.showInputDialog("Nome do contribuinte:");
                    v = JOptionPane.showInputDialog("CNPJ do contribuinte:");
                    t = JOptionPane.showInputDialog("Cartão do contribuinte");
                
                    funcionario.setNome(u);
                    func.setCnpj(v);
                    funcionario.setCartao(t);
                    
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("RG: " + func.getCnpj());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    
                    break;}
            }
        }
    }
}
