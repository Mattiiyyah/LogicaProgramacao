import java.util.Scanner;
public class ValorReajuste {
    public static void main(String args[]) {
        double valor, taxa, novoValor;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite o valor atual: ");
        valor = leitor.nextDouble();
        System.out.print("\nDigite a taxa: ");
        taxa = leitor.nextDouble();
        novoValor = valor * (1 + taxa / 100);
        System.out.println("\nO novo valor é: " + novoValor);
        System.out.println("\nO antigo valor é: " + valor);

        leitor.close();
        System.exit(0);
    }
}
