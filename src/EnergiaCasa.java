import java.util.Scanner;
public class EnergiaCasa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double v1 = 1.0, v2 = 1.3, v3 = 2.0;
        double consumo_khw, valorTotal = 0;
        System.out.println("-- ## CALCULANDO O VALOR DE ENERGIA NA CASA ## --");
        System.out.print("\nDigite a quantidade consumida em KHz: ");
        consumo_khw = leitor.nextDouble();

        if (consumo_khw <= 50) {
            valorTotal = consumo_khw * v1;
        } else if (consumo_khw <= 100) {
            valorTotal = (50 * v1) + (consumo_khw - 50) * v2;
        } else {
            valorTotal = (50 * v1) + (50 * v2) + (consumo_khw - 100) * v3;
        }

        System.out.print("\nO valor total é: " + valorTotal);

    }
}
