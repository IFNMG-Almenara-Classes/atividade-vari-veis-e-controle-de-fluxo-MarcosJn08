package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        int valor1;
        int valor2;

        do{
            System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - Sair");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Resultado:: "+(valor1+valor2));
            }
            else if(escolha == 2){
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Resultado:: "+(valor1-valor2));
            }
            else if(escolha == 3){
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Resultado: "+(valor1*valor2));
            }
            else if(escolha == 4){
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextInt();

                System.out.println("Resultado: "+(valor1/valor2));
            }
            else if(escolha >=6){
                System.out.println("Esse valor não existe, tente novamente");
            }
        }while(escolha != 5);
    }
}
