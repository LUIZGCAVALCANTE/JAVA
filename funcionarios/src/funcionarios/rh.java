package funcionarios;
import java.util.Scanner;
import funcionarios.dados;
public class rh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		dados ds = new dados ();
		
		System.out.print("\n Insira o nome do funcionario");
		ds.nome();
		ds.nome= sc.next();
		System.out.println("\r Insira o salário do funcionário");
		ds.salariob();
		ds.salariob= sc.nextDouble();
		
		
		System.out.println("Insira o imposto");
		ds.imposto= sc.nextDouble();
		ds.imposto();
	
		
		System.out.printf("\r Dados do funcionário %s, R$ %.2f", ds.nome, ds.salariol());
		
		System.out.println("\n Insira a taxa de aumento percentual do salario");
		ds.percent();
		ds.percent=sc.nextDouble();
		
		System.out.printf("O percentual aplicado foi de %.2f", ds.taxa());

		System.out.printf("\n Dados do funcionário %s,  R$ %.2f", ds.nome, ds.newslario());

		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
