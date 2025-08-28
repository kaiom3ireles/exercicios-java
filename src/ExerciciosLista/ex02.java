package ExerciciosLista;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        float distancia, gas, mediaGas;

        Scanner ler = new Scanner(System.in);
        System.out.printf("\nCÁLCULO DE GASTO DE COMBUSTÍVEL\n\n");
        System.out.println("Qual foi a distancia percorrida? ");
        distancia = ler.nextFloat();

        System.out.println("Quantos litros de gasolina foram gastos ao todo? ");
        gas = ler.nextFloat();
        mediaGas = (distancia/gas);
        System.out.printf("Seu veículo fez uma média de %.2f km/L\n",mediaGas);
    }
}
