
public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Luiz";
		int idade = 31;
		
		System.out.println("Se você quiser!");
        System.out.println("Te direi qual o preço do litro");
        System.out.println("Ouça bem é: ");
        System.out.println(y);
        System.out.println("Digamos então que ficara esse valor se eu encher 15 litros?");
        System.out.printf("%.2f%n", x);
        System.out.println("Nao esse será o valor por litro isso, pois você é nosso cliente mais antigo");
        System.out.println("Então o resultado dos 15 litros ficou= "+(y*x)+" Dessa forma?");
        System.out.printf("Não é dessa forma = %.2f Assim!%n", (15 * x));  
        System.out.println("E esses 32 refere-se a o que?");
        System.out.println("Ao desconto que iremos aplicar a você! Dividindo o valor final por esse valor");
        System.out.printf("Portanto ficará assim!%n %.2f desse jeito!", (15 * x)/y);
        System.out.println("No final você só pagará esse valor simbólico!");
        System.out.printf("Compreendi tudo agora  %s gostei e obrigado! Valor que vou pagar é: %.2f", nome, (15 * x)/y);       
	}

}
 