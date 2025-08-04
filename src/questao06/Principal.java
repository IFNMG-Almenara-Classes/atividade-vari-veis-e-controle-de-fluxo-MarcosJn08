package questao06;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        int menor = numero;

        for (int i = 0; i <= 1; i++) {
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O menor numero digitado é " + menor);
    }
}
