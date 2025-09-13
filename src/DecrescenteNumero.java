import java.util.Scanner;
public class DecrescenteNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double maior, intermediario, menor;
        double n1, n2, n3;
        System.out.println("-- Exibindo números ordem decrescente --");

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

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        if((n1 < n2 && n1 > n3) || (n1 < n3 && n1 > n2)) {
            intermediario = n1;
        } else if((n2 < n1 && n2 > n3) || (n2 < n3 && n2 > n1)) {
            intermediario = n2;
        } else {
            intermediario = n3;
        }

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.print("\nNúmeros em ordem decrescente: " + maior + ", " + intermediario + ", " + menor);
    }
}
