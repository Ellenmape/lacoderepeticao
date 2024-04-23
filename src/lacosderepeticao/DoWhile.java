package lacosderepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, resultado, contador = 3;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número inteiro: ");
            numero = scanner.nextInt();

            resultado = numero * 5;

            System.out.println("\nO resultado da multiplicação é: " + resultado);

        } while (contador <= 2);
    }
}