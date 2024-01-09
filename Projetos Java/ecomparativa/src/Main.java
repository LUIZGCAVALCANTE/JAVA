import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x, y, z;
		System.out.println("INSIRA O VALOR DE X:");
		
		x= sc.nextInt();
	
		System.out.println("INSIRA O VALOR DE Y:");
	
		y= sc.nextInt();
		
		System.out.println("INSIRA O VALOR DE Z:");
		
		z= sc.nextInt();
		

		
		
	    
		if (x >0) 
		{
			System.out.println("X é um número positivo");
		


		}
			else {	
				
				System.out.println("X é um número negativo");
				
	
			}
		if (y >0) 
		{
			System.out.println("Y é um número positivo");
		


		}
			else {	
				
				System.out.println("Y é um número negativo");
				
	
			}
		if (z >= 0) 
		{
			System.out.println("Z é um número positivo");
		


		}
			else {	
				
				System.out.println("Z é um número negativo");
				
	
			}
		
		
		sc.close();
	}

}
 
