public class Fatoriais {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println("O fatorial de " + i + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
