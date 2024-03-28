import java.util.Scanner;

import entities.Traingule;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	       System.out.println();
	       Traingule x, y;
	       
	       x = new Traingule();
	       y = new Traingule();

	       
		
		
		System.out.printf("Insira o valor de ax");
		x.a= sc.nextDouble();
		
		System.out.printf("%n Insira o valor de bx ");

		x.b= sc.nextDouble();
		System.out.printf("Insira o valor de cx");

		x.c= sc.nextDouble();
		
		double area = x.area();
		
        System.out.printf("A area do triângulo 1 é de %.2f%n", area );
		
		System.out.printf("%n Insira o valor de ay %n");

		y.a= sc.nextDouble();
		System.out.printf("%n Insira o valor de by %n");

		y.b= sc.nextDouble();
		System.out.printf("%n Insira o valor de cy %n");

		y.c= sc.nextDouble();
		
		double areab = y.area();

        System.out.printf("A area do triângulo 2 é de %.2f%n", areab );
        
		 double areaf = (area + areab)/2.0;
        
        
        
        if ( area > areab) {

            System.out.printf("%n Analisando os fatores presentes conclui-se que triangulo que tem a maior area é o Primeiro" );

        } else {

            System.out.printf("%n Analisando os fatores presentes conclui-se que o 21  triangulo de maior area é o Segundo" );

        }
        

		sc.close();
		
		
	}

}
