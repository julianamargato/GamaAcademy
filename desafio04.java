/**
 * Proposta: Tem-se um conjunto de dados contendo a altura e o sexo de 10 pessoas. 
 * 
 * Fazer um programa que calcule e escreva:
 *      a. a maior e a menor altura do grupo;
 *      b. média de altura dos homens;
 *      c. o número de mulheres.
 */

import java.util.Scanner;

public class desafio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // declaração
        double[][] matriz = new double[10][2];

        // entrada dados 10 pessoas
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 2; j++){
                //System.out.println("Informe a altura da " + i+1 + " pessoa:");
                System.out.println("Matriz["+i+"]["+j+"]";
                // se j = 1 -> altura
                // se j = 2 -> sexo
                // sexo = 1 -> masculino
                // sexo = 2 -> feminino
                matriz[i][j] = teclado.nextDouble();

            }
        }

        // saídas


        teclado.close();
    
}
