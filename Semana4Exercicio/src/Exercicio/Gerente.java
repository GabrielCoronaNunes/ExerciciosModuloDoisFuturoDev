package Exercicio;

public class Gerente implements Funcionario {
    private Double valorBase = 11d;
    private Double horasTrabalhadas;
    private Double salario = 0d;

    public Gerente(Double horasTrabalhadas, Double salario) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = salario;
    }

    @Override
    public void baterPonto() {
        System.out.println("Ponto batido");
        horasTrabalhadas += 8;
    }

    ;

    public void receberSalario() {
        salario += horasTrabalhadas * valorBase;

    }

    ;
}
