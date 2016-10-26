
public class principal {

	public principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int quotas 		= 300,
			recBaile	= 200,
			recBar		= 250;
			
		int totalReceitas = quotas + recBaile + recBar;
		
		int agua		= 100,
        	luz  		= 180,
        	telefone 	= 60,
        	gas 		= 40;
        
		int totalCustos = agua + luz + telefone + gas;
		
        int total = totalReceitas - totalCustos; 
        
		System.out.println (" Olá aleijado, o total das receitas é de " + totalReceitas + "€." );
		System.out.println ("\n O total de dinheiro ganho com custos pagos é de " + total + "€.");
		System.out.println (" Sendo que houve " + totalCustos +" de despesas €.");
        
	}

}
