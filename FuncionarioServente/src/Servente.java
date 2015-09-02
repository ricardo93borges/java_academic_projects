
public class Servente extends Funcionario{
	
	public Servente(int codigo, String nome, double salarioBase){
		super(codigo, nome, salarioBase);
	}
	
	public double getRemuneracaoTotal() {
		return super.getSalarioBase()+super.getSalarioBase()*0.05;
	}

}
