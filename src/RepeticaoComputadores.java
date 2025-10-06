import java.util.Scanner;

public class RepeticaoComputadores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int N_COMPU = 4;
        double preco, valor_reparo;
        double soma_preco = 0, soma_reparo = 0;
        double maior_valor = 0, menor_valor = Double.MAX_VALUE;
        int quant_reparo = 0;
        double soma_preco1 = 0, soma_preco2 = 0;
        double cont_c1 = 0, cont_c2 = 0;

        for (int i = 0; i < N_COMPU; i++) {
            System.out.println("\nDigite o preço do computador: ");
            preco = leitor.nextDouble();
            System.out.println("\nDigite o valor do reparo: ");
            valor_reparo = leitor.nextDouble();

            soma_preco += preco;
            soma_reparo += valor_reparo;


            if(valor_reparo > maior_valor) maior_valor = valor_reparo;
            if(valor_reparo < menor_valor) menor_valor = valor_reparo;

            if(valor_reparo > 0) quant_reparo++;

            if(preco >= 3000) {
                soma_preco1 += preco;
                cont_c1++;
            } else {
                soma_preco2 += preco;
                cont_c2++;
            }
        }

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("\nMédia dos preços: " + soma_preco / N_COMPU);
        System.out.println("Média dos valores de reparo: " + soma_reparo / N_COMPU);
        System.out.println("O valor do reparo mais alto é: " + maior_valor);
        System.out.println("O valor do reparo mais baixo é: " + menor_valor);
        System.out.println("O total das quantidades de reparo é: " + quant_reparo);
        System.out.printf("Porcentagem de computadores >= 3.000: %.2f%%", (cont_c1 * 100.0 / N_COMPU));
        System.out.printf("\nPorcentagem de computadores < 3.000: %.2f%%", (cont_c2 * 100.0 / N_COMPU));


        leitor.close();
        System.exit(0);

    }
}
