package noobank;
public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public void aplicarJuros() {
        setSaldo(getSaldo() * (1 + taxaJuros));
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
}
