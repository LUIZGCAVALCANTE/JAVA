import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
System.out.println("INSIRA A HORA DE INICIO:");
		
		x= sc.nextInt();
	
		System.out.println("INSIRA A HORA QUE TERMINOU:");
	
		y= sc.nextInt();
		
		 int duracao = Math.abs(y - x);
		
		if(x+y <=0)
			
		{
			System.out.println("O Jogo durou 24 Horas que Jogão!  ");
		}
		
		else {
			System.out.printf("O Jogo durou %d Horas", (y-x));
			
			
			sc.close();
			}
		
		}

	}


