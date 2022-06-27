//Faça um programa que receba 2 nros e mostre qual deles é o maior. 

package atividades2;

import java.util.*;

public class Ex01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nro1, nro2;

		Scanner nr = new Scanner(System.in);

		System.out.println("Informe o primeiro nro: ");
		nro1 = nr.nextInt();

		System.out.println("Informe o segundo nro: ");
		nro2 = nr.nextInt();

		if (nro1 > nro2) {
			System.out.println(nro1);
		} else {
			System.out.println(nro2);
		}

	}
}
