package entities;

public class Conta {
	public String titular;
	public int numero;
	public String agencia;
	public double saldo;
	public String dataAbertura;

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
