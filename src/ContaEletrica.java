import java.util.Scanner;

public class ContaEletrica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double supe_khw = 100, valor_khw = 0.85, adicao = 0.10, desconto = 0.15;
        double con_khw, valor_consumido, valor, valor_desconto;
        System.out.print("\n Digite o valor consumido em KWH: ");
        con_khw = leitor.nextDouble();
        valor_consumido = con_khw * valor_khw;

        if(con_khw >= supe_khw) {
            valor = valor_consumido + (valor_consumido * adicao);
            System.out.printf("\nO valor (com acréscimo de 10%%) em R$ consumido por KWH é: %.2f", valor);
        }  else {
            valor_desconto = valor_consumido * desconto;
            valor = valor_consumido - valor_desconto;
            System.out.printf("\nO valor (com desconto de 15%%) em R$ consumido por KWH é: %.2f", valor);
        }

        leitor.close();
        System.exit(0);
    }
}
