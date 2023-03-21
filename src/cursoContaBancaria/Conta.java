package cursoContaBancaria;

public class Conta {

	private int cdConta;
	private String nome;
	private double depositoInicial;
	private double saldo;
	
	public Conta(int cdConta, String nome, double depositoInicial)
	{
		this.cdConta = cdConta;
		this.nome = nome; 
		this.depositoInicial = depositoInicial;
		this.saldo = depositoInicial;
		
	}
	public Conta(int cdConta, String nome)
	{
		this.cdConta = cdConta;
		this.nome = nome; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCdConta() {
		return cdConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
	public void depositar(double deposito)
	{
		double aux;
		aux = this.saldo + deposito;
		
		setSaldo(aux);
		
	}
	public void sacar(double saque)
	{
		double aux;
		aux = this.saldo - (saque + 5);
		setSaldo(aux);
	}
	
	public String toString()
	{
		return  "Numero conta: "+ getCdConta() +
				"\nNome: " + getNome() +
				"\nSaldo: "+ getSaldo();
				
		
	}
	

}
