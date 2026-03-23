package entities;

public class Conta {
	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;

	public void sacar(double saldo) {
		this.saldo -= saldo;
	}

	public void depositar(double saldo) {
		this.saldo += saldo;
	}

	public void calculaRendimento() {
		this.saldo *= 0.1;
	}

	public void recuperarDadosParaImpressao() {
		System.out.println("");
	}
}
