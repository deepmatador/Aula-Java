import java.util.Scanner;

import scanner.nextline;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {

        // *************************EXERCICIO 01
        // **********************************************]

        int AGE = 25;

        System.out.println("I'am " + AGE + " years old.");

        // *************************EXERCICIO 02
        // **********************************************

        double NUM1 = 5;
        double NUM2 = 5;

        double soma = NUM1 + NUM2;

        double difenca = NUM1 - NUM2;

        double produto = NUM1 * NUM2;

        double quociente = NUM1 / NUM2;

        System.out.println(" A soma dos números é: " + soma);
        System.out.println("A diferença dos números é: " + difenca);
        System.out.println("O produto é: " + produto);
        System.out.println("O quociente dos números é: " + quociente);

        // *************************EXERCICIO03**********************************************

        

       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Insira seu primeiro nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Insira seu sobrenome");
        String sobrenome = scanner.nextLine();

        System.out.println("O seu nome completo é: " + nome + sobrenome);




    }
}
