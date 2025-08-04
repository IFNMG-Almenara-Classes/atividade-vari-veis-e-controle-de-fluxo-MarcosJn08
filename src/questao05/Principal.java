package questao05;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de laranjas que vai comprar: ");
        int laranja = scanner.nextInt();

        if(laranja<12){
            System.out.println("o valor das "+laranja+" laranjas é de "+laranja*0.5);
        }
        else{
            System.out.println("o valor das "+laranja+" laranjas é de "+laranja*0.3);
        }

    }
    


}
