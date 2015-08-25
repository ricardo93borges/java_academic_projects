public class CondominioLoteTester2 {

 	public static void main(String[] args) {
                System.out.println("Testando classe Condominio...");
                System.out.println();
                testaCondominio();
        }

	public static void testaCondominio() {
                System.out.println("Criando um condominio...");

                Condominio cond = new Condominio("Condominio Ola Mundo", 5);

                System.out.println("Criando e adicionando lotes para teste...");

		for(int i=1; i < 7; i++){
			cond.addLote(new Lote(i, 30.0, 40.0));
		}
	
		System.out.println("-Numero esperado de lotes adicionados: 5");
                System.out.println("-Numero de lotes adicionados: " + cond.getNumLotes());

	}
	

}
