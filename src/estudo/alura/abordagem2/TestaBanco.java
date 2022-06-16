package estudo.alura.abordagem2;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222.-22";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        //associa o cliente paulo para a conta contaDoPaulo
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular);
        System.out.println(contaDoPaulo.titular.nome);
    }
}
