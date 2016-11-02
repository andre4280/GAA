package dia021116;

import java.util.Scanner;

public class Calculadora_Infinita 
{

    public Calculadora_Infinita() 
    {
        main();
    }


    public static void main()
        {
            double n1 =1;
            double n2 =1;
            double n3 =1;
            double somaTotal = n1 + n2;
            double subtracaoTotal = n1 - n2;
            double divisaoTotal = n1 / n2;
            double multiplicacaoTotal = n1 * n2; 
            
            
            
            
            
            char operation;
            Scanner scannerObject = new Scanner(System.in);

            while(n2 != 0)
            {
                //Pede ao Utilizador primeiro Número
                System.out.println("Enter first number");
                n1 = scannerObject. nextDouble();

                //Pede ao Utilizador segundo Número
                System.out.println("Enter second number");
                n2 = scannerObject. nextDouble();

                if(n2 != 0) 
                {
                    Scanner op = new Scanner(System.in);
                    System.out.println("Enter your operation");
                    operation = op.nextLine().charAt(0);


                    //Pede ao Utilizador a operação escolhida
                    switch (operation)
                    {
                    case '+':
                    System.out.println("Your answer is " + (n1 + n2));
                    break;
                    

                    case '-':
                    System.out.println("Your answer is " + (n1 - n2));
                    break;
                    

                    case '/':
                    System.out.println("Your answer is " + (n1 / n2));
                    break;
                    
                    
                    case '*':
                    System.out.println("Your asnwer is " + (n1 * n2));
                    break;
                     
                    }
                }
            }

        }
}
