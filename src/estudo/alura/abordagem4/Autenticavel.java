package estudo.alura.abordagem4;

/*
Contrato Autenticável

    Quem assina esse contrato precisa implementar
    - Método setSenha
    - Método autentica
 */
public abstract interface Autenticavel {

    public void setSenha(int senha);

    public boolean autentica(int senha);
}
