/**
 * Faça um programa em Java para ler um número que é um código de usuário. 
 * Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. 
 * Caso o Código seja correto, deve ser lido outro valor que é a senha. 
 * Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. 
 * Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’
 */

import java.util.Scanner;

public class desafio02{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codUsuario;
        int senhaUsuario;

        int codigoCorreto = 1234;
        int senhaCorreta = 9999;

        // leitura do código de usuário
        System.out.println("Por favor, digite o código de usuário:");
        codUsuario = teclado.nextInt();

        // comparação do valor de entrada com o código armazenado
        // se codigo for igual, ler a senha
        if (codUsuario == codigoCorreto) {

            System.out.println("Por favor, digite a senha:");
            senhaUsuario = teclado.nextInt();

            // se a senha for igual
            if (senhaUsuario == senhaCorreta) {
                System.out.println("Acesso permitido");
            } else {
                // se a senha for diferente
                System.out.println("senha incorreta");
            }
        } else {
            // se codigo for diferente
            System.out.println("Usuário inválido!");
        }

        teclado.close();
    }
}