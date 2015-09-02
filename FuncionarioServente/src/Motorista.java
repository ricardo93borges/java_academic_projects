
public class Motorista extends Funcionario {

	private String cnh;
	
	public Motorista(int codigo, String nome, double salarioBase, String cnh){
		super(codigo, nome, salarioBase);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	
	
	
}
