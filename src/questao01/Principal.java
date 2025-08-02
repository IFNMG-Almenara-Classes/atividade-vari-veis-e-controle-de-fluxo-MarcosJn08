package questao01;

import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero:");
        int numero2 = scanner.nextInt();

        if(numero1>numero2){
            System.out.println("O primeiro numero é maior");
        }else if(numero1>numero2){
            System.out.println("O primeiro numero é maior");
    }else{
        System.out.println("Os numeros são iguais");
    }
}
}