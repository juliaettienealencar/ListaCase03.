package pctExercicio06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        double num1, num2, resultado = 0;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = receba.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = receba.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = receba.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    receba.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                receba.close();
                return;
        }
        System.out.println("Resultado: " + resultado);

        receba.close();
    }
}
