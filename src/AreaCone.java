import java.util.Scanner;
public class AreaCone {
    public static void main(String args[]) {
        double r, g, ac;
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n ---- Area do cone----");
        System.out.print("\nDigite o valor do raio: ");
        r = leitor.nextDouble();
        System.out.print("\nDigite o valor da geratriz: ");
        g = leitor.nextDouble();
        ac = Math.PI * r * (r + g);
        System.out.print("\n ---- Valor da Area  ---");
        System.out.printf("\nO valor da áre do cone é: %.2f " , ac);

        leitor.close();
        System.exit(0);
    }
}
