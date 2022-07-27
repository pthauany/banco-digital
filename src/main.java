
public class main {

	public static void main(String[] args) {
		
		Cliente thauany = new Cliente();
		thauany.setNome("Thauany");
		
		Conta cc = new Corrente(thauany);
		cc.depositar(100);
		
		Conta poupanca = new Poupanca(thauany);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
