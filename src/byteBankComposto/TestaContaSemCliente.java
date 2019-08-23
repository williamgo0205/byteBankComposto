package byteBankComposto;

public class TestaContaSemCliente {

	public static void main(String[] args) {

		Conta contaDaMarcela = new Conta();		
		System.out.println(contaDaMarcela.getSaldo());
		
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		contaDaMarcela.titular.nome = new Cliente().nome = "MarcelaD2";
		System.out.println(contaDaMarcela.titular.nome);
	}

}
