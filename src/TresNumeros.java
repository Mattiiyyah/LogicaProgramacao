import java.util.Scanner;
public class TresNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, n3;

        do {
            System.out.print("\nDigite o primeiro número: ");
            n1 = leitor.nextDouble();
            System.out.print("\nDigite o segundo número: ");
            n2 = leitor.nextDouble();
            System.out.print("\nDigite o terceiro número: ");
            n3 = leitor.nextDouble();

            if (n1 == n2 || n2 == n3 || n1 == n3) {
                System.out.println("\n-- ERRO: Números iguais não são permitidos. Tente novamente. --");
            }

        } while (n1 == n2 || n2 == n3 || n1 == n3);

        if(n1 > n2 && n1 > n3) {
            System.out.print("\nO maior número é: " + n1);
        } else if(n2 > n3 && n2 > n1) {
            System.out.print("\nO maior número é: " + n2);
        } else {
            System.out.print("\nO maior número é: " + n3);
        }


        leitor.close();
        System.exit(0);
    }
}
