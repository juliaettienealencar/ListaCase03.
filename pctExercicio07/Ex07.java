package pctExercicio07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner receba = new Scanner(System.in);

        double valorCompra, valorFinal;

        System.out.print("Digite o valor da compra: ");
        valorCompra = receba.nextDouble();

        valorFinal = (valorCompra > 100) ? valorCompra * 0.90 : valorCompra;

        System.out.println("Valor final: R$ " + valorFinal);

        receba.close();
    }
}
