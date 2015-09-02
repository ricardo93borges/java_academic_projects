
public class MestreDeObras extends Servente {
	
	private Funcionario[] funcionarios;
	private int numFuncionarios;
	
	public MestreDeObras(int codigo, String nome, double salarioBase){
		super(codigo, nome, salarioBase);
		this.funcionarios = new Funcionario[50];
		this.numFuncionarios = 0;
	}
	
	public double getRemuneracaoTotal(){
		double salario = super.getRemuneracaoTotal();
		for(int i=0; i<this.numFuncionarios/10; i++){
			salario += super.getSalarioBase()*0.10;
		}
		return salario;
	}
	
	public void addFuncionario(Funcionario f){
		this.funcionarios[this.numFuncionarios] = f;
		this.numFuncionarios++;
	}

}
