package exercicios;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String localDeOrigem;

    public Pessoa(String nome, Integer idade, String localDeOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.localDeOrigem = localDeOrigem;
    }

    public void envelhecer() {
        idade++;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }
    public void setIdade(Integer idade) {
        this.idade=idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public  void setLocalDeOrigem(String localDeOrigem){
        this.localDeOrigem = localDeOrigem;
    }
    public  void printPessoa(){
        System.out.println("Nome:"+nome+", Idade:"+idade+", Local de Origem:"+localDeOrigem);
    }
    public Pessoa clonePessoa(){
        return  new Pessoa(this.nome, this.idade, this.localDeOrigem);
    }
}
