package questao04;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int senha;
        int digitar;
        boolean validacao = false;
        

        System.out.print("Escolha sua senha: ");
        senha = scanner.nextInt();


        do{
            System.out.println("Digite sua senha");
            digitar = scanner.nextInt();

            if(digitar == senha){
                validacao = true;
            }else{
                System.out.println("ACESSO NEGADO");
            }
            
        }while( validacao !=true);
        System.out.println("ACESSO PERMITIDO");



    }
}
