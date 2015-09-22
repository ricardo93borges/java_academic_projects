package tests;

import java.util.Arrays;

import atracoes.Ator;
import atracoes.Banda;
import atracoes.Festival;
import atracoes.Musico;
import atracoes.Novela;

public class SimpleTest {

	public static void main(String[] args){
		teste1();
		System.out.println();
		teste2();
	}

	public static void teste1(){
		System.out.println("Rodando teste 1:");
		System.out.println("Criando banda 1...");
		Banda b1 = new Banda("Fulano e Ciclano", "Sertanejo Pos-graduado");
		b1.addIntegrante(new Musico("Fulano", 24));
		b1.addIntegrante(new Musico("Ciclano", 27));
		
		System.out.println("Criando banda 2...");
		Banda b2 = new Banda("Os Efes", " Functional Metal");
		b2.addIntegrante(new Musico("F1", 23));
		b2.addIntegrante(new Musico("F2", 34));
		b2.addIntegrante(new Musico("F3", 21));
		
		System.out.println("Criando banda 3...");
		Banda b3 = new Banda("Gaudérios Cromáticos", "Jazz Farroupilha");
		b3.addIntegrante(new Musico("Gaudencio,", 45));
		b3.addIntegrante(new Musico("Florencio,", 56));
		b3.addIntegrante(new Musico("Clemencio,", 53));
		b3.addIntegrante(new Musico("Prudencio", 55));
		
		System.out.println("Criando Festival...");
		Festival f1 = new Festival("Festival 1", 200, "23:00");
		f1.addBanda(b1);
		f1.addBanda(b2);
		f1.addBanda(b3);
		
		System.out.println("Verificando Festival...");
		
		System.out.println("Duracao minutos esperada: 200");
		System.out.println("Duracao minutos:"+f1.getDuracaoMinutos());
		System.out.println("Horario esperado: 23:00");
		System.out.println("Horario :"+f1.getHorario());
		System.out.println("Titulo esperado: Festival das bandas com Fulano & Ciclano, Os Efes, Gaudérios Cromáticos");
		System.out.println("Titulo :"+f1.getTitulo());
		System.out.println("Artistas esperados: [(Musico: Fulano, 24), (Musico: Ciclano, 27), (Musico:F1, 23), (Musico: F2, 34), (Musico: F3, 21), (Musico: Gaudencio, 45), (Musico:Florencio, 56), (Musico: Clemencio, 53), (Musico: Prudencio, 55)]");
		System.out.println("Artistas :"+Arrays.toString( f1.getArtistas()) );
		
	}
	
	public static void teste2(){
		System.out.println("Rodando teste 2:");
		System.out.println("Criando novela...");
		
		Novela n = new Novela("Joões e Marias", 60, "20:00");
		n.addArtista(new Ator("João I", 20));
		n.addArtista(new Ator("João II", 23));
		n.addArtista(new Ator("João III", 25));
		n.addArtista(new Ator("João IIII", 26));
		n.addArtista(new Ator("Maria I", 21));
		n.addArtista(new Ator("Maria II", 24));
		n.addArtista(new Ator("Maria III", 26));
		n.addArtista(new Ator("Maria IIII", 27));
		
		System.out.println("Verificando novela...");
		
		System.out.println("Duracao esperada: 60");
		System.out.println("Duracao minutos: "+n.getDuracaoMinutos());
		System.out.println("Horario esperado: 20:00");
		System.out.println("Horario: "+n.getHorario());
		System.out.println("Titulo esperado: Joões e Marias");
		System.out.println("Titulo: "+n.getTitulo());
		System.out.println("Artistas esperados:  [(Ator: Joao I, 20), (Ator: Joao II, 23), (Ator: Joao III, 25), (Ator: Joao IV, 26), (Ator: Maria I, 21), (Ator: Maria II, 24), (Ator: Maria III, 26), (Ator: Maria IV, 27)");
		System.out.println("Artistas :"+Arrays.toString( n.getArtistas()) );
	}
}
