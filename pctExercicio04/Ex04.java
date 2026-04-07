package pctExercicio04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner receba = new Scanner(System.in);

	        int prato, sobremesa, bebida;
	        int calorias = 0;

	        System.out.println("Escolha o prato:");
	        System.out.println("1 - Vegetariano (180 cal)");
	        System.out.println("2 - Peixe (230 cal)");
	        System.out.println("3 - Frango (250 cal)");
	        System.out.println("4 - Carne (350 cal)");
	        prato = receba.nextInt();

	        switch (prato) {
	            case 1: calorias += 180; break;
	            case 2: calorias += 230; break;
	            case 3: calorias += 250; break;
	            case 4: calorias += 350; break;
	            default: System.out.println("Prato inválido!");
	        }

	        System.out.println("\nEscolha a sobremesa:");
	        System.out.println("1 - Abacaxi (75 cal)");
	        System.out.println("2 - Sorvete diet (110 cal)");
	        System.out.println("3 - Mousse diet (170 cal)");
	        System.out.println("4 - Mousse chocolate (200 cal)");
	        sobremesa = receba.nextInt();

	        switch (sobremesa) {
	            case 1: calorias += 75; break;
	            case 2: calorias += 110; break;
	            case 3: calorias += 170; break;
	            case 4: calorias += 200; break;
	            default: System.out.println("Sobremesa inválida!");
	        }

	        System.out.println("\nEscolha a bebida:");
	        System.out.println("1 - Chá (20 cal)");
	        System.out.println("2 - Suco de laranja (70 cal)");
	        System.out.println("3 - Suco de melão (100 cal)");
	        System.out.println("4 - Refrigerante diet (65 cal)");
	        bebida = receba.nextInt();

	        switch (bebida) {
	            case 1: calorias += 20; break;
	            case 2: calorias += 70; break;
	            case 3: calorias += 100; break;
	            case 4: calorias += 65; break;
	            default: System.out.println("Bebida inválida!");
	        }

	        System.out.println("\nTotal de calorias da refeição: " + calorias + " cal");

	        receba.close();
	    }
	}
