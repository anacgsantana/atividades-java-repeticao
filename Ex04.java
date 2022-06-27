//Faça um programa que leia um nro e, caso ele seja positivo, calcule e mostre: 
// - O nro digitado ao quadrado
// - A raiz quadrada do nro digitado

package atividades2;

import java.util.*;

public class Ex04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner nr = new Scanner(System.in);
		System.out.println("Informe um nro");
		
		int nro = nr.nextInt();
		if ((nro % 2) == 0) {
			System.out.println(nro * nro); //nro digitado ao quadrado
		
		} else {
			System.out.printf("%.2f", Math.sqrt(nro)); //raiz quadrada do nro digitado
		}
	}
}
