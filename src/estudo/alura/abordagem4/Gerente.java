package estudo.alura.abordagem4;

//Gerente eh um Funcionario, Gerente herda da classe Funcionario, assina o contrato autenticável

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;
    }
}