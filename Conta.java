package noobank;
public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public Conta(double depositoInicial) {
        this.saldo = depositoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return valor;
        } else {
            double retirado = saldo;
            saldo = 0;
            return retirado;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}
