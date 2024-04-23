package lacosderepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, contador;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Tabuada que você deseja calcular: ");
        numero = scanner.nextInt();

        for (contador = 1; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + numero * contador);
        }

	}

}
