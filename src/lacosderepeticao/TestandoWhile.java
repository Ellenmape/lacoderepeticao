package lacosderepeticao;

import java.util.Scanner;

public class TestandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String continua = "s";
		int numero1, numero2, resultado;

		Scanner scanner = new Scanner(System.in);

		while (!continua.equalsIgnoreCase("n")) {
			System.out.println("Digite o primeiro número: ");
			numero1 = scanner.nextInt();

			System.out.println("Digite o segundo número: ");
			numero2 = scanner.nextInt();

			resultado = numero1 + numero2;

			System.out.println("O resultado é: " + resultado);
			System.out.println("Deseja continuar? (s) para sim e (n) para não ");
			scanner.nextLine(); // Limpar o buffer do scanner
			continua = scanner.nextLine();
		}
		scanner.close(); // Fechar o scanner ao término do programa
	}
}