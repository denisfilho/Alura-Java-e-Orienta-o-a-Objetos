package estudo.alura.abordagem5;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar =  valor + 0.2;
        return super.saca(valorASacar);
    }
}
