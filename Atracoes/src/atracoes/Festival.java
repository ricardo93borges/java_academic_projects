package atracoes;

public class Festival extends AtracaoAbstrata{
	
	private String titulo;
	private int duracao;
	private String horario;
	private Banda[] bandas;
	private int nBandas;
	private int h = 10;
	
	public Festival(String titulo, int duracao, String horario) {
		super(titulo, duracao, horario);
		this.titulo = titulo;
		this.duracao = duracao;
		this.horario = horario;
		this.bandas = new Banda[10];
	}
	
	@Override
	public String getTitulo() {
		String titulo = "Festival das bandas com ";
		for(int i = 0; i < this.nBandas; i++){
			Musico[] integrantes = this.bandas[i].getIntegrantes();
			for(int j = 0; j < this.bandas[i].getNumIntegrantes(); j++){
				titulo += integrantes[j].getNome()+",";
			}
		}
		return titulo;
	}
	
	public Artista[] getArtistas(){
		Artista[] artistas = new Artista[50];
		for(int i = 0; i < this.nBandas; i++){
			Musico[] integrantes = this.bandas[i].getIntegrantes();
			for(int j = 0; j < this.bandas[i].getNumIntegrantes(); j++){
				artistas[j] = integrantes[j];
			}
		}
		return artistas;
	}
	
	public void addBanda(Banda b){
		if (nBandas < this.bandas.length) {
			this.bandas[nBandas++] = b;
		}
	}
	
}