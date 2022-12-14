
public class CriaConta {

	public static void main(String[] args) {
		
	Conta primeiraConta = new Conta();
	Conta segundaConta = new Conta();
	Conta contaNick = new Conta();
		
	primeiraConta.deposita(150);
	segundaConta.deposita(200);
	
	//--------------------------------------------------
	
	Cliente nick = new Cliente();
	nick.setNome("Nick Castle");
	nick.setCpf("111.222.333-44");
	nick.setProfissao("Programador");
	
	contaNick.setTitular(nick);
			
	//--------------------------------------------------
	
	System.out.println(primeiraConta.getSaldo());
	System.out.println(segundaConta.getSaldo());
	System.out.println(contaNick.getSaldo());
	System.out.println(contaNick.getTitular().getNome());
	
	//--------------------------------------------------
	
}

}
