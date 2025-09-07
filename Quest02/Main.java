public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.cadastraClientes();

        String resultado = banco.operacoes();
        System.out.println(resultado);
    }
}
