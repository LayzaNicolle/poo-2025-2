import java.util.ArrayList;

public class Locadora{
    private String nome;
    private ArrayList<Filme> filmes;

    //construtor
    public Locadora(String nome){
        this.nome = nome;
        this.filmes = new ArrayList<>();
    }

    //adicionando um Filme
    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }

    //listar filmes
    public void listarFilmes(){
        System.out.println("Filmes cadastrados na locadora " + nome + ":");
        for (Filme f : filmes) {
            System.out.println(f.toString());
        }
    }
}