package noobank;
public class ContaAplicacao extends Conta {
    private boolean vencida = false;
    private double taxaJuros;
    private double multa = 0.05;

    public boolean estaVencida() {
        return vencida;
    }

    public void vencida() {
        this.vencida = true;
    }

    public void setTaxaJuros(double juro) {
        this.taxaJuros = juro;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }


    public double sacar(double valor) {
        if (!vencida) {
            double multaValor = valor * multa;
            double total = valor + multaValor;
            double retirado = super.sacar(total);
            return retirado >= total ? valor : retirado / (1 + multa);
        } else {
            return super.sacar(valor);
        }
    }
}

