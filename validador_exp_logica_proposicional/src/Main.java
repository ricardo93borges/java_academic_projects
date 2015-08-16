import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Informe uma expressão lógica:");
		String e = s.nextLine();
		String exp = "(p&q)>>(p|q)&(p&q)";
		
		Validador v = new Validador();
		
		if(v.validar(exp)){
			System.out.println("Expressão válida.");
		}else{
			System.out.println("Expressão inválida.");
		}		
	}
}