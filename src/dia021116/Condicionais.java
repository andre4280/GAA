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
			 * =  -> Atribui��o.
			 * == -> Compara��o (true || false ).
			 * <= -> Compara��o.
			 * >= -> Compara��o.
			 * <  -> Compara��o.
			 * >  -> Compara��o.
			 * != -> Compara��o.
			 */
			
			
			
			if( num1 == num2 )
			{
			System.out.println("Os numeros s�o iguais.");
			}
				else if ( num1 < num2 )
				{
				System.out.println("O n�mero 1 � menor que o n�mero 2.");
				}
					else 
					{
						System.out.println("O n�mero 1 � maior que o n�mero 2.");
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
				System.out.println("O n�mero 1 � o maior.");
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
