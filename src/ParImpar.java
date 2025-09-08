import java.util.Scanner;

public class ParImpar {
    public static void main(String args[]) {
        final int resto;
        int n;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite um número: ");
        n = leitor.nextInt();
        resto = n % 2;

        if(resto == 0) {
            System.out.println("\nO número é par: " + n);
        } else {
            System.out.println("\nO número é ímpar: " + n);
        }

        leitor.close();
        System.exit(0);
    }
}
