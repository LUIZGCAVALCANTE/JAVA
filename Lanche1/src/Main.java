import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o codigo do Primeiro item");
		int codigo1= sc.nextInt();
		System.out.printf("Insira o codigo do Segundo item");
		int codigo2= sc.nextInt();
		System.out.printf("Insira o codigo do Terceiro item");
		int codigo3= sc.nextInt();
		System.out.printf("Insira o codigo do Quarto item");
		int codigo4= sc.nextInt();
		System.out.printf("Insira o codigo do quinto item");
		int codigo5= sc.nextInt();
		System.out.println("Insira a quantidade dos itens");
		int quantidade= sc.nextInt();
		double total;
		double t1=0,t2=0,t3=0,t4=0,t5=0;
		
		
		
		
		if (codigo1 == 1) {
			t1 = quantidade * 4.0;
		}
		else if (codigo2 == 2) {
			t2 = quantidade * 4.5;
		}
		else if (codigo3 == 3) {
			t3 = quantidade * 5.0;
		}
		else if (codigo4 == 4) {
			t4 = quantidade * 2.0;
		}
		else if (codigo5 == 4) {
			t5 = quantidade * 1.5;
		}

			total = quantidade * (t1+t2+t3+t4+t5);
		

        
    		System.out.printf("Total: R$ %.2f%n", total);

		
		sc.close();
		
	}

}
