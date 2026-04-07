package pctExercicio02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);
		
		 System.out.print("Digite o peso (kg): ");
	        double peso = receba.nextDouble();

	        System.out.print("Digite a altura (m): ");
	        double altura = receba.nextDouble();

	        double imc = peso / (altura * altura);

	       

	        if (imc < 18.5) {
	            System.out.println("Abaixo do peso");
	        } else if (imc >= 18.5 && imc < 25) {
	            System.out.println("Normal");
	        } else if (imc >= 25 && imc < 30) {
	            System.out.println("Sobrepeso");
	        } else if (imc >= 30 && imc < 40) {
	            System.out.println("Obesidade");
	        } else {
	            System.out.println("Obesidade Mórbida");
	        }

	        receba.close();
	    }
	}
