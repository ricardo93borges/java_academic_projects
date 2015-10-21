package biblioteca;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BibliotecaTester {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("LIV42", "O Guia do Mochileiro das Galaxias", "Douglas Adams", 1979, "Sci-Fi");
		Livro l2 = new Livro("LIV421", "O Restaurante no Fim do Universo", "Douglas Adams", 1980, "Sci-Fi");
		Livro l3 = new Livro("LIV666", "Intermitencias da Morte", "Jos� Saramago", 2005, "Romance");

		Usuario usr1 = new Usuario("USR123", "Joao");
		Usuario usr2 = new Usuario("USR125", "Maria");
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.registrarLivro(l1);
		biblioteca.registrarLivro(l2);
		biblioteca.registrarLivro(l3);
		
		//biblioteca.locarLivro(l1, usr1);
		//biblioteca.locarLivro(l2, usr1);
		//biblioteca.locarLivro(l3, usr2);
		
		System.out.println("Testando getLivrosClassificadosPorTipo()...");
		Map<String, Set<Livro>> porTipo = biblioteca.getLivrosClassificadosPorTipo();
		if(porTipo.get("Sci-Fi").size() != 2){
			System.out.println("Numero errado de livros de Sci-Fi");
		}
		if(porTipo.get("Romance").size() != 1){
			System.out.println("Numero errado de livros de Sci-Fi");
		}
		
		System.out.println("Testando getUsuariosComLivroEmAtraso()...");
		Set<Usuario> emAtraso = biblioteca.getUsuariosComLivroEmAtraso();
		if(emAtraso.size() != 0){
			System.out.println("Numero errado de usu�rios com livros em atraso");
		}

		System.out.println("Testando getLivrosClassificadosPorAno()...");
		Set<Integer> anos = new HashSet<Integer>();
		anos.add(1979);
		anos.add(1980);
		Map<Integer, Set<Livro>> porAno = biblioteca.getLivrosClassificadosPorAno(anos);
		if(porTipo.get(1979).size() != 1){
			System.out.println("Numero errado de livros de 1979");
		}
		if(porTipo.get(1980).size() != 1){
			System.out.println("Numero errado de livros de 1980");
		}
		
		String relatorio = biblioteca.getRelatorioPorTipo();
		System.out.println(relatorio);
	}

}
