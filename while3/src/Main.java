import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira do valor da coordenada x");
        int x = sc.nextInt();
        System.out.println("Insira do valor da coordenada y");
        int y = sc.nextInt();


        while (x != 0 && y != 0) {
            System.out.println("Coordenada validada com sucesso continue");
            System.out.println("Insira do valor da coordenada x");
             x = sc.nextInt();
            System.out.println("Insira do valor da coordenada y");
                 y = sc.nextInt();
        } if (x==0 && y==0)
        {
            System.out.println("Coordenadas nulas acesso encerrado");
        }
        x = sc.nextInt();
        y = sc.nextInt();

        sc.close();
    }

    }
