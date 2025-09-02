import java.util.Scanner;
public class AreaCircuferencia {
    public static void main(String args[]) {

        double r, a;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite o valor do raio: ");
        r = leitor.nextDouble();
        a = Math.PI * r * r;
        System.out.printf("\nO valor da área da circuferência é %.2f: ", a);

        leitor.close();
        System.exit(0);
    }
}
