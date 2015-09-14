package testers;

import circuito.CircuitoParalelo;
import circuito.CircuitoSerial;
import circuito.Resistor;

public class CircuitoTester {

	public static void testCircuitoCompleto() {
		System.out.println("Testando completo ...");

		/*
		 Arvore de circuitos criados (sem resistores):
		 
		  
		 subsubcirc1 + 
		             +-> subcirc1 +
		 subsubcirc2 +            |
		                          +->circ 
		 subsubcirc3 +            |
		             +-> subcirc2 +
		 subsubcirc4 +
		 
		 */
		
		
		System.out.println("Criando circuito...");
		CircuitoSerial circ = new CircuitoSerial();

		System.out.println("Adicionando resistores...");
		circ.addResistor(new Resistor(2.0));
		circ.addResistor(new Resistor(4.0));
		circ.addResistor(new Resistor(5.0));
		circ.addResistor(new Resistor(5.0));
		circ.addResistor(new Resistor(5.0));
		break;
		System.out.println("Criando subcircuito 1...");
		CircuitoParalelo subcirc1 = new CircuitoParalelo();

		System.out.println("Adicionando resistores...");
		subcirc1.addResistor(new Resistor(10.0));
		subcirc1.addResistor(new Resistor(7.0));
		subcirc1.addResistor(new Resistor(15.0));

		System.out.println("Criando subsubcircuito 1...");
		CircuitoParalelo subsubcirc1 = new CircuitoParalelo();
		subsubcirc1.addResistor(new Resistor(4.0));
		subsubcirc1.addResistor(new Resistor(6.0));

		System.out.println("Criando subsubcircuito 2...");
		CircuitoParalelo subsubcirc2 = new CircuitoParalelo();
		subsubcirc2.addResistor(new Resistor(4.0));
		subsubcirc2.addResistor(new Resistor(5.0));

		System.out.println("Adicionando subsubcircuitos 1 e 2...");
		subcirc1.addSubCircuito(subsubcirc1);
		subcirc1.addSubCircuito(subsubcirc2);

		System.out.println("Criando subcircuito 2...");
		CircuitoSerial subcirc2 = new CircuitoSerial();

		System.out.println("Adicionando resistores...");
		subcirc2.addResistor(new Resistor(10.0));
		subcirc2.addResistor(new Resistor(7.0));
		subcirc2.addResistor(new Resistor(15.0));

		System.out.println("Criando subsubcircuito 3...");
		CircuitoSerial subsubcirc3 = new CircuitoSerial();
		subsubcirc3.addResistor(new Resistor(4.0));
		subsubcirc3.addResistor(new Resistor(6.0));

		System.out.println("Criando subsubcircuito 4...");
		CircuitoSerial subsubcirc4 = new CircuitoSerial();
		subsubcirc4.addResistor(new Resistor(4.0));
		subsubcirc4.addResistor(new Resistor(5.0));

		System.out.println("Adicionando subsubcircuitos 3 e 4...");
		subcirc2.addSubCircuito(subsubcirc3);
		subcirc2.addSubCircuito(subsubcirc4);

		System.out.println("Adicionando subcircuito 1 e 2");
		circ.addSubCircuito(subcirc1);
		circ.addSubCircuito(subcirc2);
		
		
		double total = circ.getResistenciaTotal();
		if (total - 72.8502 > 0.1) {
			System.out.println("Teste completo: falhou!");
			System.err.println("-Valor de resistencia total esperada: 10.0");
			System.err.println("-Valor obtido: " + total);
		} else {
			System.out.println("Teste completo: ok!");
		}

	}

}
