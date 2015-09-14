package testers;

import circuito.CircuitoParalelo;
import circuito.Resistor;

public class CircuitoParaleloTester {

	public static void testCircuitoParalelo1() {
		System.out.println("Testando circuito paralelo (teste 1)...");

		System.out.println("Criando circuito...");
		CircuitoParalelo circ = new CircuitoParalelo();

		System.out.println("Adicionando resistores...");
		circ.addResistor(new Resistor(10.0));
		circ.addResistor(new Resistor(7.0));
		circ.addResistor(new Resistor(15.0));

		double total = circ.getResistenciaTotal();
		
		if (total - 3.2307 > 0.1) {
			System.out.println("Teste de circ paralelo 1: falhou!");
			System.err.println("-Valor de resistencia total esperada: 3.2307");
			System.err.println("-Valor obtido: " + total);
		} else {
			System.out.println("Teste de circ paralelo 1: ok!");
		}

	}
	
	public static void testCircuitoParalelo2() {
		System.out.println("Testando circuito paralelo (teste 2)...");

		System.out.println("Criando circuito...");
		CircuitoParalelo circ = new CircuitoParalelo();

		System.out.println("Adicionando resistores...");
		circ.addResistor(new Resistor(10.0));
		circ.addResistor(new Resistor(7.0));
		circ.addResistor(new Resistor(15.0));

		System.out.println("Criando subcircuito 1...");
		CircuitoParalelo subcirc1 = new CircuitoParalelo();
		subcirc1.addResistor(new Resistor(4.0));
		subcirc1.addResistor(new Resistor(6.0));

		System.out.println("Criando subcircuito 2...");
		CircuitoParalelo subcirc2 = new CircuitoParalelo();
		subcirc2.addResistor(new Resistor(4.0));
		subcirc2.addResistor(new Resistor(5.0));

		System.out.println("Adicionando subcircuitos...");
		circ.addSubCircuito(subcirc1);
		circ.addSubCircuito(subcirc2);
		
		double total = circ.getResistenciaTotal();
		if (total - 0.8502 > 0.1) {
			System.out.println("Teste de circ paralelo 2: falhou!");
			System.err.println("-Valor de resistencia total esperada: 0.8502");
			System.err.println("-Valor obtido: " + total);
		} else {
			System.out.println("Teste de circ paralelo 2: ok!");
		}

	}	
	
}
