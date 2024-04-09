import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {

        System.out.println("---------------------------------------------");

        // ************************* EXERCÍCIO 01 *************************
        
        System.out.println("*** EXERCÍCIO 01 ***\n");

                
        int AGE = 25;

        System.out.println("-> I'am " + AGE + " years old.\n");

        System.out.println("*** FIM... EXERCÍCIO 01 ***\n");

        System.out.println("---------------------------------------------");
        // *********************** EXERCÍCIO 02 ***************************


        System.out.println("*** EXERCÍCIO 02 ***\n");

        double NUM1 = 5;
        double NUM2 = 5;

        double soma = NUM1 + NUM2;

        double difenca = NUM1 - NUM2;

        double produto = NUM1 * NUM2;

        double quociente = NUM1 / NUM2;

        System.out.println("-> A soma dos números é: " + soma);
        System.out.println("-> A diferença dos números é: " + difenca);
        System.out.println("-> O produto é: " + produto);
        System.out.println("-> O quociente dos números é: " + quociente);

        System.out.println("\n*** FIM... EXERCÍCIO 02 ***\n");

        System.out.println("---------------------------------------------");

        // *********************** EXERCÍCIO 03 ***************************
        
        System.out.println("*** EXERCÍCIO 03 ***");
        
       Scanner scanner = new Scanner(System.in); // NÃO ESQUECER DE FECHAR O SCANNER
        
       System.out.println("-> Insira seu primeiro nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("-> Insira seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("\nO seu nome completo é: " + nome + sobrenome);


        System.out.println("\n*** FIM... EXERCÍCIO 02 ***");
        System.out.println("---------------------------------------------");

        // *********************** EXERCÍCIO 04 ***************************

        System.out.println("\n*** EXERCÍCIO 04 ***\n");

        int altura = 10;
        int largura = 5;

        double area = altura * largura;
        double perimetro = 2 * (largura + altura);

        System.out.printf("-> A área do retângulo é: %.2f ", area);
        System.out.printf("\n-> O perímetro do retângulo é: %.2f ", perimetro);


        System.out.println("\n\n*** FIM... EXERCÍCIO 02 ***\n");
        System.out.println("---------------------------------------------");

        // *********************** EXERCÍCIO 05 ***************************



    }
}
