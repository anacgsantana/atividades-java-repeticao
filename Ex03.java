//Leia um nro real. Se o nro for positivo imprima a raiz quadrada. Do contrário,
//imprima o nro ao quadrado. 

package atividades2;

import java.util.*;

public class Ex03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner nr = new Scanner(System.in);

		System.out.println("Informe um nro: ");
		int nro = nr.nextInt();
		if ((nro % 2) == 0) {
			var pos = Math.sqrt(nro);
			System.out.println(pos);
		} else {
			var neg = (nro * nro);
			System.out.println(neg);
		}
	}
}