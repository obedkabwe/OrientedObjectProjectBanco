
public class Banco {

	public String  numConta;
	public double saldo;
	public double chequeSpecial;
	public boolean special;
	
	
	
	
	double realizarSaque(double retirar) {
		 this.saldo -= retirar;
		 return saldo;
	}
	
	
	
	double depositarDinheiro(double depositar) {
		this.saldo +=  depositar;
		 return saldo;
	}
	
   public  double consultarSaldo() {
    	if ( saldo > 0  || this.chequeSpecial < 0) {
		
    		return saldo;
		}else {
			return    chequeSpecial;
		}
			
		
		
    }
	
	
	
	boolean verificarCliente(double rsaldo) {
		if (rsaldo == 0.0) {
			//return special;
		}return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
