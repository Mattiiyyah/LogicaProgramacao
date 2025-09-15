import java.util.Scanner;

public class ContaAgua {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int LIMITE = 15;
        final double P1 = 2.37, P2 = 3.42, ICMS = 0.25;
        double quan_consumida, valor_consumido,valor_esgoto, valor, valor_total;
        System.out.print("\nDigite a quantidade consumida em M³: ");
        quan_consumida = leitor.nextDouble();

        if(quan_consumida <= LIMITE) valor_consumido = quan_consumida * P1;
        else valor_consumido = quan_consumida * P2;

        valor_esgoto  = valor_consumido;
        valor = valor_esgoto + valor_consumido;
        valor_total = valor + (valor * ICMS);

        System.out.printf("\nO valor consumido é: %.2f", valor_consumido);
        System.out.printf("\nO valor de esgoto é: %.2f ", valor_esgoto);
        System.out.printf("\nO valor total sem icms é: %.2f", valor);
        System.out.printf("\nO valor total é: %.2f", valor_total);


        leitor.close();
        System.exit(0);
    }
}
