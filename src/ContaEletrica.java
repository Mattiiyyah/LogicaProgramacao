import java.util.Scanner;

public class ContaEletrica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int LIMITE = 100;
        final double VALOR_KHW = 0.85, ADICAO = 0.10, DESCONTO = 0.15;
        double con_khw, valor_consumido, valor, valor_desconto;
        System.out.print("\n Digite o valor consumido em KWH: ");
        con_khw = leitor.nextDouble();
        valor_consumido = con_khw * VALOR_KHW;

        if(con_khw > LIMITE) {
            valor = valor_consumido + (valor_consumido * ADICAO);
            System.out.printf("\nO valor (com acréscimo de 10%%) em R$ consumido por KWH é: %.2f", valor);
        }  else {
            valor_desconto = valor_consumido * DESCONTO;
            valor = valor_consumido - valor_desconto;
            System.out.printf("\nO valor (com desconto de 15%%) em R$ consumido por KWH é: %.2f", valor);
        }

        leitor.close();
        System.exit(0);
    }
}
