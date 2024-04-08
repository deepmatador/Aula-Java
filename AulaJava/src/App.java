import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Iniciando a função Scanner do Pacote Java.util
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n------ COLETA DE DADOS --------");

        // Solicitando ao usuário que insira seu nome completo via teclado

        System.out.println("\n- Digite seu nome completo: ");
        String nome = scanner.nextLine();

        // Solicitando ao usuário que insira a sua idade teclado

        System.out.printf("\n - Digite seu idade: \n");
        int idade = scanner.nextInt();

        // Solicitando ao usuário que insira a sua idade

        System.out.println("\nDigite sua altura, mas use vigula separadora (,) para diferenciar os centimetros dos metros\n");
        double altura = scanner.nextDouble();

        System.out.println("Escolha uma cor [1 - azul] | [2 - Branco] | [3 - Marrom]:\n ");

        int escolhaCor = scanner.nextInt();

        String corEscolhida;

        switch (escolhaCor) {
            case 1:
                corEscolhida = "Azul";

                break;

            case 2:

                corEscolhida = "Branco";

            case 3:
                corEscolhida = "Marrom";

            default:
                corEscolhida = "Cor invalida, escolha 1 2 ou 3.";
                break;
        }

        String timeString = EscolhendoTime.escolheTimeString(args); 
        

        // Saída de dados que o usuário inseriu durante o processo de coleta.
        System.out.println("********* INFORMAÇÕES COLETADAS **********");
        System.out.printf("\n - Seu nome é: %s\n", nome);
        System.out.printf("\n - Sua idade é: %d\n", idade);
        System.out.printf("\n - Sua altura é: %.2f\n", altura);
        System.out.println("\n- Cor escolhida foi: \n" + corEscolhida);
        System.out.println("\n - Time escolhido foi: \n" + timeString);
        scanner.close();
    }
}
