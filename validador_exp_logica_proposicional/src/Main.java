import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Informe uma expressão lógica:");
		String exp = s.nextLine();
		//String exp = "(p&q)>>(p|q)&(p&q)";
		
		Validador v = new Validador();
		
		if(v.validar(exp)){
			System.out.println("Fórmula proposicional bem formada.");
		}else{
			System.out.println("Isto não é uma formula.");
		}		
	}
}
