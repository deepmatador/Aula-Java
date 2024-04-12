import java.util.Scanner;

public class Exercicios02 {

    /*
     * Crie um programa que recebe a idade de uma pessoa e verifica se ela é
     * maior ou menor de idade
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento para confirmar a sua maioridade!");
        int idade = scanner.nextInt();

        if (idade > 18) {
            System.out.println("Você é maior de idade:");
        } else {
            System.out.println("Você é MENOR de idade");
        }

        scanner.close();

    }

}
