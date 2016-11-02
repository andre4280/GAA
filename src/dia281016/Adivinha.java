package dia281016;

import java.util.Scanner;
import java.util.Random;

public class Adivinha
{
	int numTentativa;
	int numAdivinha;
	int numEscondido;
	final int VALORMAX = 5;
	
	//Declarar Scanner de Input
	Scanner in = new Scanner(System.in);
	
	public Adivinha() 
	{
		Random r = new Random();
		
		numEscondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar()
	{
		
			while (numTentativa < 3 )
			{
				System.out.println("Insira a sua escolha de 1 a 10");
				//Leitura de Integer
				numAdivinha = in.nextInt();
				
				if (numAdivinha == numEscondido)
				{
				System.out.println("CERTO!!!");
				}
				else if (numAdivinha > numEscondido)
				{
				System.out.println("Está Quentinho mas foi acima, tenta novamente!");
				numTentativa++;
				}
				else if (numAdivinha < numEscondido)
				{
				System.out.println("Está Quentinho mas foi abaixo, tenta novamente!");
				numTentativa++;
				}
				
			}
	}	
}
