
public class Gerente extends Funcionario implements Autentica {

	private AutenticacaoUtil util;
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
	}
	//---------------------------------------------
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + super.salario;
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
	
	
}
