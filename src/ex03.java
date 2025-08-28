import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        float num1, num2;

        Scanner ler = new Scanner(System.in);

        System.out.printf("\nCOMPARANDO NÚMEROS\n\n");
        System.out.println("Digite o primeiro numero: ");
        num1 = ler.nextFloat();
        System.out.println("Digite o segundo numero: ");
        num2 = ler.nextFloat();

        if(num1>num2) {
            System.out.println (num1+ " é o número maior");
        }
            else if (num2>num1){
                System.out.println (num2+ " é o número maior");
            }
        else {
       System.out.println("Os números são IGUAIS");
        }

    }
}
