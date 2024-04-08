import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // CALCULO DE IMC CORPORAL
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu Peso em KG: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        double IMC = 0;

        IMC = peso / (altura * altura);

        System.out.println("Seu IMC é: " + IMC );

        scanner.close();
        
    }
}
