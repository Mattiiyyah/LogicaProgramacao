import java.util.Scanner;

public class Array_prog6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int TAM = 6;

        double[] salario = new double[TAM];
        char[] setor = new char[TAM];

        double soma_salario = 0, media_salario;
        double soma_salarioV = 0, soma_salarioP = 0, soma_salarioC = 0, media_V, media_P, media_C;
        double cont_sal = 0, cont_salv = 0, cont_salp = 0, cont_salc = 0;
        int cont_v = 0, cont_p = 0, cont_c = 0;

        for(int i = 0; i < TAM; i++) {
            System.out.print("\nInforme o salario do " + (i+1) + "º funcionário : ");
            salario[i] = leitor.nextDouble();

            do {
                System.out.print("\nDigite [V] - Vendas ou [P] - Produção ou [C] - Comercial para o setor do " + (i + 1) + "º funcionário: ");
                setor[i] = leitor.next().charAt(0);
                setor[i] = Character.toUpperCase(setor[i]);
            } while(setor[i] != 'V' && setor[i] != 'P' && setor[i] != 'C');

            soma_salario += salario[i];

            if(setor[i] == 'V') {
                soma_salarioV += salario[i];
                cont_v++;
            } else if (setor[i] == 'P') {
                soma_salarioP += salario[i];
                cont_p++;
            } else {
                soma_salarioC += salario[i];
                cont_c++;
            }

        }

        media_salario = soma_salario / TAM;
        media_V = (cont_v > 0 ) ? (soma_salarioV / cont_v) : 0;
        media_P = (cont_p > 0 ) ? (soma_salarioP / cont_p) : 0;
        media_C = (cont_c > 0 ) ? (soma_salarioC / cont_c) : 0;

        for(int i = 0; i < TAM; i++) {
            if(salario[i] >= media_salario)
                cont_sal++;

            if(setor[i] == 'V' && salario[i] < media_V)
                cont_salv++;

            if(setor[i] == 'P' && salario[i] < media_P)
                cont_salp++;

            if(setor[i] == 'C' && salario[i] < media_C)
                cont_salc++;
        }

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("\nA média salarial dos funcionários é: " + media_salario);
        System.out.println("A média salarial dos funcionários do setor de VENDAS é: " + media_V);
        System.out.println("A média salarial dos funcionários do setor de PRODUÇÃO é: " + media_P);
        System.out.println("A média salarial dos funcionários do setor de COMERCIAL é: " + media_C);
        System.out.println("A quantidade de funcionários do setor de VENDAS é: " + cont_v);
        System.out.println("A quantidade de funcionários do setor de PRODUÇÃO é: " + cont_p);
        System.out.println("A quantidade de funcionários do setor de COMERCIAL é: " + cont_c);
        System.out.println("% de funcionários do setor de VENDAS é: " + String.format("%.2f", (cont_v * 1.0 / TAM * 100)) + "%");
        System.out.println("% de funcionários do setor de PRODUÇÃO é: " + String.format("%.2f", (cont_p  * 1.0 / TAM * 100)) + "%");
        System.out.println("% de funcionários do setor de COMERCIAL é: " + String.format("%.2f", (cont_c * 1.0 / TAM * 100)) + "%");
        System.out.println("% de salários igual ou superior que a média salarial é: "+ String.format("%.2f", (cont_sal * 100 / TAM)) + "%");

        if(cont_v > 0)
            System.out.println("% de salários abaixo da média salarial do setor de VENDAS é: " + String.format("%.2f", (cont_salv * 100 / cont_v)) + "%");
        else
            System.out.println("Sem funcionários cadastrados no setor de VENDAS");

        if(cont_p > 0)
            System.out.println("% de salários abaixo da média salarial do setor de PRODUÇÃO é: " + String.format("%.2f", (cont_salp * 100 / cont_p)) + "%");
        else
            System.out.println("Sem funcionários cadastrados no setor de PRODUÇÃO");

        if(cont_c > 0)
            System.out.println("% de salários abaixo da média salarial do setor de COMERCIAL é: " + String.format("%.2f", (cont_salc * 100 / cont_c)) + "%");
        else
            System.out.println("Sem funcionários cadastrados no setor de COMERCIAL");

        leitor.close();
        System.exit(0);

    }
}
