public class Banco {
    private Cliente[] clientes;

    // Getter para o vetor de clientes
    public Cliente[] getClientes() {
        return clientes;
    }

    // Método para cadastrar os clientes
    public void cadastraClientes() {
        clientes = new Cliente[2];

        Cliente c1 = new Cliente("Alan Turing", "1289", 1500, 25896);
        Cliente c2 = new Cliente("Ada Love", "98765431", 12345);

        clientes[0] = c1;
        clientes[1] = c2;
    }

    // Método com as operações solicitadas
    public String operacoes() {
        // Saque R$100 de cada cliente
        for (Cliente cliente : clientes) {
            cliente.saque(100);
        }

        // Depósito de R$50 na conta de cada cliente
        for (Cliente cliente : clientes) {
            cliente.deposito(50);
        }

        // Verificar extrato e modificar se necessário
        for (Cliente cliente : clientes) {
            if (cliente.extrato() < 0) {
                cliente.setSaldo(50);
            }
        }

        // Alterar nome do cliente 2
        clientes[1].setNome("Ada Lovelace");

        // Alterar CPF do cliente 1
        clientes[0].setCpf("12345689");

        // Montar a string final com os dados
        String resultado = "";
        for (Cliente cliente : clientes) {
            resultado += cliente.toString() + "\n";
        }

        return resultado;
    }
}
