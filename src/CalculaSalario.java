import java.util.Scanner;
public class CalculaSalario {
    public static void main(String args[]) {
        final double valorHora = 3.0, inss = 0.08;
        int horasTrabalhadas;
        double salarioBruto, desconto, salarioLiquido;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite as horas trabalhadas: ");
        horasTrabalhadas = leitor.nextInt();
        salarioBruto  = valorHora * horasTrabalhadas;
        desconto = salarioBruto * inss;
        salarioLiquido = salarioBruto - desconto;
        System.out.printf("\nO valor do salário bruto é: %.2f ", salarioBruto);
        System.out.printf("\nO valor o desconto é: %.2f", desconto);
        System.out.printf("\nO valor do salário líquido é: %.2f", salarioLiquido);

        leitor.close();
        System.exit(0);
    }
}
