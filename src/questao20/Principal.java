package questao20;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int v = scanner.nextInt();
        boolean PorCinco = false;
        boolean PorTreis = false;

        if (v % 5 == 0) {
            System.out.println("o numero é divisivel por 5");
            PorCinco = true;
        } 
        if (v % 3 == 0) {
            System.out.println("o numero é divisivel por 3");
            PorTreis = true;
        }

        
        if(PorCinco == true && PorTreis == true){
            System.out.println("o numero é divisivel tanto por 5 e por 3");
        }
        else if(PorCinco == true && PorTreis == false){
            System.out.println("o numero é divisivel por 5 más não por 3");
        }
        else if(PorCinco == false && PorTreis == true){
            System.out.println("o numero é divisivel por 3 más não por 5");
        }
        else{
            System.out.println("o numero não é divisivel por 5 e nem por 3");
        }
    }

}
