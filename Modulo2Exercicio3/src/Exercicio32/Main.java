package Exercicio32;

public class Main {
    public static void main(String[] args) {
        Autor gustavoCorcao = new Autor("Gustavo Corção", "gustavocorção@gmail.com");
        Box colecaoGustavoCorcao = new Box("Coleção Gustavo Corção", 50.0);
        Livro tresAlqueireseUmaVaca = new Livro("Três Alqueires e uma vaca", "Esta é, " +
                "sobretudo, uma biografia de Chesterton escrita à maneira de Chesterton. " +
                "A partir das três idéias centrais do pensamento chestertoniano - mistério," +
                " fidelidade e propriedade -, Gustavo Corção desenvolve suas reminiscências pessoais e suas" +
                " páginas de crítica, que são misturadas a conceitos sobre liberdade, democracia, Estado, nação," +
                " socialismo, capitalismo, entre outros.",
                gustavoCorcao, "6587138063", 57.99);
        Ebook licoesDeAbismo = new Ebook("Lições de Abismo", "Lições de Abismo é o único romance do escritor " +
                "brasileiro Gustavo Corção, considerado por muitos críticos literários como a sua obra-prima." +
                " Sobre ele, disse o poeta Menotti del Picchia: “Creio, sem temor de exagerar, ter lido o maior" +
                " livro de ficção que já se escreveu no Brasil”. O romance também foi responsável pela seguinte " +
                "declaração de Oswald de Andrade sobre Corção: “Depois de Machado de Assis aparece agora um " +
                "mestre do romance brasileiro”.",
                gustavoCorcao, "9788595070349", 55.99, 23.98);
        Livro aDescobertaDoOutro = new Livro("A Descoberta do Outro",
                "A Descoberta do Outro é o primeiro livro de Gustavo Corção," +
                        " publicado originalmente em 1944, e um clássico da literatura brasileira. " +
                        "É o relato do autor do processo que passou de descoberta da própria miséria e " +
                        "busca pela entrega total de si à verdadeira Caridade.", gustavoCorcao, "8595070237", 51.0);
        Livro doisAmoresDuasCidades = new Livro("Dois Amores, Duas Cidades", "Este livro versa sobre os" +
                " passos e as experiências do homem em busca de um mundo melhor ou em busca de si mesmo" +
                ". O autor quis esboçar o mapa cultural da civilização ocidental moderna e estudar" +
                " com atenção as correntes de idéias, os erros e os extravios que enchem de sinais o" +
                " testamento da grande civilização de que todos somos egressos.", gustavoCorcao, "8595070695",
                97.38);

     //   colecaoGustavoCorcao.adicionarLivro(tresAlqueireseUmaVaca, aDescobertaDoOutro, doisAmoresDuasCidades);
       // colecaoGustavoCorcao.adicionarLivro(licoesDeAbismo);
       // colecaoGustavoCorcao.conferirPreco();
       // System.out.println(aDescobertaDoOutro.toString());
       // System.out.println(licoesDeAbismo.toString());
       // colecaoGustavoCorcao.conferirPreco();
        colecaoGustavoCorcao.adicionarLivro(tresAlqueireseUmaVaca,aDescobertaDoOutro,doisAmoresDuasCidades  );
        colecaoGustavoCorcao.conferirPreco();

    }
}
