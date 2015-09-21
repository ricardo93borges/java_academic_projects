package atracoes;


public class Banda {

	private String nome;
	private String estilo;
	
	private Musico[] integrantes;
	private int nIntegrantes;

	public Banda(String nome, String estilo) {
		this.nome = nome;
		this.estilo = estilo;
		integrantes = new Musico[15];
	}

	public void addIntegrante(Musico a) {
		if(nIntegrantes < integrantes.length){
			integrantes[nIntegrantes++] = a;
		}
	}

	public String getNome() {
		return nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public Musico[] getIntegrantes() {
		Musico[] result = new Musico[nIntegrantes];
		System.arraycopy(integrantes, 0, result, 0, nIntegrantes);
		return result;
	}
	
	public int getNumIntegrantes(){
		return nIntegrantes;
	}

}
