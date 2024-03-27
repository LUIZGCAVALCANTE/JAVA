import java.util.Scanner;

import entities.Traingule;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	       System.out.println();
	       Traingule x, y;
	       
	       x = new Traingule();
	       y = new Traingule();

	       
		double area, areab;
		double area_maior;
		
		System.out.printf("Insira o valor de ax");
		x.a= sc.nextDouble();
		
		System.out.printf("%n Insira o valor de bx ");

		x.b= sc.nextDouble();
		System.out.printf("Insira o valor de cx");

		x.c= sc.nextDouble();
		
		area = (x.a+x.b+x.c)/2;
		
        System.out.printf("A area do triângulo 1 é de %.2f%n", area );
		
		System.out.printf("%n Insira o valor de ay %n");

		y.a= sc.nextDouble();
		System.out.printf("%n Insira o valor de by %n");

		y.b= sc.nextDouble();
		System.out.printf("%n Insira o valor de cy %n");

		y.c= sc.nextDouble();
		
		areab = (y.a+y.b+y.c)/2;
		
        System.out.printf("A area do triângulo 2 é de %.2f%n", areab );
        
        area_maior = (area + areab)/2;
        
        
        
        if ( area > areab) {

            System.out.printf("%n Analisando os fatores presentes conclui-se que triangulo que tem a maior area é o Primeiro" );

        } else {

            System.out.printf("%n Analisando os fatores presentes conclui-se que o triangulo de maior area é o Segundo" );

        }
        

		sc.close();
		
		
	}

}
