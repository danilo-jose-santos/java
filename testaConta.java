package aula6;

public class testaConta {

	public static void main(String[] args) {


		conta conta01 = new conta(); //instancia - criando um objeto. Estou instanciando
		
		conta01.numConta = 1111;
		conta01.nome = "Joao";
		conta01.agencia = "1.111-1";
		conta01.saldo = 11111;
		
		conta01.extrato();

		
		conta conta02 = new conta(); //instancia - criando um objeto. Estou instanciando
		
		conta02.numConta = 2222;
		conta02.nome = "Jose";
		conta02.agencia = "2.222-2";
		conta02.saldo = 22222;
		
		conta02.extrato();

	}

}
