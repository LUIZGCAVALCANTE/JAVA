package funcionarios;

public class dados {

	
public String nome;
	double salariob;
	double imposto;
	double salariol;
	double taxa;
	double percent;
	double novosalario;
	
	
	
	
	public double salariob () {
		
		return salariob;
		
	}
	
	public double imposto (){
		return imposto;
		
	}
	
	public double salariol () {
		salariol =(salariob-imposto);
		return salariol;		
	}
	
	public String nome () {
		
		return nome;
		
	}
	public double percent () {
		return percent;
	}
	
	
	
	public double taxa () {
		 taxa = percent/100;
		
		return taxa;
	}
	
	public double newslario (){
		novosalario = salariol*taxa+salariol;
		return novosalario;
	}
	
	

}
