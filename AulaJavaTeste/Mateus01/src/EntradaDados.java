import java.util.Scanner;

public class EntradaDados {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Entrada
       
        Scanner scanner = new Scanner(System.in);
               
            String nomeCompleto = ScannerUtils.lerNomeCompleto();
        
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Escolha uma cor");
        

            
            System.out.println("Seu nome é: " + nomeCompleto);
            System.out.println("Sua idade é: " + idade);
            System.out.println("Sua altura é:" + altura);

        scanner.close();
    
    }

}
