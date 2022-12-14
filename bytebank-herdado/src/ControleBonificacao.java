public class ControleBonificacao {

	private double soma;
	
	//-------------------------------------------------------
	
	//public void registra(FuncionarioGerente g) {
	//	double boni = g.getBonificacao();
	//	this.soma = this.soma + boni;
	//}
	
	//-------------------------------------------------------
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	//-------------------------------------------------------
	
	//public void registra(Editor e) {
	//	double boni = e.getBonificacao();
	//	this.soma = this.soma + boni;
	//}

	//-------------------------------------------------------
		
	public double getSoma() {
		return soma;
	}
	
}
