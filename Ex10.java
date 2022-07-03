//Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal, utilizando as seguintes
//fórmulas (onde h corresponde à altura):
//-Homens: (72.7*h)-58
//-Mulheres: (62.1*h)-44,7

package atividades2;

import java.util.*;

public class Ex10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o sexo: ");
		String sex = sc.nextLine();

		System.out.println("Informe a altura: ");
		double h = sc.nextDouble();

		if (sex == "M") {
			var calc = (72.7 * h) - 58;
			System.out.printf("O peso ideal para o paciente é: ", calc);
		} else {
			var calc = (62.1 * h) - 44.7;
			System.out.printf("O peso ideal para a paciente é: ", calc);
			
			System.out.println(calc);

		}

	}
}
