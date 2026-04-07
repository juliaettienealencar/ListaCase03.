package pctExercicio12;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = receba.nextInt();

		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("Múltiplo de 3 e 5");
		} else if (numero % 3 == 0) {
			System.out.println("Apenas múltiplo de 3");
		} else if (numero % 5 == 0) {
			System.out.println("Apenas múltiplo de 5");
		} else {
			System.out.println("Nenhum");
		}

		receba.close();
	}
}