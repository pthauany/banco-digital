
public class Poupanca extends Conta {

	public Poupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfoComuns();
	}

}
