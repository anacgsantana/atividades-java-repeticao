//Fa�a um programa que receba dois nros e mostre o maior. Se por acaso, os dois nros 
//forem iguais, imprima a msg: N�meros Iguais. 

package atividades2;

import java.util.*;

public class Ex07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner nro = new Scanner(System.in);
		System.out.println("Digite o 1� nro: ");
		int nro1 = nro.nextInt();

		System.out.println("Digite o 2� nro: ");
		int nro2 = nro.nextInt();

		if (nro1 > nro2) {
			System.out.printf("O primeiro nro � maior", nro1);
		} else if (nro2 > nro1) {
			System.out.printf("O segundo nro � maior", nro2);
		} else {
			System.out.println("N�meros Iguais");
		}
	}
}
