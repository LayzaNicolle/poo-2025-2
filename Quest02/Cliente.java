public class Cliente {
    private String nome;
    private String cpf;
    private int saldo;
    private int numConta;

    // Construtor com saldo inicial
    public Cliente(String nome, String cpf, int saldo, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    // Construtor com saldo zerado
    public Cliente(String nome, String cpf, int numConta) {
        this(nome, cpf, 0, numConta);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public int getSaldo() { return saldo; }
    public void setSaldo(int saldo) { this.saldo = saldo; }

    public int getNumConta() { return numConta; }
    public void setNumConta(int numConta) { this.numConta = numConta; }

    // Método para retornar o saldo
    public int extrato() {
        return saldo;
    }

    // Método para saque
    public void saque(int val) {
        if (val <= saldo) {
            saldo -= val;
        }
    }

    // Método para depósito
    public void deposito(int val) {
        saldo += val;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cliente: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "Conta: " + numConta + "\n" +
               "Saldo: " + saldo;
    }
}
