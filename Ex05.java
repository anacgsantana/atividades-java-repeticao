//Fa�a um programa que receba um nro inteiro e verifique se este nro � par ou �mpar. 

package atividades2;

import java.util.*;

public class Ex05 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner nr = new Scanner(System.in);
		System.out.println("Informe um nro");

		int nro = nr.nextInt();
		if ((nro % 2) == 0) {
			System.out.println("O Nro " +nro+" � par");
		}else {
			System.out.println("O Nro " +nro+" � �mpar");
		}
	}

}