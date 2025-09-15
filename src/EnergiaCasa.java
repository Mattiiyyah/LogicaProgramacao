import java.util.Scanner;
public class EnergiaCasa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int LIM_1 = 50, LIM_2 = 100;
        final double V1 = 1.0, V2 = 1.3, V3 = 2.0;
        double consumo_khw, valorTotal = 0;
        System.out.println("-- ## CALCULANDO O VALOR DE ENERGIA NA CASA ## --");
        System.out.print("\nDigite a quantidade consumida em KHz: ");
        consumo_khw = leitor.nextDouble();

        if (consumo_khw <= LIM_1) valorTotal = consumo_khw * V1;
        else if (consumo_khw <= LIM_2) valorTotal = (LIM_1 * V1) + (consumo_khw - LIM_1) * V2;
        else valorTotal = (LIM_1 * V1) + (LIM_1 * V2) + (consumo_khw - LIM_2) * V3;

        System.out.print("\nO valor total é: " + valorTotal);

        leitor.close();
        System.exit(0);

    }
}
