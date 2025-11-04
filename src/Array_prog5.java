import java.util.Scanner;
public class Array_prog5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int TAM = 5;
        final double MULTIPLO = 5;

        int[] numeros = new int[TAM];
        int cont_par = 0, cont_impar = 0, cont_multiplo = 0;
        double media_numeros;
        int soma_numero = 0, maior_numero = -1, menor_numero = Integer.MAX_VALUE;

        for(int i = 0; i < TAM; i++) {
            System.out.println("\nDigite o " + (i+1) + "º número: ");
            numeros[i] = leitor.nextInt();

            //item a
            if(numeros[i] % 2 == 0)
                cont_par++;
            else
                cont_impar++;

            //item b
            soma_numero += numeros[i];

            if(i == 0) {
                maior_numero = numeros[i];
                menor_numero = numeros[i];
            } else {
                if(numeros[i] > maior_numero)
                    maior_numero = numeros[i];
                if(numeros[i] < menor_numero)
                    menor_numero = numeros[i];
            }

            //item e
            if(numeros[i] % 5 == 0)
                cont_multiplo++;
        }

        media_numeros = (double) soma_numero / TAM;

        System.out.println("\n======= RESULTADOS =======");

        // Item a
        System.out.println("Quantidade de números Pares: " + cont_par);
        System.out.println("Quantidade de números Ímpares: " + cont_impar);
        System.out.println("% de números Pares: " + String.format("%.2f", (cont_par * 1.0 / TAM * 100)) + "%");
        System.out.println("% de números Ímpares: " + String.format("%.2f", (cont_impar * 1.0 / TAM * 100)) + "%");

        // Item b
        System.out.println("\nSoma de todos os números: " + soma_numero);
        System.out.println("Média de todos os números: " + String.format("%.2f", media_numeros));

        // Item c e d
        System.out.println("\nMaior número digitado: " + maior_numero);
        System.out.println("Menor número digitado: " + menor_numero);

        // Item e
        System.out.println("\nQuantidade de múltiplos de 5: " + cont_multiplo);
        System.out.println("% de múltiplos de 5: " + String.format("%.2f", (cont_multiplo * 1.0 / TAM * 100)) + "%");

        leitor.close();
        System.exit(0);
    }
}
