import java.util.Scanner;
public class ContaGas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int LIMITE1 = 15, LIMITE2 = 20;
        final double V1 = 2.37, V2 = 3.42, V3 = 5.0, ICMS = 0.25, PIS = 0.0077, CONFINS = 0.0356, DESCONTO = 0.10;
        double quan_consumida, consumo_total, total_icms, total_pis, total_confins, total, valor_desconto;
        String cargo;
        System.out.println("\n --- ## Calcula valor conta de gás ## ---");
        System.out.print("\nDigite seu cargo: ");
        cargo = leitor.next();
        System.out.print("\nDigite a quantidade de gás consumido em metros cúbicos: ");
        quan_consumida = leitor.nextDouble();

        if(quan_consumida <= LIMITE1) consumo_total = quan_consumida * V1;
        else if(quan_consumida < LIMITE2) consumo_total = quan_consumida * V2;
        else consumo_total = quan_consumida * V3;

        total_icms = consumo_total * ICMS;
        total_pis = consumo_total * PIS;
        total_confins = consumo_total * CONFINS;
        total = consumo_total + total_icms + total_confins + total_pis;

        if(cargo.equalsIgnoreCase("Professor") || cargo.equalsIgnoreCase("professor") || cargo.equalsIgnoreCase("PROFESSOR")) {
            valor_desconto = total * DESCONTO;
            total -= valor_desconto;
        } else {
            System.out.println("\nInfelizmente você não é professor então não receberá desconto");
        }

        System.out.printf("\nO valor total do consumo foi: %.2f", consumo_total);
        System.out.printf("\nValor do ICMS: %.2f", total_icms);
        System.out.printf("\nValor do PIS: %.2f", total_pis);
        System.out.printf("\nValor do CONFINS: %.2f", total_confins);
        System.out.printf("\nValor total à pagar: %.2f", total);

        leitor.close();
        System.exit(0);
    }
}
