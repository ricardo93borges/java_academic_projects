package circuito;

public abstract class Circuito {
	
	private Circuito[] subCircuitos;
	private Resistor[] resistors;
	private int numSubCircuitos = 0;
	private int numResistors = 0;
	
	public Circuito() {
		this.subCircuitos = new Circuito[10];
		this.resistors = new Resistor[10];
	}
	
	public int getNumSubCircuitos() {
		return this.numSubCircuitos;
	}

	public int getNumResistors() {
		return this.numResistors;
	}

	public Circuito[] getSubCircuitos() {
		return subCircuitos;
	}
	public void addSubCircuito(Circuito subCircuito) {
		this.subCircuitos[this.numSubCircuitos++] = subCircuito;
	}
	public Resistor[] getResistors() {
		Resistor[] aux = new Resistor[this.numResistors];
		for(int i=0; i<this.numResistors; i++){
			aux[i] = this.resistors[i];
		}
		return resistors;
	}
	public void addResistor(Resistor resistor) {
		this.resistors[this.numResistors++] = resistor;
	}
	
	public abstract double getResistenciaTotal();
}