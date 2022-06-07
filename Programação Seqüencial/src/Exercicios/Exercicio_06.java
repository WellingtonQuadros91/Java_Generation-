package Exercicios;

	/*Construa um programa em que, tendo como dados de entrada dois planos quaisquer do plano P1(x1,y1) e P2(x2,y2)
	escreva a distância entre eles. A fórmula que efetua tal cálculo é d= (raiz)(x1-x2)^2+(y1-y2)^2*/

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		double distancia, x1, y1, x2, y2;
		
		System.out.println("Digite os números para calcular a distância entre eles: ");
		
		System.out.println("Valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Valor de x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Valor de y2: ");
		y2 = leia.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.printf("A distância entre eles é %.2f: ", distancia);
		

	}

}
