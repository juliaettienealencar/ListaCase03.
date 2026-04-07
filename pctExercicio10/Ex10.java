package pctExercicio10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner receba = new Scanner(System.in);

		        System.out.print("Digite o seu IMC: ");
		        double imc = receba.nextDouble();

		        String classificacao;

		        if (imc < 18) {
		            classificacao = "Magro";
		        } else if (imc <= 25) {  // de 18 a 25
		            classificacao = "Normal";
		        } else {  // acima de 25
		            classificacao = "Acima do peso";
		        }

		        System.out.println("Classificação: " + classificacao);

		        receba.close();
		    }
}
