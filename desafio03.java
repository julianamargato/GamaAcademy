/**
 * Desafio 04
 * Fazer um programa em Java que armazene o nome, a idade e a altura dos usuários. 
 * No final mostre como saída quantas pessoas acima de 25 anos e maiores de 1.75 participaram da pesquisa.
 */

import java.util.Scanner;

public class desafio04{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // declaração
        int idade, contador = 0;
        double altura;

        // entrada
        System.out.println("Entrada de dados para pesquisa.");
        System.out.println("Para finalizar, digite 0 na idade e altura.");
        
        do{
            System.out.println("***************************");
            System.out.println("Por favor, informe a idade:");
            idade = scn.nextInt();
            System.out.println("Por favor, informe a altura:");
            altura = scn.nextDouble();
            if (idade > 25 && altura > 1.75)
                contador++;
        } while (idade != 0);

        // retorno do numero de participantes que atendem o requisito
        System.out.println("Número de pessoas acima de 25 anos e maiores de 1.75 participaram da pesquisa: " + contador );

        scn.close();
    }
}