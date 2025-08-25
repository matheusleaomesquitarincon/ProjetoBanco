package noobank;

public class Main {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1000);
        cp.setTaxaJuros(0.02);
        cp.aplicarJuros();
        System.out.println("Poupança após juros: R$" + cp.getSaldo());

        ContaAplicacao ca = new ContaAplicacao();
        ca.depositar(2000);
        ca.setTaxaJuros(0.03);
        double sacado = ca.sacar(500); 
        System.out.println("Aplicação - valor recebido após multa: R$" + sacado);

        ContaSalario cs = new ContaSalario();
        cs.depositar(500);
        cs.setCotasMensais(2);
        cs.setTaxa(1);
        cs.sacar(100);
        cs.sacar(50);
        cs.sacar(30); 
        cs.calcularTaxas();
        System.out.println("Salário após transações e taxas: R$" + cs.getSaldo());

        ContaEspecial ce = new ContaEspecial();
        ce.setTaxaCredito(0.2); 
        ce.depositar(100);
        ce.sacar(300); 
        ce.cobrarJuros(); 
        System.out.println("Especial após juros no crédito: R$" + ce.getSaldo());

	}

}
