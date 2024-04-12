import java.util.Scanner;

public class Exercicios03 {
    /*
     * Faça um programa que solicida ao usuário a temperatura em graus
     * Celcios e converte para Fahrenheit.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a temperatura em Celsius para converter em F.");
        double C = scanner.nextDouble();

        double F = (C * 9 / 5) + 32;
        double X = -273.15;

        if (C == X) {
            System.out.println("ALERTA DE TEMPERATURA CRITICA");
            System.out.printf("A temperatura em Fahrenheit é: %.2f(ZERO ABSOLUTO) ", F);
        } else {
            System.out.printf("A temperatura atual em Fahrenheit é %.2f ", F);
        }

        scanner.close();
    }
}