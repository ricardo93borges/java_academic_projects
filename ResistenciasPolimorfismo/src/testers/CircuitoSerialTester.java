package testers;

import circuito.CircuitoParalelo;
import circuito.CircuitoSerial;
import circuito.Resistor;

public class CircuitoSerialTester {

	public static void testCircuitoSerial1() {
		System.out.println("Testando circuito serial (teste 1)...");

		System.out.println("Criando circuito...");
		CircuitoSerial circ = new CircuitoSerial();

		System.out.println("Adicionando resistores...");
		circ.addResistor(new Resistor(10.0));
		circ.addResistor(new Resistor(7.0));
		circ.addResistor(new Resistor(15.0));

		double total = circ.getResistenciaTotal();
		if (total != 32.0) {
			System.out.println("Teste de circ serial 1: falhou!");
			System.err.println("-Valor de resistencia total esperada: 32.0");
			System.err.println("-Valor obtido: " + total);
		} else {
			System.out.println("Teste de circ serial 1: ok!");
		}

	}
	
	public static void testCircuitoSerial2() {
		System.out.println("Testando circuito serial (teste 2)...");

		System.out.println("Criando circuito...");
		CircuitoSerial circ = new CircuitoSerial();

		System.out.println("Adicionando resistores...");
		circ.addResistor(new Resistor(10.0));
		circ.addResistor(new Resistor(7.0));
		circ.addResistor(new Resistor(15.0));

		System.out.println("Criando subcircuito 1...");
		CircuitoSerial subcirc1 = new CircuitoSerial();
		subcirc1.addResistor(new Resistor(4.0));
		subcirc1.addResistor(new Resistor(6.0));

		System.out.println("Criando subcircuito 2...");
		CircuitoSerial subcirc2 = new CircuitoSerial();
		subcirc2.addResistor(new Resistor(4.0));
		subcirc2.addResistor(new Resistor(5.0));

		System.out.println("Adicionando subcircuitos...");
		circ.addSubCircuito(subcirc1);
		circ.addSubCircuito(subcirc2);
		
		double total = circ.getResistenciaTotal();
		if (total != 51.0) {
			System.out.println("Teste de circ serial 2: falhou!");
			System.err.println("-Valor de resistencia total esperada: 51.0");
			System.err.println("-Valor obtido: " + total);
		} else {
			System.out.println("Teste de circ serial 2: ok!");
		}

	}	
	
}
