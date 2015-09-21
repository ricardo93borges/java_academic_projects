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
		//teste2();
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
		
		System.out.println("Verificando Festival...");
		
		System.out.println("Duracao minutos esperada: 200");
		System.out.println("Duracao minutos:"+f1.getDuracaoMinutos());
		System.out.println("Horario esperado: 23:00");
		System.out.println("Horario :"+f1.getHorario());
		System.out.println("Titulo esperado: Festival das bandas com Fulano & Ciclano, Os Efes, Gaudérios Cromáticos");
		System.out.println("Titulo :"+f1.getTitulo());
		System.out.println("Artistas esperados: [(Musico: Fulano, 24), (Musico: Ciclano, 27), (Musico:F1, 23), (Musico: F2, 34), (Musico: F3, 21), (Musico: Gaudencio, 45), (Musico:Florencio, 56), (Musico: Clemencio, 53), (Musico: Prudencio, 55)]");
		System.out.println("Artistas :"+f1.getArtistas());
		
	}
	
	public static void teste2(){
		System.out.println("Rodando teste 2:");

		System.out.println("Criando novela...");
		//etc...
		
	}
}
