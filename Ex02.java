//Fa�a um programa que leia um nro fornecido pelo usu�rio. Se esse nro 
//for positivo,calcule a raiz quadrada do nro. Se o nro for
//negativo, mostre uma mensagem dizendo que o nro � inv�lido 

package atividades2;

import java.util.*;

public class Ex02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner nr = new Scanner(System.in);
		System.out.println("Forne�a  um nro");
		int nro = nr.nextInt();

		if ((nro % 2) == 0) {
			var pos = Math.sqrt(nro);
			{
				System.out.printf("%.2f",pos);
			}
		} else {
			System.out.println("Nro Inv�lido");
		}
	}
}
