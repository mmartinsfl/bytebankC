package bytebankc;


public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		matheus.nome = "Matheus Martins";
		matheus.cpf = "142.367.234-90";
		matheus.profissao = "programador";
		
		Conta contaDoMatheus = new Conta();
		contaDoMatheus.deposita(100);
		
		// associa o cliente a conta//
		
		contaDoMatheus.titular = matheus;
		System.out.println(contaDoMatheus.titular.nome);
		System.out.println(contaDoMatheus.titular);
		System.out.println(matheus);
	}
}
