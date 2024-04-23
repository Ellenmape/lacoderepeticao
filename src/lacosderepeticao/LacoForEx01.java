package lacosderepeticao;

import java.util.Scanner;

public class LacoForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = scanner.nextInt();	
	if(numero1 < numero2) {
	for(int i = numero1; i < numero2; i++) {
		    if(i % 3 == 0 && i % 5 == 0) {
			System.out.println(i +" é múltiplo de 3 e 5: ");
	}
	}
		
	}else {
		System.out.println("Intervalo inválido");
	}
}}

