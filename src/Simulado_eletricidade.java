import java.util.Scanner;

public class Simulado_eletricidade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int KHW_1 = 50, KHW_2 = 100, KHW_3 = 150;
        final double VALOR_1 = 1.05, VALOR_2 = 1.55, VALOR_3 = 2.05, VALOR_4 = 2.55;
        final double ICMS = 0.18, PIS = 0.0077;
        double consumo_khw, valor_consumo, total_icms, total_pis, valor_total;

        System.out.print("\nInforme a quantidade de KHW consumida: ");
        consumo_khw = leitor.nextDouble();

        if(consumo_khw <= KHW_1) valor_consumo = consumo_khw * VALOR_1;
        else if(consumo_khw <= KHW_2) valor_consumo = consumo_khw * VALOR_2;
        else if(consumo_khw <= KHW_3) valor_consumo = consumo_khw * VALOR_3;
        else valor_consumo = consumo_khw * VALOR_4;

        total_icms = valor_consumo * ICMS;
        total_pis = valor_consumo * PIS;
        valor_total = valor_consumo + total_icms + total_pis;

        System.out.printf("\nO valor do consumo total foi: R$ %.2f", valor_consumo);
        System.out.printf("\nValor do ICMS: R$ %.2f", total_icms);
        System.out.printf("\nValor do PIS: R$ %.2f", total_pis);
        System.out.printf("\nValor total da conta: R$ %.2f", valor_total);

        leitor.close();
        System.exit(0);

    }
}
