package pctExercicio08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

		System.out.print("Digite o usuário: ");

		String usuario = receba.nextLine();

		System.out.print("Digite a senha: ");

		String senha = receba.nextLine();

		if (usuario.equals("admin") && senha.equals("123")) {

			System.out.println("Acesso permitido");

		} else {

			System.out.println("Acesso negado");

		}

		receba.close();
	}
}
