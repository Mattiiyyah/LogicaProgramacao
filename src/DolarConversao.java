import java.util.Scanner;
public class DolarConversao {
    public static void  main(String args[]) {
        double cotacaoDoalar, dolar, reais;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite a cotação do dolar hoje: ");
        cotacaoDoalar = leitor.nextDouble();
        System.out.print("\nDigite o valor em dolar: ");
        dolar = leitor.nextDouble();
        reais = cotacaoDoalar * dolar;
        System.out.print("\nO valor do dolar em R$ é " + reais);

        leitor.close();
        System.exit(0);
    }
}
