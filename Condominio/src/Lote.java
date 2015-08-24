
public class Lote {
	
	private int numero;
	private double largura;
	private double comprimento;
	
	public Lote(int numero, double largura, double comprimento){
		this.numero = numero;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getLargura() {
		return this.largura;
	}

	public double getComprimento() {
		return this.comprimento;
	}
	
	public double getArea() {
		return this.comprimento*largura;
	}
	
	public double getPerimetro() {
		return (2*comprimento)+(2*largura);
	}
}
