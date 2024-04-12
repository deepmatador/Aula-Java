import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int A = scanner.nextInt();

        System.out.println("Digite o primeiro numero:");
        int B = scanner.nextInt();

        System.out.println("Digite o primeiro numero:");
        int C = scanner.nextInt();
        scanner.close();

        if (A > B) {
            System.out.printf("O maior número é %d", A);
        } else if (C < B) {
            System.out.printf("O maior número é %d", B);
        } else if (A < B) {
            System.out.printf("O maior número é %d", C);
        }

    }

}
