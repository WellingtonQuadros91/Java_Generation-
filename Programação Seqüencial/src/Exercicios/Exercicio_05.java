package Exercicios;

	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
	respectivamente.*/

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media; 
		
		System.out.println("Digite as 3 notas do aluno: ");
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a 3ª nota: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1*2 + nota2*3 + nota3*5)/10);
		System.out.println("A média ponderada é: " + media);

	}

}
