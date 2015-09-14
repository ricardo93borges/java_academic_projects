package circuito;

public class CircuitoSerial extends Circuito{
	
	public CircuitoSerial() {
		super();
	}

	public double getResistenciaTotal(){
		double total = 0.0;
		Resistor[] resistors = this.getResistors();
		System.out.println("numResistors: "+this.getNumResistors());
		for(int i = 0; i < this.getNumResistors(); i++){
			System.out.println(">>>"+resistors[i].getResistencia());
			total += resistors[i].getResistencia();
		}
		return total;
	}
}
