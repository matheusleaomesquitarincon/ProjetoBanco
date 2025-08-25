package noobank;

public class Code {
	class ContaPoupanca extends ContaBancaria {
		 private double taxaJuros;

		 public void aplicarJuros() {
		     double juros = getSaldo() * taxaJuros;
		     depositar(juros);
		 }

		 public void setTaxaJuros(double taxaJuros) {
		     this.taxaJuros = taxaJuros;
		 }

		 public double getTaxaJuros() {
		     return taxaJuros;
		 }
		}


		class ContaAplicacao extends ContaBancaria {
		 private double taxaJuros;
		 private boolean vencida;

		 public void vencida() {
		     this.vencida = true;
		 }

		 public boolean estaVencida() {
		     return vencida;
		 }

		 public void setTaxaJuros(double taxaJuros) {
		     this.taxaJuros = taxaJuros;
		 }

		 public double getTaxaJuros() {
		     return taxaJuros;
		 }

		 
		 public double sacar(double valor) {
		     double saldo = getSaldo();
		     if (!vencida) {
		         double multa = valor * 0.05;
		         if (valor > saldo) {
		             double retirado = saldo;
		             setSaldo(0);
		             return retirado - (retirado * 0.05);
		         } else {
		             setSaldo(saldo - valor);
		             return valor - multa;
		         }
		     } else {
		         return super.sacar(valor);
		     }
		 }
		}


		class ContaSalario extends ContaBancaria {
		 private double taxa;
		 private int cotasMensais;
		 private int qtdTransacoes;

		 public void setTaxa(double taxa) {
		     this.taxa = taxa;
		 }

		 public double getTaxa() {
		     return taxa;
		 }

		 public void setCotasMensais(int cotas) {
		     this.cotasMensais = cotas;
		 }

		 public int getCotasMensais() {
		     return cotasMensais;
		 }

		 public int getQtdTransacoes() {
		     return qtdTransacoes;
		 }

		 
		 public double sacar(double valor) {
		     double valorSacado = super.sacar(valor);
		     qtdTransacoes++;
		     return valorSacado;
		 }

		 public void calcularTaxas() {
		     int excedente = qtdTransacoes - cotasMensais;
		     if (excedente > 0) {
		         double multa = excedente * taxa;
		         double saldoAtual = getSaldo();
		         setSaldo(saldoAtual - multa);
		     }
		     qtdTransacoes = 0;
		 }
		}


		class ContaEspecial extends ContaBancaria {
		 private double taxaCredito;

		 public void setTaxaCredito(double taxa) {
		     this.taxaCredito = taxa;
		 }

		 public double getTaxaCredito() {
		     return taxaCredito;
		 }

		 
		 public double sacar(double valor) {
		     double saldo = getSaldo();
		     setSaldo(saldo - valor);  
		     return valor;
		 }

		 public void cobrarJuros() {
		     double saldo = getSaldo();
		     if (saldo < 0) {
		         double juros = Math.abs(saldo) * taxaCredito;
		         setSaldo(saldo - juros);
		     }
		 }
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
