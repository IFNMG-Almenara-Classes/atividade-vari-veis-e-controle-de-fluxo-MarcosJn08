package questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        int soma = 0;
        int media = 0;
        int pares = 0;

        do{
            System.out.println("Digite um numero: ");
            valor = scanner.nextInt();
        
            if(valor !=0){
            soma += valor;
            media += 1;
            
            if(valor%2 == 0){
                pares += 1;
            }}
        }while(valor != 0);
        System.out.println("Numeros pares digitados: "+pares+"\nMedia de todos os números digitados: "+soma/media);

    }
}
