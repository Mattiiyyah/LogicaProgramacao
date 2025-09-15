import java.util.Scanner;

public class ParImpar {
    public static void main(String args[]) {
        final int RESTO, VERIFICACAO = 0;
        int n;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        n = leitor.nextInt();
        RESTO = n % 2;

        if(RESTO == VERIFICACAO) System.out.println("\nO número é par: " + n);
        else System.out.println("\nO número é ímpar: " + n);

        leitor.close();
        System.exit(0);
    }
}
