package Exercicios;

/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/


import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, meses, dias, total; 
		
		System.out.println("Digite sua idade: ");
		idade = (int) leia.nextDouble();
		
		System.out.println("Digite quantos meses voc� tem de vida: ");
		meses = (int) leia.nextDouble();
		
		System.out.println("Digite quantos dia voc� tem de vida");
		dias = (int) leia.nextDouble();
		
		total = 0; 
		total += (idade*365);
		total += (meses*30);
		total += dias;
		
		System.out.println("O total de dias �: " + total);
		
		

	}

}
