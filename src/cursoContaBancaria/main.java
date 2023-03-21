package cursoContaBancaria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da conta: ");
		int codigo = sc.nextInt();
		System.out.println("Digite o nome do titular da conta: ");
		String nome = sc.next();
		
		System.out.println("Tem um depósito inicial? (s/n)");
		char resposta = sc.next().charAt(0);
		
		
		if(resposta == 's')
		{
			System.out.println("Digite o depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			
			Conta x = new Conta(codigo, nome,depositoInicial);
			System.out.println(x);	
			
			System.out.println("Entre com o valor do novo deposito: ");
			x.depositar(sc.nextDouble());
			System.out.println(x);	
			
			System.out.println("Entre com o valor do novo saque: ");
			x.sacar(sc.nextDouble());
			System.out.println(x);	
			
			
		}
		else if (resposta =='n')
		{
			Conta x = new Conta(codigo, nome);
			System.out.println(x);
			
			System.out.println("Entre com o valor do novo deposito: ");
			x.depositar(sc.nextDouble());
			System.out.println(x);	
			
			System.out.println("Entre com o valor do novo saque: ");
			x.sacar(sc.nextDouble());
			System.out.println(x);	
			
			
			
		}
		
	
	}

}
