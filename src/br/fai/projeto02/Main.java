package br.fai.projeto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.Start();

	}

	private void Start() {

		Scanner scan = new Scanner(System.in);
		double valor = scan.nextDouble();
		if(valor < 100)
		{
			int valor2 = (int) valor;
			double ueh = valor2;
			System.out.println("Valor com casas decimais: " + valor);
			System.out.println("Valor sem casas decimais: " + valor2);
			System.out.println("Valor com casas decimais(depois de convertido): " + ueh);
		}
	}

}
