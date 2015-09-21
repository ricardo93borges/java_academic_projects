package atracoes;


public abstract class AtracaoAbstrata implements Atracao {

	private String titulo;
	private int duracao;
	private String horario;

	public AtracaoAbstrata(String titulo, int duracao, String horario) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.horario = horario;
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

}
