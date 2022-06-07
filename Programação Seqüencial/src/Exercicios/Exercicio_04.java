package Exercicios;
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão
		D= (R + S)/2 ;  R = (A + B )^2  ; S = (B + C)^2 */


import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double D, R, S, A, B, C;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextDouble();
		
		R = ((A+B)*(A+B));
		S = ((B+C)*(B+C));
		
		D = ((R+S)/2);
		
		System.out.println("O resultado é: " +D);
	}

}
