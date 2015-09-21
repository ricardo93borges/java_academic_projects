package atracoes;


class Artista {

	private String nome;

	private int idade;

	public Artista(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "(" 
	            + getClass().getSimpleName() 
				+ ": " + getNome() + ", " + getIdade()
				+ ")";
	}
}