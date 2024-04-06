
public class App implements Escape {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Aqui o programa denomina o nome do Provedor e nome do Atendente.
        String provedor = "(Ampernet Telecom S.A)";
        String nomeAtendente = "Camila DallaValle";

        System.out.printf("\n - Olá, bem-vindo a central de atendimento! %s\n", provedor);

        System.out.printf("\n - Meu nome é %s, sou seu assistente virtual.\n", nomeAtendente);

        System.out.println("\n- Durante o atendimento siga minhas instruções...\n");
        // Aqui o código chama a função lerNomeCompleto da classe ScannerUtils.
        System.out.println("* - Primeiramente informe seu nome:\n ");
        String nomeCompleto = ScannerUtils.lerNomeCompleto();
        
        System.out.printf("\nObrigado %s, como posso lhe ajudar?\n", nomeCompleto);


    }
}
