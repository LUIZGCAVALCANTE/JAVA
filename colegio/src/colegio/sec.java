package colegio;
import java.util.Scanner;
import colegio.pontos;
public class sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		pontos pts = new pontos ();
		
		
		System.out.printf("Digite o nome");
		pts.nome = sc.next();
		
		System.out.println("\r Insira o valor do Primeiro Trimestre"    );
		pts.primeirotri= sc.nextDouble();
		
		
		System.out.printf("\r", pts.primeirosemestre());
		
				System.out.println("\r Insira o valor do Segundo Trimestre"    );
					pts.segundotri = sc.nextDouble();
						
					System.out.printf("\r", pts.primeirosemestre());

		
				System.out.println("\r Insira o valor do Terceiro Trimestre"    );
					pts.terceirotri = sc.nextDouble();
							
					System.out.printf("\r", pts.terceirosemestre());

		
		
		System.out.println("\r Calculando as notas"    );
		
		
		System.out.println("\r Gerando requerimentos...");

		System.out.printf("\r", pts.nome(), pts.semestrefinal());

		
		
		sc.close();
		
	}

}
