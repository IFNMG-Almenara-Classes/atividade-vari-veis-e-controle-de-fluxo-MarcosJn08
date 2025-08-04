package questao11;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = scanner.nextInt();

        for(int i = 0;i<=valor;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
