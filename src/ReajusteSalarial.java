import java.util.Scanner;
public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int LIM_S1 = 1000, LIM_S2 = 2000;
        final double R1 = 0.25, R2 = 0.20, R3 = 0.15;
        double salario, valor_reajuste, reajuste_salario;
        System.out.println("\n-- (## REAJUSTE SALARIAL ##) --");
        System.out.print("Digite o salário do funcionário: ");
        salario = leitor.nextDouble();

        if(salario < LIM_S1) valor_reajuste = salario * R1;
        else if(salario <= LIM_S2) valor_reajuste = salario * R2;
        else valor_reajuste = salario * R3;

        reajuste_salario = salario + valor_reajuste;

        System.out.printf("\nValor do reajuste: %.2f", valor_reajuste);
        System.out.printf("\nNovo salário: %.2f", reajuste_salario);

        leitor.close();
        System.exit(0);
    }
}
