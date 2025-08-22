public class Funcionario {
    private int mat;
    private String nome;
    private Departamento dept;

    public Funcionario(int mat, String nome, Departamento dept) {
        this.mat = mat;
        this.nome = nome;
        this.dept = dept;
    }

    public int getMat() {
        return mat;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDept() {
        return dept;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String toString() {
        return getNome() + " " + getMat() + " " + getDept();
    }
}
