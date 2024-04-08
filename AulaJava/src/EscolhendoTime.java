import java.util.Scanner;

public class EscolhendoTime {
    public static String escolheTimeString(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Qual é o seu time favorido? escolha uma opção valida?\n");
        System.out.println("1º Gremio = 1");
        System.out.println("2º Corithians = 2");
        System.out.println("3º Palmeiras = 3");
        System.out.println("4º Santos = 4");

        int escolheTime = scanner.nextInt();
        scanner.close();
        String timeEscolhido;

        switch (escolheTime) {
            case 1:
                timeEscolhido = "Gremio";      
                break;
        
                
            case 2:
            timeEscolhido = "Corithians";      
            break;

            
            case 3:
                timeEscolhido = "Palmeiras";      
                break;

                
            case 4:
            timeEscolhido = "Santos";      
            break;

            default:
                timeEscolhido = "Time Invalido";
                break;
        }

        return timeEscolhido;

    }
}
