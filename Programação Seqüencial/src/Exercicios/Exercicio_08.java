package Exercicios;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.*/

public class Exercicio_08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, percentagemDistribuidor, custoConsumidor, impostos;
		
		System.out.println("Digite o valor de custo de f�brica do carro: ");
		custoFabrica = leia.nextDouble();
		
		percentagemDistribuidor = (28 * custoFabrica) / 100;
		impostos = (45 * custoFabrica) / 100; 
		custoConsumidor = custoFabrica + percentagemDistribuidor + impostos; 
		
		System.out.printf("O custo do carro para o consumidor ser� R$ %.2f", custoConsumidor);
		

	}

}
