package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double depositoInicial=0.0;
		
		
		System.out.print("Entre com o número da conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Nome do Cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Efetuará depósito inicial? (s/n) ");
		char resp = sc.next().charAt(0);
		if(resp == 's' || resp =='S') {
			System.out.print("Entre com o valor do primeiro dedósito: ");
			depositoInicial = sc.nextDouble();
		}
		
		// ------------------------------------------------
		Conta c2 = new Conta(nome, conta, depositoInicial);

		impCab();
		System.out.println(c2);
		System.out.println();
		
		// ------------------------------------------------
		System.out.print("Entre com o valor do depósito: ");
		c2.deposito(sc.nextDouble());
		
		impCab();
		System.out.println(c2);
		System.out.println();
		
		// ------------------------------------------------
		System.out.print("Entre com o valor do saque: ");
		c2.saque(sc.nextDouble());
		
		impCab();
		System.out.println(c2);
		System.out.println();
		
		// ------------------------------------------------
		sc.close();
		
	}
	public static void impCab() {
		System.out.println();
		System.out.println("Dados da Conta");
		System.out.println("--------------");
	}

}
