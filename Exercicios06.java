import java.util.Scanner;

public class Exercicios06 {
public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Insira a sua nota final:");
    double notaAluno = scanner.nextDouble();

    if (notaAluno < 6) {
        System.out.println("Você está REPROVADO(a)");
    } else {
    System.out.println("Você foi APROVADO(a)");
}
scanner.close();

}


}
