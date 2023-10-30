package exemplocontabancaria;

public class ContaBancaria {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numeroConta,
                         String nome,
                         double saldo) {
        this.saldo = saldo;
        this.nomeCliente = nome;
        this.numeroConta = numeroConta;
    }

    public boolean saque(double valor) {
        this.saldo -= valor;
        return true;
    }

    public boolean deposito(double valor) {
        if (valor > 0){
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public double saldo() {
        return this.saldo;
    }
}
