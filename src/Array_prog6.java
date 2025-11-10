import java.util.Scanner;

public class Array_prog6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int TAM = 5;

        double[] salario = new double[TAM];
        char[] setor = new char[TAM];

        double soma_salario = 0, media_salario = 0;
        double soma_salarioV = 0, soma_salarioP = 0, soma_salarioC = 0, media_V, media_P, media_C;
        double cont_sal = 0, cont_salV = 0, cont_salP = 0, cont_salC = 0;
        int cont_v = 0, cont_p = 0, cont_c = 0;

        for(int i = 0; i < TAM; i++) {
            System.out.println("\n\nInforme o salario do: " + (i+1) + " funcionário : ");
            salario[i] = leitor.nextDouble();

            do {
                System.out.print("\nDigite [V] - Vendas ou [P] - Produção ou [C] - Comercial para o setor do funcionário: " + (i + 1) + ": ");
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

            if(salario[i] < media_V)
                cont_salV++;

            if(salario[i] < media_P)
                cont_salP++;

            if(salario[i] < media_C)
                cont_salC++;
        }
        

        leitor.close();
        System.exit(0);

    }
}
