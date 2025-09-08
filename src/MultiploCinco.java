import java.util.Scanner;

public class MultiploCinco {
    public static void main (String args[]) {
        Scanner leitor = new Scanner(System.in);
        final int multiplo = 5;
        int numero;
        System.out.print("\nDigite um número: ");
        numero = leitor.nextInt();

        if(numero % multiplo == 0) System.out.print("\nO número: " + numero + " é multiplo de 5");
        else System.out.print("\nO número: " + numero + " não é multiplo de 5");

        leitor.close();
        System.exit(0);
    }
}
