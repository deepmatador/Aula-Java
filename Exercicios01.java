import java.util.Scanner;

public class Exercicios01 {

    /*
     * Escreva um programa que recebe o ano de nascimento de uma pessoa e verifica
     * se é maior de idade ou não (considerando que a maioridade seja aos 18)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento para confirmar a sua maioridade!");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2024;

        int resultado = anoAtual - anoNascimento;

        if (resultado > 18) {
            System.out.println("Você é maior de idade:");
        } else {
            System.out.println("Você é menor de idade");
        }

        scanner.close();

    }

}
