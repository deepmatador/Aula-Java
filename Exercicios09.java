import java.util.Scanner;

public class Exercicios09 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.println("Insira a sua orientação sexual - (M) P/Masculino e (F) P/Feminino )");
    char sexoEscolhido = scanner.next().charAt(0);

    System.out.println("Insira a sua altura: )");
    double suaAltura = scanner.nextDouble();


    if ((sexoEscolhido == 'M' && suaAltura >= 1.60 && suaAltura <= 1.90) || (sexoEscolhido == 'F' && suaAltura >= 1.50 && suaAltura <=1.80)) {
        System.out.println("A altura está dentro dos padrões para o sexo informado");
    } else {
        System.out.println("A altura NÃO está dentro dos padrões para o sexo informado");
    }

scanner.close();
    





    



}
}
