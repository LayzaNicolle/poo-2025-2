public class LocadoraEstoque {
    public static void main(String[] args) {
        //criando a locadora
        Locadora minhaLocadora = new Locadora("Locadora Central");

        //criando filmes com diferentes construtores
        Filme filme1 = new Filme("Matrix", "Ficção Científica", 1999);
        Filme filme2 = new Filme("O Poderoso Chefão", "Drama", 1972);
        Filme filme3 = new Filme("Filme Misterioso", "Desconhecido"); // usando o construtor com apenas o título

        minhaLocadora.adicionarFilme(filme1);
        minhaLocadora.adicionarFilme(filme2);
        minhaLocadora.adicionarFilme(filme3);

        // Listando os filmes
        minhaLocadora.listarFilmes();
    }
}
