package biblioteca;

//import java.time.Instant;
//import java.time.temporal.ChronoUnit;

public class Locacao {

	private Livro livro;
	private Usuario user;
	//private Instant retirada;

	public Locacao(Livro livro, Usuario user) {
		this.livro = livro;
		this.user = user;
		//this.retirada = Instant.now();
	}
/*
	public Livro getLivro() {
		return livro;
	}

	public Usuario getUser() {
		return user;
	}

	public Instant getDataRetirada() {
		return retirada;
	}

	public int getDiasDeAtraso() {
		return (int) retirada.until(Instant.now(), ChronoUnit.DAYS);
	}
*/
}
