package br.com.zup;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja somar: ");
        int qtdNumeros = leitor.nextInt();

        int contador = 1;

        double resposta;
        double soma = 0;

        while (contador <= qtdNumeros){
            System.out.printf("Digite o %d° número: ", contador);
            resposta = leitor.nextDouble();
            soma += resposta;
            contador++;
        }
        System.out.printf("\nA soma total dos números informados foi: %.2f\n", soma);
    }
}
