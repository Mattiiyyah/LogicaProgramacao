import java.util.Scanner;

public class ContaEnergia {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        final int KWH = 100;
        final double VALOR_KHW = 1.50, PORCENTUAL = 0.10;
        double quan_Consumida, valor;
        System.out.print("\nDigite a quantidade de Khh consumida: ");
        quan_Consumida = leitor.nextDouble();
        valor = quan_Consumida * VALOR_KHW;

        if(quan_Consumida > KWH) {
            valor *= PORCENTUAL;
            System.out.printf("\nO valor pago com adição é: %.2f", valor);
        } else {
            System.out.printf("\nO valor pago é:  %.2f",valor);
        }

        leitor.close();
        System.exit(0);
    }
}
