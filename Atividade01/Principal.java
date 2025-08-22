public class Principal {
    public static void main(String[] args) {
        Departamento d = new Departamento(3, "Depto de Computacao");
        Funcionario f = new Funcionario(123, "Fulano", d);
        System.out.println(f.toString());
    }
}
