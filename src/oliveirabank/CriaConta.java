package oliveirabank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		
		System.out.println("O saldo da primeira conta tem: R$" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println("Agora o saldo da primeira conta tem: R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da segunda conta tem: R$" + segundaConta.saldo);
		
		
	}
}
