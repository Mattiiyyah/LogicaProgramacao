import java.util.Scanner;
public class TresNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("\n--- ## Exibindo maior número: ## ---");
        System.out.print("\nDigite um número qualquer: ");
        n1 = leitor.nextDouble();
        System.out.print("\nDigite outro número qualquer: ");
        n2 = leitor.nextDouble();
        System.out.print("\nDigite outro número qualquer: ");
        n3 = leitor.nextDouble();

        if(n1 == n2 || n2 == n3 || n3 == n1) {
            System.out.print("\nOs números não podem ser iguais.");
        } else if(n1 > n2 && n1 > n3) {
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
