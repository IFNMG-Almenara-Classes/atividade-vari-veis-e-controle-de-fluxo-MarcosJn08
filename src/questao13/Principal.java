package questao13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha1;
        int escolha2;
        int valor1;
        int valor2;

        do {
            System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
            escolha1 = scanner.nextInt();

            if (escolha1 == 1) {
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Resultado:: " + (valor1 + valor2));
            } else if (escolha1 == 2) {
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Opções: \n1-primeiro valor - segundo valor \n2-segundo valor - primeiro valor");
                escolha2 = scanner.nextInt();

                if (escolha2 == 1) {
                    System.out.println("Resultado:: " + (valor1 - valor2));
                } else if (escolha2 == 2) {
                    System.out.println("Resultado:: " + (valor2 - valor1));
                } else {
                    System.out.println("Opção invalidade, tente novamente!");
                }

            } else if (escolha1 == 3) {
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Resultado: " + (valor1 * valor2));
            } else if (escolha1 == 4) {
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Opções: \n1-primeiro valor / segundo valor \n2-segundo valor / primeiro valor");
                escolha2 = scanner.nextInt();

                if (escolha2 == 1) {
                    System.out.println("Resultado:: " + (valor1 / valor2));
                } else if (escolha2 == 2) {
                    System.out.println("Resultado:: " + (valor2 / valor1));
                } else {
                    System.out.println("Opção invalidade, tente novamente!");
                }
            } else if (escolha1 >= 6) {
                System.out.println("Esse valor não existe, tente novamente");
            }
        } while (escolha1 != 5);

        System.out.println("Calculadora finalizada com Sucesso!");
    }
}
