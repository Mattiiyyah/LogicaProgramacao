import java.util.Scanner;
public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double r1 = 0.25, r2 = 0.20, r3 = 0.15;
        double salario, valor_reajuste, reajuste_salario;
        System.out.println("\n-- (## REAJUSTE SALARIAL ##) --");
        System.out.print("Digite o salário do funcionário: ");
        salario = leitor.nextDouble();

        if(salario < 1000) {
            valor_reajuste = salario * r1;
            reajuste_salario = salario + valor_reajuste;

            System.out.printf("\nValor do reajuste: %.2f", valor_reajuste);
            System.out.printf("\nNovo salário: %.2f", reajuste_salario);
        } else if(salario >= 1000 && salario <= 2500) {
            valor_reajuste = salario * r2;
            reajuste_salario = salario + valor_reajuste;

            System.out.printf("\nValor do reajuste: %.2f", valor_reajuste);
            System.out.printf("\nNovo salário: %.2f", reajuste_salario);
        } else {
            valor_reajuste = salario * r3;
            reajuste_salario = salario + valor_reajuste;

            System.out.printf("\nValor do reajuste: %.2f", valor_reajuste);
            System.out.printf("\nNovo salário: %.2f", reajuste_salario);
        }

        leitor.close();
        System.exit(0);
    }
}
