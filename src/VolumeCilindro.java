import java.util.Scanner;
public class VolumeCilindro {
    public static void main(String args[]) {
        final double PI = 3.1415;
        double a, r, v;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite a altura do cilindro: ");
        a = leitor.nextDouble();
        System.out.print("\nDigite o raio do cilindro: ");
        r = leitor.nextDouble();;
        v = PI * r * r * a;
        System.out.println("\nO valor do volume do cilindro é: " + v);

        leitor.close();
        System.exit(0);
    }
}
