package conta;
import java.util.Scanner;

public class Front {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        Back back = new Back();

        String resposta;

        System.out.println("Olá seja bem vindo ao banco do Oeste");

        System.out.println("Digite seu nome");
        back.name = sc.nextLine();
        System.out.println("Olá: " + back.name);


        System.out.println(back.name + " Agora você deve digitar o número da sua conta");
        back.setConta(sc.nextLine());
        System.out.println("\n Excelente sua nova conta é esse: " + back.getConta());

        System.out.println("Digite o valor do deposito inicial: ");
        back.setDepinicial(sc.nextDouble());
        System.out.println("\n Excelente seu  saldo inicial é esse: " + back.getDepinicial());
        System.out.println("O saldo da sua conta foi atualizado e é esse" + back.getSaldo());

        System.out.println("Deseja realizar algum saque?");
        sc.next();
        resposta = sc.nextLine();

        if (resposta.equals("sim")) {
            System.out.println("Digite o valor que deseja retirar: ");
            back.setSaque(sc.nextDouble());
            System.out.println("Olá " + back.name + " O seu novo saldo é de: " + back.getSaldo());
            System.out.println("Pois foi retirado da sua conta o valor de: " + back.getSaque());
        } else {
        	 System.out.println("Olá " + back.name + " A Sua conta: "+ back.getConta()+ " Possui um saldo de: " + back.getSaldo());
            System.out.println("O banco do Oeste está a disposição");
        }

        sc.close();
    }
}
