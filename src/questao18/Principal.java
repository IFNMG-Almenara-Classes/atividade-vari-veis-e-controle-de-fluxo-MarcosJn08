package questao18;
import java.util.Scanner;

public class Principal {
    public static void main(String agrs[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("digite o primeiro numero: ");
        int valor1 = scanner.nextInt();

        System.out.print("digite o segundo numero: ");
        int valor2 = scanner.nextInt();
        int soma = 0;

        for (; valor1 <= valor2; valor1++) {
            boolean primo = true;
            for (int i = 2; i < valor1; i++) {
                if (valor1 % i == 0) {
                    primo = false;
                }

            }
            if (primo == true) {
                soma += 1;
                System.out.println(valor1 + " é primo");
            }
        }
        System.out.println("Quantidade de numeros primos: "+soma);

    }
}
