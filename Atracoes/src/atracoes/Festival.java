package atracoes;
import java.util.Arrays;

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
			titulo += this.bandas[i].getNome()+", ";
		}
		return titulo;
	}
	
	public Artista[] getArtistas(){
		int numIntegrantes = 0;
		for(int i = 0; i < this.nBandas; i++){
			numIntegrantes += this.bandas[i].getNumIntegrantes();
		}
		
		Artista[] artistas = new Artista[numIntegrantes];
		int c = 0;
		for(int i = 0; i < this.nBandas; i++){
			Musico[] integrantes = this.bandas[i].getIntegrantes();
			for(int j = 0; j < this.bandas[i].getNumIntegrantes(); j++){
				if(!Arrays.asList(artistas).contains(integrantes[j])){
					artistas[c] = integrantes[j];
					c++;
				}
			}
		}
		return artistas;
	}
	
	public void addBanda(Banda b){
		if (nBandas < this.bandas.length) {
			this.bandas[nBandas++] = b;
		}
	}
	
	public void artistasToString(){
		Artista[] artistas = this.getArtistas();
		for(int i=0; i < artistas.length; i++){
			System.out.println(artistas[i].getNome());
		}
	}
	
}