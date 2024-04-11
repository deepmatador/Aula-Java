public class Programa {
    public static void main(String[] args) throws Exception {
       
        Conta minhConta;
        minhConta = new Conta();

        minhConta.dono = "Mateus";
        minhConta.saldo = 1000.0;
        
        System.out.println("Saldo atual: " + minhConta.saldo);

    }
}
