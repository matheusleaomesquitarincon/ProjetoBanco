package noobank;
public class ContaEspecial extends Conta {
    private double taxaCredito;

    public void cobrarJuros() {
        if (getSaldo() < 0) {
            setSaldo(getSaldo() * (1 + taxaCredito));
        }
    }

   
    public double sacar(double valor) {
        setSaldo(getSaldo() - valor); 
        return valor;
    }

    public double getTaxaCredito() {
        return taxaCredito;
    }

    public void setTaxaCredito(double taxa) {
        this.taxaCredito = taxa;
    }
}

