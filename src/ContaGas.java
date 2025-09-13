import java.util.Scanner;
public class ContaGas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double v1 = 2.37, v2 = 3.42, v3 = 5.0, icms = 0.25, pis = 0.0077, confins = 0.0356;
        double quan_consumida, consumo_total, total_icms, total_pis, total_confins, total;
        System.out.println("\n --- ## Calcula valor conta de gás ## ---");
        System.out.print("\nDigite a quantidade de gás consumido em metros cúbicos: ");
        quan_consumida = leitor.nextDouble();

        if(quan_consumida > 0 && quan_consumida <= 15) {

            consumo_total = quan_consumida * v1;
            total_icms = consumo_total * icms;
            total_pis = consumo_total * pis;
            total_confins = consumo_total * confins;
            total = consumo_total + total_icms + total_confins + total_pis;

            System.out.printf("\nO valor total do consumo foi: %.2f", consumo_total);
            System.out.printf("\nValor do ICMS: %.2f", total_icms);
            System.out.printf("\nValor do PIS: %.2f", total_pis);
            System.out.printf("\nValor do CONFINS: %.2f", total_confins);
            System.out.printf("\nValor total à pagar: %.2f", total);

        } else if(quan_consumida > 15 && quan_consumida < 20) {

            consumo_total = quan_consumida * v2;
            total_icms = consumo_total * icms;
            total_pis = consumo_total * pis;
            total_confins = consumo_total * confins;
            total = consumo_total + total_icms + total_confins + total_pis;

            System.out.printf("\nO valor total do consumo foi: %.2f", consumo_total);
            System.out.printf("\nValor do ICMS: %.2f", total_icms);
            System.out.printf("\nValor do PIS: %.2f", total_pis);
            System.out.printf("\nValor do CONFINS: %.2f", total_confins);
            System.out.printf("\nValor total à pagar: %.2f", total);

        } else {
            consumo_total = quan_consumida * v3;
            total_icms = consumo_total * icms;
            total_pis = consumo_total * pis;
            total_confins = consumo_total * confins;
            total = consumo_total + total_icms + total_confins + total_pis;

            System.out.printf("\nO valor total do consumo foi: %.2f", consumo_total);
            System.out.printf("\nValor do ICMS: %.2f", total_icms);
            System.out.printf("\nValor do PIS: %.2f", total_pis);
            System.out.printf("\nValor do CONFINS: %.2f", total_confins);
            System.out.printf("\nValor total à pagar: %.2f", total);
        }
    }
}
