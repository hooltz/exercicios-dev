public class ContaBancaria{
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    ContaBancaria(int numeroConta, String nomeTitular, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado na conta " + numeroConta);
    }

    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque na conta " + numeroConta);
        }
    }
}