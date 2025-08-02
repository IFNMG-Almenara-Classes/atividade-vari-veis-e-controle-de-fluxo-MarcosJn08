package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu peso");
        int peso = scanner.nextInt();

        System.out.println("Digite sua altura");
        float altura = scanner.nextFloat();

        float IMC = peso/altura;

        if(IMC<18.5){
            System.out.println("Magreza");
        }else if(IMC>=18.5 && IMC<25){
            System.out.println("Saudável");
        }else if(IMC>=25 && IMC<30){
            System.out.println("Sobrepeso");
        }else if(IMC>=30 && IMC<35){
            System.out.println("Obesidade Grau I");
        }else if(IMC>=35 && IMC<40){
            System.out.println("obesidade Grau II (Severa)");
        }else{
            System.out.println("obesidade Grau III (morbida)");
        }
        
    }
}
