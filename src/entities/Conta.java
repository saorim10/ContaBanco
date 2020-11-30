package entities;


public class Conta {
	private String nome;
	private int contaNumero;
	private double saldo;
	private double taxa = 5.00;
	
	public Conta() {
		
	}
	
	public Conta(String nome, int num, double deposito) {
		this.nome = nome;
		this.contaNumero = num;
		this.saldo = deposito;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getContaNumero() {
		return this.contaNumero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= (valor + taxa);
	}
	
	@Override
	public String toString() {
		return "Conta "
				+ this.contaNumero
				+ ", Cliente: "
				+ this.nome
				+ ", Saldo: $ "
				+ String.format("%.2f", this.saldo);
	}
}
