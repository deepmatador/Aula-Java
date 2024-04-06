import java.util.Scanner;

public class ScannerUtils {
    @SuppressWarnings("resource")
    public static String lerNomeCompleto() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("- Digite seu nome completo:");
        String nome = scanner.nextLine();
        return nome;
}




 }