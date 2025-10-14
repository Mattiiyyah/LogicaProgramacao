import java.util.Scanner;

public class SimuladoSalario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double DSR = 0.15, FGTS = 0.08, INSS = 0.11;
        int horaTrabalhada;
        double valor_hora, salario_bruto;
        double acrescimo_dsr, desconto_fgts, desconto_inss;
        double salario_liquido;
        System.out.print("\nInforme a quantidade trabalhadas do mês: ");
        horaTrabalhada = leitor.nextInt();
        System.out.print("\nInforme o valor da hora trabalhada: ");
        valor_hora = leitor.nextDouble();

        salario_bruto = horaTrabalhada * valor_hora;
        acrescimo_dsr = salario_bruto * DSR;
        desconto_fgts = salario_bruto * FGTS;
        desconto_inss = salario_bruto * INSS;
        salario_liquido = salario_bruto + acrescimo_dsr - desconto_fgts - desconto_inss;

        System.out.printf("\nO valor do salario bruto é: R$%.2f", salario_bruto);
        System.out.printf("\nO valor de acrescimo do DSR é: R$%.2f", acrescimo_dsr);
        System.out.printf("\nO valor do desconto do FGTS é: R$%.2f", desconto_fgts);
        System.out.printf("\nO valor do desconto do INSS é: R$%.2f", desconto_inss);
        System.out.printf("\nO valor do salário líquido é: R$%.2f", salario_liquido);

        leitor.close();
        System.exit(0);


    }
}
