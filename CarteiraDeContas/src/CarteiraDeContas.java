import java.util.ArrayList;

public class CarteiraDeContas {

	private String titular;
	private double saldo;
	//private int[] contas = new int[10];
    //Conta[] contas = new Conta[10];
	ArrayList<Conta> contas = new ArrayList(); 
	private int numContas;
	
	public CarteiraDeContas(String titular){
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo(int cconta) {
		for(int i = 0; i < this.contas.size(); i++){
			if(this.contas.get(i).getNumero() == cconta){
				return this.contas.get(i).getSaldo();
			}
		}
		return 0.0;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumContas() {
		return numContas;
	}
	
	public void setNumContas(int numContas) {
		this.numContas = numContas;
	}
	
	public void addConta(int cconta){
		if(this.numContas < 10){
			Conta c = new Conta(cconta, 0.0);
			this.contas.add(c);
			this.numContas++;
		}
	}
	
	public void addConta(int cconta, double saldoinicial){
		if(this.numContas < 10){
			Conta c = new Conta(cconta, saldoinicial);
			this.contas.add(c);
			this.numContas++;
		}
	}
	
	public double getSaldoTotal(){
		double saldoTotal = 0.0;
		for(int i = 0; i < this.contas.size(); i++){
			saldoTotal += this.contas.get(i).getSaldo();
		}
		return saldoTotal;
	}
	
	public void depositar(int cconta, double valor){
		for(int i = 0; i < this.contas.size(); i++){
			if(this.contas.get(i).getNumero() == cconta){
				double s = this.contas.get(i).getSaldo() + valor;
				this.contas.get(i).setSaldo(s);
			}
		}
	}
	
	public double retirar(int cconta){
		for(int i = 0; i < this.contas.size(); i++){
			if(this.contas.get(i).getNumero() == cconta){
				this.contas.get(i).setSaldo(0.0);
				return this.contas.get(i).getSaldo();
			}
		}
		return 0.0;
	}
	
	public double retirar(int cconta, double valor){
		for(int i = 0; i < this.contas.size(); i++){
			if(this.contas.get(i).getNumero() == cconta){
				double s = this.contas.get(i).getSaldo() - valor;
				this.contas.get(i).setSaldo(s);
				return valor;
			}
		}
		return 0.0;
	}
	
	public boolean transferir(int deConta, int paraConta, double valor){
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		for(int i = 0; i < this.contas.size(); i++){
			if(this.contas.get(i).getNumero() == deConta){
				c1 = this.contas.get(i);
			}else if(this.contas.get(i).getNumero() == paraConta){
				c2 = this.contas.get(i);
			}
		}
		
		double c1Saldo = c1.getSaldo() - valor;
		double c2Saldo = c2.getSaldo() + valor;
		c1.setSaldo(c1Saldo);
		c2.setSaldo(c2Saldo);
		
		return true;
	}
}