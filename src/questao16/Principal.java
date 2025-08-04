package questao16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = scanner.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.println(valor+" x "+i+" = "+(valor*i));
        }
    }
}
