package questao19;
import java.util.Scanner;

public class Principal{
    public static void main (String[] arcs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int valor = scanner.nextInt();

        switch(valor){
            case (1):
            System.out.println("domingo");
            break;
            case (2):
            System.out.println("segunda");
            break;
            case (3):
            System.out.println("terça");
            break;
            case (4):
            System.out.println("quarta");
            break;
            case (5):
            System.out.println("quinta");
            break;
            case (6):
            System.out.println("sexta");
            break;
            case (7):
            System.out.println("sabado");
            break;
        }

    }
}
