package ExerciciosLista;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float vHora, vMes, qtdHoras;

        System.out.println("Cálculo de salário do mês");
        System.out.println("Quanto você ganha por hora? ");
        vHora = ler.nextFloat();
        System.out.println("Quantas horas foram trabalhadas? ");
        qtdHoras = ler.nextFloat();

        vMes = vHora * qtdHoras;

        System.out.printf("Neste mês você ganhou um total de R$ %.2f\n\n", vMes);
}
}