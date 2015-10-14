package atracoes;

public class Novela extends AtracaoAbstrata{

	private String titulo;
	private int duracao;
	private String horario;
	private Artista[] artistas;
	private int nArtistas;
	
	public Novela(String titulo, int duracao, String horario) {
		super(titulo, duracao, horario);
		this.titulo = titulo;
		this.duracao = duracao;
		this.horario = horario;
		this.artistas = new Artista[10];
	}
	
	public Artista[] getArtistas(){
		Artista[] result = new Artista[nArtistas];
		System.arraycopy(this.artistas, 0, result, 0, nArtistas);
		return result;
	}
	
	public void addArtista(Ator a){
		if (nArtistas < artistas.length) {
			this.artistas[nArtistas++] = a;
		}
	}
}

