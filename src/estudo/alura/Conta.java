package estudo.alura;

class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    String titular;

    void deposita(double valor){
        this.saldo += valor;
    }
}
