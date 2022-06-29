package estudo.alura.abordagem4;

//Gerente eh um FuncionarioAutenticavel, Gerente herda da classe FuncionarioAutenticavel

public class Gerente extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }
}