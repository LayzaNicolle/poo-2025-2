public class Filme{
    private String titulo;
    private String genero;
    private int anoLancamento;

    //construtor que vai receber todos os atributos
    public Filme(String titulo, String genero, int anoLancamento){
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;

    }

    //construtor de sobrecarga
    public Filme(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = 0;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    //método toString
    public String toString(){
        return "Filme: " + titulo + 
        "\nGênero: " + genero +
        "\nAno de Lançamento: " + (anoLancamento == 0 ? "Indefinido" : anoLancamento);
    }

}