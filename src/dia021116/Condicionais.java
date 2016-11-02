package dia021116;

public class Condicionais {

	public Condicionais() {
		// TODO Auto-generated constructor stub
		
		//comparadorSimples();
		comparadorMultivariavel();
		
	}

	
		public void comparadorSimples()
		{
			int num1 = 4; 
			int num2 = 1;
			
			/*
			 * =  -> Atribuição.
			 * == -> Comparação (true || false ).
			 * <= -> Comparação.
			 * >= -> Comparação.
			 * <  -> Comparação.
			 * >  -> Comparação.
			 * != -> Comparação.
			 */
			
			
			
			if( num1 == num2 )
			{
			System.out.println("Os numeros são iguais.");
			}
				else if ( num1 < num2 )
				{
				System.out.println("O número 1 é menor que o número 2.");
				}
					else 
					{
						System.out.println("O número 1 é maior que o número 2.");
					}
		}
		
		public void comparadorMultivariavel()
		{
			int num1 = 5;
			int num2 = 7;
			int num3 = 3;
			int num4 = 8;
			
		
			
			if ( num1 > num2 && num1 > num3 && num1 > num4)
			{
				System.out.println("O número 1 é o maior.");
			}
			
				if ( !(num2 > num3) || 	num1 > num4 )
				{
					System.out.print("Ganha a equipa 1.");
				}
				else
				{
					System.out.println("Ganha a equipa 2.");
				}
			
			
			
		}
		
		
		
			
		
		
		
}
