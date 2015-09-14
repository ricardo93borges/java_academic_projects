package testers;

import circuito.Resistor;

public class ResistorTester {

	public static void testaResistor(){
		System.out.println("Testando classe Resistor...");
		Resistor r = new Resistor(10.0);
		
		double valor = r.getResistencia();
    	if (valor != 10.0){
			System.out.println("Teste de resistor: falhou!");
			System.err.println("-Valor de resistencia esperado: 10.0");
			System.err.println("-Valor obtido: " + valor);
    	} else {
    		System.out.println("Teste de resistor: ok!");
    	}
		
	}
	
	
}
