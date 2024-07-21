package conta;

public class Back {

	String name;
	String numcont;
	private String conta;
	private double depinicial;
	private double saldo;
	private double saque;
	private double taxa= 5.00;
	
	// modificadores conta//
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getDepinicial() {
		return depinicial;
	}
	public void setDepinicial(double depinicial) {
		this.depinicial = depinicial;
		this.saldo = depinicial;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo,double depinicial ) {
		this.saldo = saldo + depinicial;
	}
	
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
		this.saldo -=(saque + taxa);
	}
	
	  public double getTaxa() {
	        return taxa;
	    }
	
	
	
	
}
