package br.com.zup;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja calcular a média: ");
        double qtdNumeros = leitor.nextDouble();

        double resposta;
        double soma = 0;

        int contador = 1;
        while (contador <= qtdNumeros){
            System.out.printf("Digite o %d° número: ", contador);
            resposta = leitor.nextDouble();
            soma += resposta;
            contador++;
        }

        double media = soma / qtdNumeros;
        System.out.printf("A média dos números informados foi: %.2f", media);
    }
}
