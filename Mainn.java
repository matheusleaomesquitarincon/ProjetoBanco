package noobank;

class ContaBancaria {
 private double saldo;

 public ContaBancaria() {
     this.saldo = 0.0;
 }

 public ContaBancaria(double depositoInicial) {
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


public class Mainn {
 public static void main(String[] args) {
	 ContaPoupanca cp = new ContaPoupanca();
     cp.depositar(1000);
     cp.setTaxaJuros(0.02);
     cp.aplicarJuros();
    

     ContaAplicacao ca = new ContaAplicacao();
     ca.depositar(1000);
     ca.setTaxaJuros(0.05);
     ca.vencida();
     

     ContaSalario cs = new ContaSalario();
     cs.depositar(1000);
     cs.setCotasMensais(2);
     cs.setTaxa(1);
     cs.sacar(100);
     cs.sacar(100);
     cs.sacar(100);
     cs.calcularTaxas();
     

     ContaEspecial ce = new ContaEspecial();
     ce.depositar(500);
     ce.setTaxaCredito(0.2);
     ce.sacar(1000); 
     ce.cobrarJuros();
     
     
     System.out.println("Saldo após juros: " + cp.getSaldo());
     System.out.println("Saque antes do vencimento: " + ca.sacar(500));
     System.out.println("Saque após vencimento: " + ca.sacar(400));
     System.out.println("Saldo após taxas: " + cs.getSaldo());
     System.out.println("Saldo após cobrar juros: " + ce.getSaldo());
     
     
     
     
 }
}

