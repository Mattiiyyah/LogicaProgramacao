import java.util.Scanner;

public class CrescenteNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double comeco, meio, fim;
        double n1, n2, n3;
        System.out.println("-- Exibindo números ordem crescente --");

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


        if (n1 < n2 && n1 < n3) {
            comeco = n1;
        } else if (n2 < n1 && n2 < n3) {
            comeco = n2;
        } else {
            comeco = n3;
        }

        if ((n1 > n2 && n1 < n3) || (n1 < n3 && n1 > n2)) {
            meio = n1;
        } else if ((n2 > n1 && n2 < n3) || (n2 < n1 && n2 > n3)) {
            meio = n2;
        } else {
            meio = n3;
        }

        if (n1 > n2 && n1 > n3) {
            fim = n1;
        } else if (n2 > n1 && n2 > n3) {
            fim = n2;
        } else {
            fim = n3;
        }

        System.out.print("\nNúmeros em ordem crescente: " + comeco + ", " + meio + ", " + fim);


        leitor.close();
        System.exit(0);
    }
}
