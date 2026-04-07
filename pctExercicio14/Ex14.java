package pctExercicio14;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner receba = new Scanner(System.in);

	        System.out.print("Digite o valor unitário do produto (R$): ");
	        double valorUnitario = receba.nextDouble();

	        System.out.print("Digite a quantidade comprada: ");
	        int quantidade = receba.nextInt();

	        System.out.print("Digite o percentual de IPI (%): ");
	        double ipi = receba.nextDouble();

	        double totalSemImposto = valorUnitario * quantidade;

	        double valorIPI = totalSemImposto * (ipi / 100);
	        
	        double totalComImposto = totalSemImposto + valorIPI;

	        System.out.println("\nValor sem imposto: R$ " + totalSemImposto);
	        System.out.println("Valor do IPI: R$ " + valorIPI);
	        System.out.println("Valor total com imposto: R$ " + totalComImposto);

	        receba.close();
	    }
}
