package questao21;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o tempo de serviço(em anos)");
        int TempoServico = scanner.nextInt();

        if(idade>=65 || TempoServico>=30){
            System.out.println("Você pode se aposentar!");
        }
        else if(idade>60 && TempoServico>25){
            System.out.println("Você pode se aposentar!");
        }
        else{
            System.out.println("Você não pode se aposentar ainda!");
        }
    }
    
}
