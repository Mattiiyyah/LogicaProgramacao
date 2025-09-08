import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String args[]) {
        double b, al, a;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite o valor da base: ");
        b = leitor.nextDouble();
        System.out.print("\nDigite o valor da altura: ");
        al = leitor.nextDouble();
        a = (b * al) / 2;
        System.out.printf("\nA área do retângulo é: %.2f", a);

        leitor.close();
        System.exit(0);

    }
}
