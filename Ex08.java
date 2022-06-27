//Faça um programa que leia 2 notas de um aluno, verifique se as 
//notas são válidas e exiba na tela a média destas notas. Uma nota 
//válida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, 
//onde caso a nota não possua um valor válido, este fato deve ser 
//informado ao usuário e o programa termina. 

package atividades2;

import java.util.*;

public class Ex08 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner nr = new Scanner(System.in);
		System.out.println("De 0 a 10, informe a primeira nota: ");
		float nota1 = nr.nextInt();

		System.out.println("De 0 a 10, informe a segunda nota: ");
		float nota2 = nr.nextInt();

		float media = (nota1 + nota2) / 2;

		var resultado = (nota1 > 0 && nota1 < 11 && nota2 > 0 && nota2 < 11) ? media : "Nota Inválida";
		System.out.println(resultado);
	}
}
