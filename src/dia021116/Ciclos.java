package dia021116;

public class Ciclos {

	public Ciclos() {
		// TODO Auto-generated constructor stub
	// fazerEnquanto();
	de_para();
	}

	
	public void enquanto()
	{
		int i = 0;
		
		String msg = " Over and over again. ";
		
		while ( i < 4)
		{
			System.out.println(msg);
		i++;
		}
		
	}
	
			public void fazerEnquanto()
			{
				int i = 5;
		
				String msg = " Over and over again. ";
				
				do
				{
					System.out.println(msg);
				i++;
				}
				while ( i <= 4);
			}
			
				
					public void de_para()
					{
						String msg = " Over and over again. ";
						for ( int i = 0 ; 1 < 4; i++)
						{
							System.out.println(msg);
						}
						
						
					}
}
