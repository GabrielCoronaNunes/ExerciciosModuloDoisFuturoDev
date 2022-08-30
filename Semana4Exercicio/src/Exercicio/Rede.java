package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Rede {
    private List<Filial> filiais;
    private String nome;
    private  String cnpj;
    private String endereco;

    public Rede (String nome, String cnpj, String endereco){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        filiais = new ArrayList<>();
    }

    public void adicionarFilial(Filial filial){
        filiais.add(filial);
    }
}
