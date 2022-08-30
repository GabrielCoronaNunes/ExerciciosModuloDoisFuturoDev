package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class FilialQuixeramobim implements  Filial{
    Gerente gerente;
    List<Funcionario> listaFuncionarios;

    public FilialQuixeramobim(Gerente gerente){
        this.gerente = gerente;
        this.listaFuncionarios = new ArrayList<>();
    }

    @Override
    public void contratarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    };
}
