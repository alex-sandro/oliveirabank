package oliveirabank;

public class TestaClienteConta {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.agencia = 3;
		conta1.numero = 1;
		conta1.saldo = 10;
		conta1.titular = new Cliente();
		conta1.titular.nome = "Alex";
		
		System.out.println(conta1.titular.nome);
		
	}
}
