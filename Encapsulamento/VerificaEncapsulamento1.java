package Encapsulamento;

public class VerificaEncapsulamento1 {
    public static void main(String args[]) {
        AcessoNumeros chave = new AcessoNumeros();

        chave.a = 10;
        chave.b = 20;
        // chave.c = 30; não é possivel acessar variável private diretamente
        chave.setNumero("c", 30);
        chave.d = 40;
        chave.mostra_numero();
    }
}