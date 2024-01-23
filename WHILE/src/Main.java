import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Insira o valor de x");
        int x = sc.nextInt();

        int soma = 0;
        while (x !=0) {
            soma +=x;
            x = sc.nextInt();
        }

        System.out.printf("O valor de x é igual %d%n", x);
        System.out.printf("O valor total é igual %d%n", soma);













        sc.close();

    }
}