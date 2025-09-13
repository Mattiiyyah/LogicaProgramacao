import java.util.Scanner;
public class AguaConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double v1 = 1.20, v2 = 1.50, v3 = 2.00, v4 = 2.50;
        double consumo, total;
        System.out.print("\n--- ## CALCULANDO VALOR DE ÁGUA ## ---");
        System.out.print("\nDigite a quantidade de água consumida em metros cúbicos: ");
        consumo = leitor.nextDouble();

        if(consumo > 0 && consumo <= 10) {
            total = consumo * v1;
            System.out.printf("\nO total para pagar é: %.2f", total);
        } else if(consumo > 10 && consumo <= 20) {
            total = consumo * v2;
            System.out.printf("\nO total para pagar é: %.2f", total);
        } else if(consumo > 20 && consumo <= 30) {
            total = consumo * v3;
            System.out.printf("\nO total para pagar é: %.2f", total);
        } else {
            total = consumo * v4;
            System.out.printf("\nO total para pagar é: %.2f", total);
        }

        leitor.close();
        System.exit(0);
    }
}
