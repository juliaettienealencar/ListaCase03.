package pctExercicio13;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner receba = new Scanner(System.in);

	        System.out.print("Digite o primeiro lado: ");
	        int a = receba.nextInt();

	        System.out.print("Digite o segundo lado: ");
	        int b = receba.nextInt();

	        System.out.print("Digite o terceiro lado: ");
	        int c = receba.nextInt();

	        if (a == b && b == c) {
	            System.out.println("Equilátero");
	        } else if (a == b || a == c || b == c) {
	            System.out.println("Isósceles");
	        } else {
	            System.out.println("Escaleno");
	        }

	        receba.close();
	    }
	}

