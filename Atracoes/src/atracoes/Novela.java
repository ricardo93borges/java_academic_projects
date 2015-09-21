package atracoes;

public class Novela extends AtracaoAbstrata{

	private String titulo;
	private int duracao;
	private String horario;
	private Artista[] artistas;
	private int nArtistas;
	
	public Novela(String titulo, int duracao, String horario) {
		super(titulo, duracao, horario);
		titulo = titulo;
		duracao = duracao;
		horario = horario;
	}

	@Override
	public int getDuracaoMinutos() {
		return duracao;
	}
	
	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String getHorario() {
		return horario;
	}
	
	public Artista[] getArtistas(){
		return this.artistas;
	}
	
	public void addArtista(Artista a){
		if (nArtistas < artistas.length) {
			this.artistas[nArtistas++] = a;
		}
	}
}

