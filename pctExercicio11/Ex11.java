package pctExercicio11;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner receba = new Scanner(System.in);
	        double saldo = 1000.0; 
	        int opcao;

	        do {
	            System.out.println("\n=== MENU ===");
	            System.out.println("1 - Ver saldo");
	            System.out.println("2 - Depositar");
	            System.out.println("3 - Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            opcao = receba.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Seu saldo é: R$ " + saldo);
	                    break;

	                case 2:
	                    System.out.print("Digite o valor para depositar: ");
	                    double deposito = receba.nextDouble();
	                    saldo += deposito;
	                    System.out.println("Depósito realizado com sucesso!");
	                    break;

	                case 3:
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Opção inválida!");
	            }

	        } while (opcao != 3);

	        receba.close();
	    }
	}
