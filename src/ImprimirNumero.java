import java.util.Scanner;
public class ImprimirNumero {
    public static void main(String args[]) {
        double x, y, z;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite o valor para X: ");
        x = leitor.nextDouble();
        System.out.print("\nDigite o valor para Y: ");
        y = leitor.nextDouble();
        z = x;
        x = y;
        y = z;
        System.out.print("\nO novo valor de X é: " + x);
        System.out.print("\nO novo valor de Y é: " + y);

        leitor.close();
        System.exit(0);
    }
}
