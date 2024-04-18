import java.util.Scanner;

public class Exercicios07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma caractere alfabético para saber se ele é uma vogal ou uma consoante");
        var caractere = scanner.next().charAt(0);

        // caractere = Character.toLowerCase(caractere);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'
                || caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
            System.out.println("Seu caractere é uma VOGAL");
        } else {
            System.out.println("O caractere inserido é CONSOANTE");
        }

        scanner.close();
    }

}
