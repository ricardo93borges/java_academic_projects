package testers;

public class TesterGeral {

	public static void main(String[] args) {
		ResistorTester.testaResistor();
		System.out.println("\n");
		
		CircuitoParaleloTester.testCircuitoParalelo1();
		CircuitoParaleloTester.testCircuitoParalelo2();
		System.out.println("\n");

		CircuitoSerialTester.testCircuitoSerial1();
		CircuitoSerialTester.testCircuitoSerial2();
		System.out.println("\n");
		
		CircuitoTester.testCircuitoCompleto();
	}

	
	
}
