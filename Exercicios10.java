import java.util.Scanner;

public class Exercicios10 {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nInsira seu salário para saber se está a cima da base/2024 ou a baixo: - (Exemplo R$ 1320,00)");
    Double salario = scanner.nextDouble();

    double baseSalarioMinimo = 1412.00;

    if (salario < baseSalarioMinimo) {
            System.out.println("Seu salário está abaixo do piso salarial do ano de 2024");
    } else {
        System.out.println("Seu salário é maior que o salário base do ano de 2024");
    }

    scanner.close();
}
}
