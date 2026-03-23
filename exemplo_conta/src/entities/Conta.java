package entities;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;
	
	private void sacar(double saldo) {
		this.saldo -= saldo;
	}
	
	private void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	private void calculaRendimento() {
		this.saldo *= 0.1;
	}
	
	private void recuperarDadosParaImpressao() {
		System.out.println("");
	}
}
