package ExerciciosLista;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char sexo;
        System.out.println("Para parar digite 'q': ");
        do {
            System.out.println("Qual o seu sexo?");
            System.out.println("Digite M para masculino ou F para feminino: ");
            sexo = ler.next().charAt(0);

            if (sexo == 'M' || sexo == 'm') {
                System.out.println("MASCULINO");
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println("FEMININO");
            } else {
                System.out.println("INVÁLIDO");
            }
            System.out.printf("\n");
        }
        while (sexo != 'q');
    }
}
