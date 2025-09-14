package ExerciciosLista;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Precisamos saber se na sua idade é permitido doar sangue.");
        System.out.println("Qual sua idade?");
        idade = ler.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você está apto a doar sangue");
        } else {
            System.out.println("Você está inapto a doar sangue");
        }
    }
}
