package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Vendedor implements Funcionario {

    private Double valorBase = 10d;
    private Double horasTrabalhadas;
    private Double salario = 0d;
    private List<Produto> produtosVendidos;

    public Vendedor(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.produtosVendidos = new ArrayList<>();
    }

    @Override
    public void baterPonto() {
        horasTrabalhadas += 8;
        System.out.println("Ponto batido");
    }

    ;


    @Override
    public void receberSalario() {
        salario += horasTrabalhadas * valorBase;
        System.out.println("O salário foi: " + salario);
    }

    ;

    public void venda(Produto produto) {
        if (produtosVendidos.contains(produto)) {
            salario += produto.getValor() * 0.1;
        } else {
            System.out.println("Produto não vendido.");
        }
    }

    public void adicionarProduto(Produto produto) {
        produtosVendidos.add(produto);
    }



}
