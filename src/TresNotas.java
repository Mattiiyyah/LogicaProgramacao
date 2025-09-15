import java.util.Scanner;
public class TresNotas {
    public static void main(String args[]) {
        final double P1 = 0.5, P2 = 0.3, P3 = 0.2;
        double n1, n2, n3, m;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite o valor da primeira nota: ");
        n1 = leitor.nextDouble();
        System.out.print("\nDigite o valor da segunda nota: ");
        n2 = leitor.nextDouble();
        System.out.print("\nDigite o valor da terceira nota: ");
        n3 = leitor.nextDouble();
        m = (n1 * P1) + (n2 * P2) + (n3 * P3);
        System.out.println("\nO valor da média da nota é: " + m);

        leitor.close();
        System.exit(0);
    }
}