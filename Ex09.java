//Faça um programa que leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a prestação for maior 
//que 20% do salário, imprima: Empréstimo não concedido. Caso contrário, imprima: Empréstimo Concedido. 

package atividades2;

import java.util.*;

public class Ex09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner vl = new Scanner(System.in);

		System.out.println("Informe o salário: ");
		int sal = vl.nextInt();

		System.out.println("Informe o valor da prestação do empréstimo");
		int prest = vl.nextInt();

		double calc = (sal * 0.20);

		var resultado = (prest > calc) ? "Empréstimo não concedido" : "Empréstimo Concedido";
		System.out.println(resultado);

	}
}
