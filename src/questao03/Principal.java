package questao03;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int valor = scanner.nextInt();

        if(valor%2 == 0){
            System.out.println("O numero "+valor+" é par");
        }else{
            System.out.println("o numero "+valor+" é impar");
        }

    }
}
