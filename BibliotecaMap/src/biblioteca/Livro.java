package biblioteca;
public class Livro {

	private String codigo;
	private String titulo;
	private String autor;
	private int ano;
	private String tipo;

	public Livro(String codigo, String titulo, String autor, int ano,
			String tipo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

	public String getTipo() {
		return tipo;
	}
	
	public boolean equals(Object o){
		 if (o instanceof Livro){
			 Livro l = (Livro) o;
			 if(l.getCodigo() == this.getCodigo()){
				 return true;
			 }
		 }
		 return false;
	}
	
	public int hashCode(){
		return getCodigo().hashCode();
	}
	

}
