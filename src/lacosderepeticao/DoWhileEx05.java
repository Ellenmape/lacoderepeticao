package lacosderepeticao;

import java.util.Scanner;

public class DoWhileEx05 {

	public static void main(String[] args) { 
 int somaNumeros= 0;
	int numeroAtual = 0;
	      Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("Digite um número: ");
        numeroAtual = scanner.nextInt();
 
        if(numeroAtual >= 0) {
     	   somaNumeros = numeroAtual + somaNumeros;          	   
        }

 } while (numeroAtual != 0);
    System.out.println("A soma dos números positivos é:: " + somaNumeros);
}

}
