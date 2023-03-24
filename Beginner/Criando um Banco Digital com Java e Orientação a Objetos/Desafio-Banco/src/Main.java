
public class Main {
	public static void main(String[] args) {
		Cliente ruan = new Cliente();
		ruan.setNome("Ruan");
		
		Conta cc = new ContaCorrente(ruan);
		Conta pp = new ContaPoupanca(ruan);
		cc.depositar(100);
		
		cc.transferir(100, pp);
		
		cc.imprimirExtrato();
		pp.imprimirExtrato();
	}
}
