package estudo.alura.abordagem4;

import com.sun.org.apache.xpath.internal.functions.FuncConcat;

public class TesteReferencias {
    public static void main(String[] args) {
        /*
        Funcionario g1 = new Gerente();
        //Gerente g1 = new Funcionario(); nao funciona
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        //g1.autentica(2222) nao funciona
        String nome = g1.getNome();
        System.out.println(nome);

         */
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}