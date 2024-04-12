import java.util.Scanner;

public class Exercicios04 {
public static void main(String[] args) {

   
    Scanner scanner = new Scanner(System.in);

    
 System.out.println("Digite um número para saber se ele é divisivel por 07:");
int numero = scanner.nextInt();

if (numero % 7 == 0) {
System.out.printf("O número %d é divisivel por 07", numero);    
} else {
    System.out.printf("O numero %d NÃO é divisivel por 07", numero);
}


scanner.close();
}
}
