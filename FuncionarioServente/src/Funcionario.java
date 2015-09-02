public class Funcionario {
	private String nome;
	private int codigo;
	private double salarioBase;

	public Funcionario(int codigo, String nome, double salarioBase) {
		this.codigo = codigo;
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	/** Retorna salrio base deste funcionario. No inclui adicionais.
	 * 
	 * @return o salrio base
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	/** Retorna remunerao total deste funcionario. A remunerao total 
	 *  a soma do salrio base mais adicionais. 
	 * 
	 * @return getSalarioBase() + possveis adicionais;
	 */
	public double getRemuneracaoTotal() {
		return getSalarioBase();
	}
	
	/** Retorna salario liquido. Salario liquido calculado sobre remunerao total,
	 * descontando impostos.
	 * 
	 * @return salario liquido (getRemuneracaoTotal() - impostos)
	 */
	public double getSalarioLiquido() {
		double renda = getRemuneracaoTotal();
		double inss = renda * 0.1;
		double ir = 0.0;
		if (renda > 2000.0) {
			ir = (renda - 2000.0) * 0.12;
		}
		return (renda - inss - ir);
	}

	@Override
	public String toString() {
		return (getClass().getSimpleName() + "\n   Codigo: " + getCodigo()
				+ "\n   Nome: " + getNome() + "\n   Salario Base: "
				+ getSalarioBase() + "\n   Salario Liquido: " + getSalarioLiquido());
	}
}
