package estudo.alura.abordagem4;

public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        //Gerente g1 = new Funcionario(); nao funciona
        g1.setNome("Marcos");

        //g1.autentica(2222) nao funciona
        String nome = g1.getNome();
        System.out.println(nome);
    }
}
