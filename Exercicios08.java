import java.util.Scanner;

public class Exercicios08 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira um ano para saber se ele é bissexto:");
    int anoInserido = scanner.nextInt();

    if (anoInserido % 4 == 0 || anoInserido % 400 == 0) {
        System.out.printf("O ano de é %d Bissexto", anoInserido);

    } else {
        System.out.printf("O ano %d NÃO é bissexto", anoInserido);
    }
   
    scanner.close();
}

}
