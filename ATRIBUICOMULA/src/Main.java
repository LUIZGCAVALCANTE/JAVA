import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o numero de minutos consumidos");
		int minutos = sc.nextInt();
		
		
		double conta = 50.0;
		
		if (minutos >100) {
			
			
			conta += ( minutos -100)* 2.0;
			
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
