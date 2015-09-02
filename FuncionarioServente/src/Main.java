
public class Main {

	public static void main(String[] args){
		
		System.out.println("\n--Testando Funcionario ---");
		Funcionario f1 = new Funcionario(234, "João", 1000);
		System.out.println("Salario liquido esperado 900");
		System.out.println("Salario liquido: "+f1.getSalarioLiquido());
		
		System.out.println("\n--Testando Servente ---");
		Servente s1 = new Servente(134, "Maria", 1000);
		System.out.println("Remuneracao total esperada: 1050");
		System.out.println("Remuneracao: "+s1.getRemuneracaoTotal());
		System.out.println("Salario liquido esperado 945");
		System.out.println("Salario liquido: "+s1.getSalarioLiquido());
		
		System.out.println("\n--Testando Motorista ---");
		Motorista m1 = new Motorista(676, "José", 1000, "344324-3");
		System.out.println("CNH esperado 344324-3");
		System.out.println("CNH: "+m1.getCnh());
		System.out.println("Salario liquido esperado 900");
		System.out.println("Salario liquido: "+m1.getSalarioLiquido());
		
		System.out.println("\n--Testando MestreDeObras ---");
		MestreDeObras mo1 = new MestreDeObras(034, "Joana", 1000);
		for(int i=0; i<15; i++){
			mo1.addFuncionario(new Funcionario(234, "f"+i, 700*i));
		}
		System.out.println("Remuneracao total esperada: 1150");
		System.out.println("Remuneracao: "+mo1.getRemuneracaoTotal());
		System.out.println("Salario liquido esperado 1035");
		System.out.println("Salario liquido: "+mo1.getSalarioLiquido());
		
	}
}
