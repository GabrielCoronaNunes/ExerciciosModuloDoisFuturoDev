package exercicios;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa("Gabriel", 21, "Brasil");

        Pessoa pessoaClonada = pessoaUm.clonePessoa();
        pessoaClonada.printPessoa();
    }
}
