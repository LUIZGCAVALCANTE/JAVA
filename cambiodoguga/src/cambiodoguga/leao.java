package cambiodoguga;

import java.util.Scanner;

import util.cripto;

public class leao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		cripto cpt  = new cripto ();
		
		System.out.println("\r Digite a quantidade de em reais que deseja trocar");
		
		cpt.real = sc.nextDouble();
		
		System.out.printf("\r O valor que você deseja trocar em reais é de %.2f", cpt.lulacoins());
		
		
		System.out.printf("\r A cotação atual de dolar hoje é de %.2f", + cpt.preco());
		System.out.printf("\r Você irá obter %.2f dólares", cpt.trump());
		
		
		System.out.printf("\r E irá pagar um preco de %.2f. Por unidade de dolar!", cpt.preco());
		
		System.out.printf("\r E irá pagar ainda um imposto de : %.2f. Que é o Imposto sobre operações financeiras (IOF).", cpt.IOF());
		
		sc.close();
		
	}

}
