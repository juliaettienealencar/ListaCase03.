package pctExercicio05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
        int dia;

        System.out.print("Digite um número de 1 a 7: ");
        dia = receba.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo - Fim de semana");
                break;
            case 2:
                System.out.println("Segunda-feira - Dia útil");
                break;
            case 3:
                System.out.println("Terça-feira - Dia útil");
                break;
            case 4:
                System.out.println("Quarta-feira - Dia útil");
                break;
            case 5:
                System.out.println("Quinta-feira - Dia útil");
                break;
            case 6:
                System.out.println("Sexta-feira - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Fim de semana");
                break;
            default:
                System.out.println("Número inválido! Digite de 1 a 7.");
        }

        receba.close();
    }
}
