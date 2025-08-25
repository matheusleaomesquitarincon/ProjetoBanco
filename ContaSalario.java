package noobank;
public class ContaSalario extends Conta {
    private double taxa;
    private int cotasMensais;
    private int qtdTransacoes = 0;

    public void calcularTaxas() {
        int excesso = qtdTransacoes - cotasMensais;
        if (excesso > 0) {
            double multa = excesso * taxa;
            setSaldo(getSaldo() - multa);
        }
    }

   
    public double sacar(double valor) {
        qtdTransacoes++;
        return super.sacar(valor);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getCotasMensais() {
        return cotasMensais;
    }

    public void setCotasMensais(int cotas) {
        this.cotasMensais = cotas;
    }

    public int getQtdTransacoes() {
        return qtdTransacoes;
    }
}
