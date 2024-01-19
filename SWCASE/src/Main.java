import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Agendinha
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o dia da semana em numero");
		int x = sc.nextInt();
		String dia;
		
		
		if (x == 1) {
			 dia = "Domingo";
		}
		else if (x == 2) {
			dia = "Segunda";
		}
		else if (x == 3) {
			dia = "Terça";
		}
		else if (x == 4) {
			dia = "Quarta";
		}
		else if (x == 5) {
			dia = "Quinta";
		}
		else if (x == 6) {
			dia = "Sexta";
		}
		else if (x == 7) {
			dia = "Sábado";
		} else
		{
			
			dia = "valor invalido";
		}
		
        System.out.println("Dia da semana: " + dia);
		
		
		sc.close();
		
	}

}
