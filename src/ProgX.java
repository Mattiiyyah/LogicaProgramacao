import java.util.Scanner;

public class ProgX {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double salario, soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Salario " + i + ": ");
            salario = leitor.nextDouble();
            soma += salario;
        }

        System.out.print("\nMédia Salarial " + soma / 5);

        leitor.close();
        System.exit(0);
    }
}
