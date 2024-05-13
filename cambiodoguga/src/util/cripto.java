 package util;

public class cripto {

	public Double dolar;
	public Double real;
	public Double cambio;
	public Double quantidade;
	public Double preco;
	public Double IOF;
	public Boolean sim,nao;
	public Boolean validate;
	public Boolean confirma;
	public Double percent;
	
	
	public double IOF() {
		
		percent = 6*real/100;
		
		return percent;
	}
	public double preco () {
		
		preco=5.15;
		
		return preco;
	}
	public double trump () {
		dolar= real/preco;
		
		return dolar; 
	}
	
	public double lulacoins () {
		
		return real;
		
	}
		
	
	public double cred () {
		cambio = real/preco-IOF;
		
		return cambio;
		
	}
	
	public boolean confirma () {
return confirma;
	}
	
}
