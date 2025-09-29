import java.util.Scanner;

public class ProgX {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        final int LOOP = 5;
        double salario, soma = 0;
        int idade, somaIdade = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Salario " + i + ": ");
            salario = leitor.nextDouble();

            System.out.println("Informe a idade: ");
            idade = leitor.nextInt();

            soma += salario;
            somaIdade += idade;
        }

        System.out.print("\nMédia Salarial: " + soma / LOOP);
        System.out.print("\nMédia das idades: " + somaIdade / LOOP);

        leitor.close();
        System.exit(0);
    }
}
