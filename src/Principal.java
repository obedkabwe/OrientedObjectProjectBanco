
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Banco banco = new Banco();
		
		banco.numConta = "83644";
		banco.saldo = 1500.0;
		banco.chequeSpecial = 500.0;
		banco.special = true;
		
	    banco.depositarDinheiro(250.0);
		banco.realizarSaque(500.0);
		
		double rsaldo=banco.consultarSaldo();
		
	
		if ( banco.saldo == 0.0) {
			System.out.println("you can use your cheque special with the amount of"+ ":" + banco.chequeSpecial);
		}else {
			System.out.println("the amount in your acount is" + ":" + rsaldo);
		}
		
		
		banco.verificarCliente(rsaldo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
