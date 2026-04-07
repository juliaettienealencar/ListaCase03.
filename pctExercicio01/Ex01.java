package pctExercicio01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		if (numero % 10 == 0) {
			System.out.println("É divisível por 10");
		} else if (numero % 5 == 0) {
			System.out.println("É divisível por 5");
		} else if (numero % 2 == 0) {
			System.out.println("É divisível por 2");
		} else {
			System.out.println("Não é divisível por 10, 5 ou 2");
		}

		scanner.close();
	}
}
