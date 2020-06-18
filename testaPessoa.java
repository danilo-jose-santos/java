package aula6;

public class testaPessoa {

	public static void main(String[] args) {


		pessoa pessoa01 = new pessoa(); //instancia - criando um objeto. Estou instanciando
		
		pessoa01.nome = "Joao";
		pessoa01.endereço = "Rua da pessoa01, 1";
		pessoa01.cpf = "111.111.111-11";
		pessoa01.telefone = "1111-1111";
		pessoa01.nRegistro = 001;
		
		pessoa01.mostrarDetalhes();
		
		pessoa pessoa02 = new pessoa(); //instancia - criando um objeto. Estou instanciando
		
		pessoa02.nome = "Jose";
		pessoa02.endereço = "Rua da pessoa02, 2";
		pessoa02.cpf = "222.222.222-22-11";
		pessoa02.telefone = "2222-2222";
		pessoa02.nRegistro = 002;
		
		pessoa02.mostrarDetalhes();
		
	}

}
