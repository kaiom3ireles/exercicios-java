package ExerciciosLista;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Preencha seus dados");
        System.out.println("Qual seu nome? ");
        nome = ler.nextLine();
        System.out.println("Qual sua idade ?");
        idade = ler.nextInt();

        if (idade < 16){
            System.out.printf("%s ESTÁ INAPTO A VOTAR!\n\n", nome);
        }
        if (idade >= 16){
            System.out.printf("%s ESTÁ APTO A VOTAR!\n\n", nome);
        }
    }
}
