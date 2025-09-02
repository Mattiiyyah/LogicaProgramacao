import java.util.Scanner;

public class ContaEnergia {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        final double kwh = 100, valorKwh = 1.50, porcentual = 0.10;
        double quan_Consumida, valor;
        System.out.print("\nDigite a quantidade de Khh consumida: ");
        quan_Consumida = leitor.nextDouble();
        valor = quan_Consumida * valorKwh;

        if(quan_Consumida > kwh) {
            valor *= porcentual;
            System.out.print("\nO valor pago com adição é: " + valor);
        } else {
            System.out.print("\nO valor pago é: " + valor);
        }

        leitor.close();
        System.exit(0);
    }
}
