
public class CarteiraDeContasTester {

	public static void main(String[] args) {
		System.out.println("Criando carteira1 com construtor padrao...");
		
		CarteiraDeContas carteira1 = new CarteiraDeContas("Fulano de Tal");
		System.out.println();
		
		System.out.println("Testando registro de titular...");
		System.out.println("Titular esperado: Fulado de Tal");
		System.out.println("Titular: " + carteira1.getTitular());
		System.out.println();
		
		System.out.println("Testando adicao de contas...");
		carteira1.addConta(1001);
		carteira1.addConta(1002);
		carteira1.addConta(1003, 100.0);
		

		System.out.println("Numero de contas esperado: 3");
		System.out.println("Numero de contas inserido: " +  carteira1.getNumContas());
		System.out.println();
		
		System.out.println("Testando deposito...");
		carteira1.depositar(1002, 10000.0);
		carteira1.depositar(1001, 1000.0);
		carteira1.depositar(1003, 100.0);

		System.out.println("Saldo esperado na conta 1002: 10000.0");
		System.out.println("Saldo na conta 1002: : " +  carteira1.getSaldo(1002));
		System.out.println("Saldo esperado na conta 1001: 1000.0");
		System.out.println("Saldo na conta 1001: : " +  carteira1.getSaldo(1001));
		System.out.println("Saldo esperado na conta 1003: 200.0");
		System.out.println("Saldo na conta 1003: : " +  carteira1.getSaldo(1003));
		System.out.println();

		System.out.println("Testando retirada...");
		double retirado1 = carteira1.retirar(1002);
		double retirado2 = carteira1.retirar(1001,200);

		System.out.println("Saldo esperado na conta 1002: 0.0");
		System.out.println("Saldo na conta 1002: : " +  carteira1.getSaldo(1002));
		System.out.println("Saldo RETIRADO da conta 1002: 10000.0");
		System.out.println("Saldo RETIRADO da conta 1002: " +  retirado1);
		System.out.println("Saldo esperado na conta 1001: 800.0");
		System.out.println("Saldo na conta 1001: : " +  carteira1.getSaldo(1001));
		System.out.println("Saldo RETIRADO da conta 1001: 200.0");
		System.out.println("Saldo RETIRADO da conta 1001: " +  retirado2);
		System.out.println();

		System.out.println("Testando trasnferencia...");
		boolean transferido = carteira1.transferir(1001,1002,500);
		
		System.out.println("Transeferido? Esperado: true; Resultado: " + transferido);
		if (transferido){
			System.out.println("Saldo esperado na conta 1002: 500.0");
			System.out.println("Saldo na conta 1002: : " +  carteira1.getSaldo(1002));
			System.out.println("Saldo esperado na conta 1001: 300.0");
			System.out.println("Saldo na conta 1001: : " +  carteira1.getSaldo(1001));
		}
		System.out.println();

		System.out.println("Testando saldo total...");
		System.out.println("Saldo total esperado: 1000.0");
		System.out.println("Saldo total: " +  carteira1.getSaldoTotal());
		
	}

}