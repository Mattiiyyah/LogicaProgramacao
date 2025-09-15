import java.util.Scanner;
public class AguaConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int LIMITE1 = 10, LIMITE2 = 20, LIMITE3 = 30;
        final double V1= 1.20, V2 = 1.50, V3 = 2.00, V4 = 2.50;
        double consumo, total;
        System.out.print("\n--- ## CALCULANDO VALOR DE ÁGUA ## ---");
        System.out.print("\nDigite a quantidade de água consumida em metros cúbicos: ");
        consumo = leitor.nextDouble();

        if(consumo <= LIMITE1) total = consumo * V1;
        else if(consumo <= LIMITE2) total = consumo * V2;
        else if(consumo <= LIMITE3) total = consumo * V3;
        else total = consumo * V4;

        System.out.printf("\nO total para pagar é: %.2f", total);

        leitor.close();
        System.exit(0);
    }
}
