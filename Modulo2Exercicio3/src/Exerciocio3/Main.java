package Exerciocio3;

public class Main {
    public static void main(String[] args) {

        Medico arthur = new Medico("17/02/2020", "Aliviado", "6969", "Arthur");
        Paciente garibaldo = new Paciente("05/03/2021", "Paranóico", "Garibaldo");
        Financeiro rothschild = new Financeiro("23/02/2020", "Faceiro");
        Enfermeiro joao = new Enfermeiro("03/03/2020", "Decepcionado", "2424", "João");

        arthur.realizarConsultas(garibaldo);
        arthur.receitarTratamentos(garibaldo);
        arthur.operarPaciente(garibaldo);

        joao.tratarPaciente(garibaldo);
        rothschild.pagarSalario(joao);

    }
}
