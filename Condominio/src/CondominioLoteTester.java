public class CondominioLoteTester {

	public static void main(String[] args) {
		System.out.println("Testando classe Lote...");
		System.out.println();
		testaLote();
		System.out.println();
		System.out.println();
		
		System.out.println("Testando classe Condominio...");
		System.out.println();
		testaCondominio();
		System.out.println();
		System.out.println();
	}

	public static void testaLote() {
		System.out.println("Criando um lote...");
		Lote lote = new Lote(11, 30.0, 40.0);
		System.out.println();

		System.out.println("Testando m�todos de Lote...");
		System.out.println("-Numero esperado: 11");
		System.out.println("-Numero: " + lote.getNumero());
		System.out.println("-Largura esperado: 30.0");
		System.out.println("-Largura: " + lote.getLargura());
		System.out.println("-Comprimento esperado: 40.0");
		System.out.println("-Comprimento: " + lote.getComprimento());
		System.out.println("-Area esperada: 1200.0");
		System.out.println("-Area: " + lote.getArea());
		System.out.println("-Perimetro esperado: 140.0");
		System.out.println("-Perimetro: " + lote.getPerimetro());
	}

	public static void testaCondominio() {
		System.out.println("Criando um condominio...");

		Condominio cond = new Condominio("Condominio Ola Mundo", 30);

		System.out.println("Criando e adicionando lotes para teste...");
		cond.addLote(new Lote(11, 30.0, 40.0));
		cond.addLote(new Lote(12, 10.0, 20.0));
		cond.addLote(new Lote(13, 12.0, 15.0));
		cond.addLote(new Lote(14, 30.0, 40.0));
		cond.addLote(new Lote(15, 15.0, 23.0));

		System.out.println("Testando adicao...");
		
		System.out.println("-Numero esperado de lotes adicionados: 5");
		System.out.println("-Numero de lotes adicionados: " + cond.getNumLotes());
		System.out.println();
		
		System.out.println("Testando getLote...");
		Lote lote = cond.getLote(14);
		System.out.println("-Numero esperado: 14");
		System.out.println("-Numero: " + lote.getNumero());
		System.out.println("-Largura esperado: 30.0");
		System.out.println("-Largura: " + lote.getLargura());
		System.out.println("-Comprimento esperado: 40.0");
		System.out.println("-Comprimento: " + lote.getComprimento());
		System.out.println("-Area esperada: 1200.0");
		System.out.println("-Area: " + lote.getArea());
		System.out.println("-Perimetro esperado: 140.0");
		System.out.println("-Perimetro: " + lote.getPerimetro());
		System.out.println();

		
		System.out.println("Area total esperada: 3125.0");
		System.out.println("Area total: " + cond.getAreaTotal());
		System.out.println("Petrimetro total esperado: 470.0");
		System.out.println("Petrimetro total: " + cond.getPerimetroTotal());
		System.out.println();
		
		System.out.println("Testando removeLote...");
		boolean removido = cond.removeLote(12);
		
		System.out.println("-Esperado lote 12 removido esperado: true");
		System.out.println("-Esperado lote 12 removido: " + removido);
		System.out.println("-Numero esperado de lotes remanescentes: 4");
		System.out.println("-Esperado lote 12 removido: " + cond.getNumLotes());
		System.out.println("-Nova area total esperada apos remocao: 2925.0");
		System.out.println("-Nova area total apos remocao: " + cond.getAreaTotal());

		System.out.println("-Testando getLote no lote removido...");
		Lote loteTeste1 = cond.getLote(12);
		System.out.println("--Valor esperado: null");
		System.out.println("--Valor obtido: " + loteTeste1);
		
	}

}
