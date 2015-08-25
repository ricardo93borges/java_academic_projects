public class Condominio {
	
	private String nome;
	private int numMaxLotes;
	private Lote[] lotes;
	private int qntLotes = 0;
	
	public Condominio(String nome, int numMaxLotes){
		this.nome = nome;
		this.numMaxLotes = numMaxLotes;
		this.lotes = new Lote[numMaxLotes];
	}
	
	public Condominio(String nome){
		this.nome = nome;
	}
	
	public boolean addLote(Lote lte){
		if(this.qntLotes < this.numMaxLotes){
			this.lotes[this.qntLotes] = lte;
			this.qntLotes++;
			return true;
		}
		return false;
	}
	
	public Lote getLote(int numero){
		for(int i=0; i < this.qntLotes; i++){
			if(this.lotes[i].getNumero() == numero){
				return this.lotes[i];
			}
		}
		return null;
	}
	
	public boolean removeLote(int numero){
		for(int i=0; i < this.numMaxLotes; i++){
			if(this.lotes[i].getNumero() == numero){
				//this.lotes[i] = null;
				
				for(int j=i; j < this.qntLotes; j++){
					this.lotes[j] = this.lotes[j+1];
				}
				this.qntLotes--;
				return true;
			}
		}
		return false;
	}
	
	public double getAreaTotal(){
		double area = 0.0;
		for(int i=0; i < this.qntLotes; i++){
			area += this.lotes[i].getArea();
		}
		return area;
	}
	
	public double getPerimetroTotal(){
		double perimetro = 0.0;
		for(int i=0; i < this.qntLotes; i++){
			perimetro += this.lotes[i].getPerimetro();
		}
		return perimetro;
	}
	
	public int getNumLotes(){
		return this.qntLotes;
	}
}
