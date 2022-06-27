//Escreva um programa que, dados dois nros inteiros, mostre 
//na tela o maior deles, assim como a diferença existente
//entre ambos.

package atividades2;

import java.util.*;

public class Ex06 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o primeiro nro");
		int nro1 = sc.nextInt();

		System.out.println("Escreva o segundo nro");
		int nro2 = sc.nextInt();

		int dif1 = (nro1 - nro2);
		int dif2 = (nro2 - nro1);

		if (nro1 > nro2) {
			System.out.println("O primeiro nro é maior");
			System.out.println("A diferença existente entre os nros é " + dif1);
		} else {
			System.out.println("O segundo nro é maior");
			System.out.println("A diferença existente entre os nros é " + dif2);
		}
	}
}
