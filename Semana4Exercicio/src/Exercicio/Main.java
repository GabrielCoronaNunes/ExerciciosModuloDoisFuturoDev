package Exercicio;

public class Main {
    public static void main(String[] args) {
    Vendedor otaviano = new Vendedor(50d);
    Produto sabao = new Produto("Sabão", 3d);
    Produto galaoAgua = new Produto("Galão de água", 10d);
    Produto cigarro = new Produto("Cigarro", 10d);
    otaviano.adicionarProduto(sabao);
    otaviano.adicionarProduto(galaoAgua);


otaviano.adicionarProduto(sabao);
otaviano.receberSalario();
otaviano.venda(cigarro);

    }
}
