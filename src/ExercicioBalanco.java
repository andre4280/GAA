
public class ExercicioBalanco {
int totalReceitas;
int totalCustos;
		
	public ExercicioBalanco() {
		

		/* 
		 * Calcular receitas
		 */
		calcularReceitas ();
		
		/*
		 * Calcular despesas
		 */
		totalCustos ();
		
        int total = totalReceitas - totalCustos; 
        
		System.out.println (" Olá aleijado, o total das receitas é de " + totalReceitas + "€." );
		System.out.println ("\n O total de dinheiro ganho com custos pagos é de " + total + "€.");
		System.out.println (" Sendo que houve " + totalCustos +" de despesas €.");
   
	}
	
	public void calcularReceitas () {
		int quotas 		= 300,
				recBaile	= 200,
				recBar		= 250;
				
			totalReceitas = quotas + recBaile + recBar;
			
	}
	
	public void totalCustos () {
		int agua		= 100,
	        	luz  		= 180,
	        	telefone 	= 60,
	        	gas 		= 40;
	        
			totalCustos = agua + luz + telefone + gas;
	}
	
	
}
