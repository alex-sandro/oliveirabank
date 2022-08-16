package oliveirabank;

public class TestaMetodos {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.deposita(100);
		System.out.println(conta1.saldo);
		conta1.saca(50);
		System.out.println(conta1.saldo);
		
		
		conta2.deposita(3000);
		System.out.println(conta2.saldo);
		
		conta2.transfere(2000, conta1);
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo);
		
	}
	
}
