package lacosderepeticao;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0; 
		int maiorIdade = 0;
		int menorIdade = 0;
			
		Scanner scanner = new Scanner(System.in);
				
		while (idade > 0) {
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
                }

            if (idade < 21) {
                menorIdade = menorIdade + 1;
            } else if (idade > 50) {
                maiorIdade = maiorIdade + 1;
            }
        }
        System.out.println("Total de pessoas com menos de 21 anos: " + menorIdade);
        System.out.println("Total de pessoas com mais de 50 anos: " + maiorIdade);

        scanner.close();
    }}