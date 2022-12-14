
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.1;
		return super.saca(valorASacar);
	}
}
