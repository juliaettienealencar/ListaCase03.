package pctExercicio03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner receba = new Scanner(System.in);
        
        double saldoMedio, credito;
        
        System.out.print("Digite o saldo médio do cliente: ");
        saldoMedio = receba.nextDouble();
        
        if (saldoMedio <= 500) {
            credito = 0;
        } else if (saldoMedio <= 1000) {
            credito = saldoMedio * 0.30;
        } else if (saldoMedio <= 3000) {
            credito = saldoMedio * 0.40;
        } else {
            credito = saldoMedio * 0.50;
        }
        
        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Valor do crédito: R$ " + credito);
        
        receba.close();
    }
}