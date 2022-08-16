package oliveirabank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	//Getters
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	//Setters
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
