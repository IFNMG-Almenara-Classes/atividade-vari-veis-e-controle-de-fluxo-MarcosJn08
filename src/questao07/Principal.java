package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valores do Triangulo");
        System.out.println("Digite a medida do lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.println("Digite a medida do lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.println("Digite a medida do lado 3: ");
        int lado3 = scanner.nextInt();

        if(lado1==lado2 && lado2==lado3){
            System.out.println("Triangulo Equilátero");
        }
        else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("Triangulo Escaleno");
        }
        else{
            System.out.println("Triangulo Isóceles");
        }
    }
}
