package Exercicios;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/


import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int resto, anos, meses, dias; 
		
		System.out.println("Digite quantos dias de vida você tem: ");
		dias = leia.nextInt();
		
		resto = dias % 365;
		anos = dias / 356;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println("Você tem " +anos+ " anos " +meses+ " meses e " +dias+ " dias");
			
		
		

	}

}
