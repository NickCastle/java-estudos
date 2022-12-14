
public class Admin extends Funcionario implements Autentica {
	
	private AutenticacaoUtil util;
	
	public Admin() {
		this.util = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha){
	return this.util.autentica(senha);
	}
}