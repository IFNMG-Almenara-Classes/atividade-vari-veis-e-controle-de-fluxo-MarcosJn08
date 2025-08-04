package questao17;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = scanner.nextInt();
        int fatorial = 1;

        for(int i = valor;i>=1;i--){
            fatorial = fatorial*i;
        }
        System.out.println("o fatorial de "+valor+" é "+fatorial);

    }
}
