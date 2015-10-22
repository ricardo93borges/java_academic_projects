package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.ws.util.StringUtils;

public class Biblioteca {
	
	private Set<Livro> setLivros;
	private List<Locacao> lstLocacoes;
	
	public Biblioteca() {
		setLivros = new HashSet();
		lstLocacoes = new ArrayList();
	}
	
	public Livro getLivro(String codigoLivro){
		for(Livro l : setLivros){
			if (l.getCodigo().equals(codigoLivro)){
				return l;
			}
		}
		return null;
	}
	
	public void registrarLivro(Livro l){
		boolean adicionou = setLivros.add(l); 
		if(!adicionou) {
			throw new IllegalArgumentException("Livro j� existe na biblioteca!!!");
		}
	}
	
	public Locacao locarLivro(Livro livro, Usuario user){
		Locacao locacao = new Locacao(livro, user);
		lstLocacoes.add(locacao);
		return locacao;
	}
	
	public void devolverLivro(Locacao locacao){
		lstLocacoes.remove(locacao);
	}
	
	public int getNumeroLivros(){
		return setLivros.size();
	}
	
	/** 
	 * Retorna um dicion�rio com a classifica��o dos livros esta biblioteca por tipo
	 * 
	 * @return um dicionario mapeando cada tipo de livro para um conjunto de 
	 * livros deste tipo
	 */
	public Map<String,Set<Livro>> getLivrosClassificadosPorTipo(){
		Map<String,Set<Livro>> livros = new HashMap<String, Set<Livro>>();
		
		for(Livro l : this.setLivros){    
			if(livros.containsKey(l.getTipo())){
				livros.get(l.getTipo()).add(l);
			}else{
				Set<Livro> livrosSet = new HashSet<Livro>();
				livrosSet.add(l);
				livros.put(l.getTipo(), livrosSet);
			}
		}
		return livros;
	}
	
	/** Retorna um conjunto com todos os usu�rios com livros em atraso
	 * 
	 * @return um conjunto com usu�rio que tem livros emprestados em atraso 
	 */
	public Set<Usuario> getUsuariosComLivroEmAtraso(){
		Set<Usuario> usuarios = new HashSet<Usuario>();
		for(Locacao l : this.lstLocacoes){
			if(l.getDiasDeAtraso() > 0){
				usuarios.add(l.getUser());
			}
		}
		return usuarios;
	}
	
	/** Retorna um dicion�rio com a classifica��o dos livros desta biblioteca nos seus
	 * respectivos anos de lan�amento. Os anos devem ser restritos aos anos passados por
	 * par�metro
	 * 
	 * @param anos quais os anos de interesse para a consulta
	 * @return dicion�rio com os livros classificados por ano
	 */
	public Map<Integer,Set<Livro>> getLivrosClassificadosPorAno(Set<Integer> anos){
		Map<Integer,Set<Livro>> livros = new HashMap<Integer, Set<Livro>>();
	
		for(Livro l : this.setLivros){
			if(anos.contains(l.getAno())){
				if(livros.containsKey(l.getAno())){
					livros.get(l.getAno()).add(l);
				}else{
					Set<Livro> livrosSet = new HashSet<Livro>();
					livrosSet.add(l);
					livros.put(l.getAno(), livrosSet);
				}
			}
		}
		return livros;
	}

	/** Retorna um relatorio dos livros da biblioteca organizados por tipo, com 
	 * o seguinte formato:
	 * 
	 * Tipo 1:
	 * -Titulo do Livro 1;
	 * -Titulo do Livro 5;
	 * 
	 * Tipo 2:
	 * -Titulo do Livro 3;
	 * -Titulo do Livro 2;
	 * ...
	 * 
	 * @return
	 */
	
	public String getRelatorioPorTipo(){
		String relatorio = "Relatório: \n";
		Set<String> tipos = new HashSet<String>();
		
		for(Livro l : this.setLivros){
			if(tipos.contains(l.getTipo())){
				break;
			}
			tipos.add(l.getTipo());
			relatorio += " \n "+l.getTipo();
			for(Livro l2 : this.setLivros){
				relatorio += " \n - "+l2.getTitulo();
			}
		}		
		return relatorio;		
	}
	
}