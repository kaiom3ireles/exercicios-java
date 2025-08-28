package ExerciciosLista;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        //Linha abaixo representa o Scanf
        Scanner ler = new Scanner(System.in);
        System.out.printf("\nQUAL NÚMERO VEM ANTES E DEPOIS DESSE?\n\n");
        System.out.println("Digite um numero inteiro: ");
        int num = ler.nextInt();

        System.out.println("O número escolhido foi: " + num);
        System.out.println("Antecessor: " + (num-1));
        System.out.println("Sucessor: " + (num+1));

    }
}
