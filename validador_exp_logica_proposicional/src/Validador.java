import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Validador {

	private String entrada;
	private String[] operadores = {"&","|",">"};//operadores com regra em comum
	private Map<String, String[]> regras = new HashMap<String, String[]>();

	public Validador() {
		this.regras();
	}

	public String[] getOperadores() {
		return operadores;
	}

	public void setOperadores(String[] operadores) {
		this.operadores = operadores;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	

	public Map<String, String[]> getRegras() {
		return regras;
	}

	public void setRegras(Map<String, String[]> regras) {
		this.regras = regras;
	}
	
	public boolean contem(String[] lista, String item){
		for(int j=0; j < lista.length; j++){
			if(lista[j].equals(item)){
				return true;
			}
		}
		return false;
	}

	public boolean validar(String entrada){
		entrada = entrada+"_";
		String[] regras;
		String caractere;
		
		//validar primeiro caractere
		char first = entrada.charAt(0);
		if(!this.validarPrimeiroCaractere(first)){
			return false;
		}
		//validar os demais caracteres
		for(int i=0; i < entrada.length()-1; i++){
			regras = this.regras.get(String.valueOf(entrada.charAt(i)));
			caractere = String.valueOf(entrada.charAt(i+1));
			
			if(String.valueOf(entrada.charAt(i)).equals(">") && String.valueOf(entrada.charAt(i+1)).equals(">")){
				regras = this.regras.get(">>");
			}
			
			if(!contem(regras, caractere)){
				return false;
			}
		}
		//verificar se todos os parenteses foram fechados
		int parentesesAbertos = 0, parentesesFechados = 0;
		for(int i=0; i < entrada.length(); i++){
			if(entrada.charAt(i) == '('){
				parentesesAbertos++;
			}else if(entrada.charAt(i) == ')'){
				parentesesFechados++;
			}
		}
		if(parentesesAbertos != parentesesFechados){
			return false;
		}
		return true;
	}
	
	public boolean validarPrimeiroCaractere(char caractere){
		if(this.contem(this.regras.get("first"), String.valueOf(caractere))){
			return true;
		}
		return false;
	}
	
	public void regras(){
		String[] regra1 = {"~", "p", "q"};
		String[] regra2 = {")", "~", "|", ">", "&", ">>", "_"};
		String[] regra3 = {"~", "p", "("};
		String[] regra4 = {"~", "p", "q", ")", "|", ">", "&", ">>", "_"};
		String[] regra5 = {"~", "p", "q", "("};
		String[] regra6 = {"~", "p", "q", "(", ">"};
		
		this.regras.put("(", regra1);
		this.regras.put("p", regra2);
		this.regras.put("q", regra2);
		this.regras.put(")", regra4);
		this.regras.put("~", regra3);
		this.regras.put(">>", regra6);
		this.regras.put("first", regra5);
		
		for(int i=0; i < this.operadores.length; i++){
			this.regras.put(this.operadores[i], regra5);
		}
	}
}
