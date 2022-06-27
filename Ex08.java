//Fa�a um programa que leia 2 notas de um aluno, verifique se as 
//notas s�o v�lidas e exiba na tela a m�dia destas notas. Uma nota 
//v�lida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, 
//onde caso a nota n�o possua um valor v�lido, este fato deve ser 
//informado ao usu�rio e o programa termina. 

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

		var resultado = (nota1 > 0 && nota1 < 11 && nota2 > 0 && nota2 < 11) ? media : "Nota Inv�lida";
		System.out.println(resultado);
	}
}
