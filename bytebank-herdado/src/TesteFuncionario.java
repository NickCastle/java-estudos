
public class TesteFuncionario {

	public static void main(String[] args) {
		
		//----------------------------------------------------------------
		
		Gerente bia = new Gerente();
		
		bia.setNome("Bibia");
		bia.setCpf("222.222.222-22");
		bia.setSalario(2000);
		bia.setSenha(12345);
		
		
		//-----------------------------------------------------------------
		

		Editor guga = new Editor();
		guga.setNome("Guga");
		guga.setCpf("333.333.333-33");		
		guga.setSalario(3000);
		
		//-----------------------------------------------------------------
		
		ControleBonificacao controle = new ControleBonificacao();
	
		controle.registra(bia);
		controle.registra(guga);
		
		System.out.println(controle.getSoma());
		
		
	}

}
