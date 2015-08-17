import java.util.ArrayList;

public class CarteiraDeContas {

	private String titular;
	private double saldo;
	//private int[] contas = new int[10];
    ArrayList<Double> contas = new ArrayList();
	private int numContas;
	
	public CarteiraDeContas(String titular){
		this.titular = titular;
		this.contas = new ArrayList();
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo(int cconta) {
		return saldo;
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
		//int i = this.contas.length;
		this.contas.add(cconta, 0.0);
		this.numContas++;
	}
	
	public void addConta(int cconta, double saldoinicial){
		//int i = this.contas.length;
		this.contas.add(cconta, saldoinicial);
		this.numContas++;
	}
	
	public double getSaldoTotal(){
		return this.saldo;
	}
	
	public void depositar(int cconta, double valor){
		this.saldo += valor;
	}
	
	public double retirar(int cconta){
		double retorno = this.saldo;
		this.saldo = 0;
		return retorno;
	}
	
	public double retirar(int cconta, double valor){
		this.saldo -= valor;
		return valor;
	}
	
	public boolean transferir(int deConta, int paraConta, double valor){
		return true;
	}
}


