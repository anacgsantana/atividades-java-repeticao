//Fa�a um programa que leia o sal�rio de um trabalhador e o valor da presta��o de um empr�stimo. Se a presta��o for maior 
//que 20% do sal�rio, imprima: Empr�stimo n�o concedido. Caso contr�rio, imprima: Empr�stimo Concedido. 

package atividades2;

import java.util.*;

public class Ex09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner vl = new Scanner(System.in);

		System.out.println("Informe o sal�rio: ");
		int sal = vl.nextInt();

		System.out.println("Informe o valor da presta��o do empr�stimo");
		int prest = vl.nextInt();

		double calc = (sal * 0.20);

		var resultado = (prest > calc) ? "Empr�stimo n�o concedido" : "Empr�stimo Concedido";
		System.out.println(resultado);

	}
}
