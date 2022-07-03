//Escreva um programa que leia um nro inteiro maior do que zero e devolva, na tela a soma de todos
//os seus algarismos. Por exemplo, ao nro 251 corresponderá o valor 8(2+5+1). Se o nro não lido for 
//maior do que zero, o programa terminará com a mensagem: "Número Inválido"

package atividades2;

import java.util.*;

public class Ex11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Informe um número: ");
		int num = new Scanner(System.in).nextInt();
		int soma = 0;

		if (num > 0) {
			soma += (num % 10);
			num /= 10;
		}
		System.out.println("O valor de soma é: " + soma);
		System.out.println();
		System.out.println("A soma dos algarismos é: " + soma);
	}

}
