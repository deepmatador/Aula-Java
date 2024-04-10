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


        System.out.println("\n\n*** FIM... EXERCÍCIO 04 ***\n");
        System.out.println("---------------------------------------------");

        // *********************** EXERCÍCIO 05 ***************************

        System.out.println("Entre com o coeficiente A: ");
        double A = scanner.nextDouble();

        System.out.println("Entre com o coeficiente B: ");
        double B = scanner.nextDouble();

        System.out.println("Entre com o coeficiente C: ");
        double C = scanner.nextDouble();

        // calcular o delta 

        double delta = B * B -4 * A * C;

        if (delta < 0) {
            double raizA = (-B + Math.sqrt(delta)) / (2 * A);
            double raizB = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("As raizes são reais e diferentes");
            System.out.println("A raiz 1: " + raizA);
            System.out.println("A raiz 1: " + raizB);
        } else if (delta == 0) {
            double raiz = -B / (2 * A);
            System.out.println("As raizes são reais ou iguais");
            System.out.println("Raiz: " + raiz);
        } else {
            double parteReal = -B / (2 * A);

            double parteImaginaria = Math.sqrt( - delta) / (2 * A);
            System.out.println(" As raizes são diferentes");
            System.out.println(" Raiz 1 " + parteReal + " + " + parteImaginaria + " i" );
            System.out.println(" Raiz 2 " + parteReal + " - " + parteImaginaria + " i" );
        }



        // *********************** EXERCÍCIO 07 ***************************
        System.out.println("\n*** EXERCÍCIO 07 ***\n");

        
        
        System.out.println("Digite o quantidade de dolar (U$) você deseja converter:");
        double dolarBolso = scanner.nextDouble();

        System.out.println("Digite a cotação do real (R$) atual para efetuar a conversão:");
        double realAtual = scanner.nextDouble();

        double conversaoTotal = dolarBolso / realAtual;


        System.out.println("**********************************");
        System.out.println("\nRelatório de conversão U$ x R$");
        System.out.println("**********************************\n");
        System.out.printf("Valor em Dolar (U$): %.2f\n", dolarBolso);
        System.out.printf("Valor em Reais (R$): %.2f\n", realAtual);
        System.out.println("----------------------------------");
        System.out.printf("Valor convertido em R$: %.2f", conversaoTotal);

        System.out.println("\n\n*** FIM... EXERCÍCIO 07 ***");
        System.out.println("------------------------------------");

        // *********************** EXERCÍCIO 08 ***************************
        System.out.println("\n*** EXERCÍCIO 08 ***\n");

        int candidatoA = 140;
        int candidatoB = 352;
        int candidatoC = 654;
        int votosNulos = 34;
        int votosBrancos = 60;

        int numTotalEleitores = candidatoA + candidatoB + candidatoC + votosNulos + votosBrancos;

        double perceCanditadoA = (double) candidatoA / numTotalEleitores * 100;
        double perceCanditadoB = (double) candidatoB / numTotalEleitores * 100;
        double perceCanditadoC = (double) candidatoC / numTotalEleitores * 100;
        double perceNulos = (double) votosNulos / numTotalEleitores * 100;
        double perceBrancos = (double) votosNulos / numTotalEleitores * 100;
        

        System.out.printf(" O Percentual de votos do candidato (A) -> foi: %.2f\n", perceCanditadoA);
        System.out.printf(" O Percentual de votos do candidato (B) -> foi: %.2f\n", perceCanditadoB);
        System.out.printf(" O Percentual de votos do candidato (C) -> foi: %.2f\n", perceCanditadoC);
        System.out.printf(" O Percentual de votos (NULOS) foi: -> %.2f\n", perceNulos);
        System.out.printf(" O Percentual de votos (BRANCOS) foi: -> %.2f\n", perceBrancos);

        System.out.println("\n\n*** FIM... EXERCÍCIO 08 ***");
        System.out.println("------------------------------------");


        scanner.close();
    }
}
