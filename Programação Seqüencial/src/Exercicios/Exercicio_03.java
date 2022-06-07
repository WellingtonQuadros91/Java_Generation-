package Exercicios;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
  expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/


import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int resto, horas, minutos, segundos;
		
		System.out.println("Digite quantos segundos durou o evento da fábrica: ");
		segundos = leia.nextInt();
		
		resto = segundos % 3600;
		horas = segundos / 3600;
		minutos = resto / 60; 
		segundos = resto % 60; 
		
		System.out.println("O evento durou " +horas+ " horas " +minutos+ " minutos e " +segundos+ " segundos");
		

	}

}
