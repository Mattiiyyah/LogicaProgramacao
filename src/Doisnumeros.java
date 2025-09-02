import java.util.Scanner;

public class Doisnumeros {
    public static void main(String args[]) {
        double n1, n2, media;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite o primeiro número: ");
        n1 = leitor.nextDouble();
        System.out.print("\nDigite o segundo número: ");
        n2 = leitor.nextDouble();
        media = (n1 + n2) / 2;
        System.out.print("\nA média entre os dois números é:" + media);

        leitor.close();
        System.exit(0);
    }
}