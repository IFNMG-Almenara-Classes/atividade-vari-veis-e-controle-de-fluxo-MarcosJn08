package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float valor = scanner.nextFloat();
        int TipoCliente;
        double desconto;

        do{

        System.out.println("Tipo de cliente \n1-Comum \n2-Vip \n3-Funcionario");
        TipoCliente = scanner.nextInt();

        if(TipoCliente==1){
            System.out.println("Valor da compra: "+valor+"\nTipo do cliente: Comum");
        }
        else if(TipoCliente==2){
            desconto = valor*0.05;
            System.out.println("Valor da compra: "+(valor-desconto)+"\nTipo do cliente: VIP");
        }
        else if(TipoCliente==3){
            desconto = valor*0.10;
            System.out.println("Valor da compra: "+(valor-desconto)+"\nTipo do cliente: Funcionário");
        }
        else{
            System.out.println("Valor invalido, digite novamente!");
        }
    }while(TipoCliente >=4);

    }
}
