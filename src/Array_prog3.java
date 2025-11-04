import java.util.Scanner;

public class Array_prog3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int TAM = 5;
        final int IDADE_ACIMA = 18;
        final double PESO_ACIMA = 500.00;

        int[] idade = new int[TAM];
        double[] peso = new double[TAM];

        int soma_idade = 0;
        double soma_peso = 0, media_peso, media_idade;
        double maior_peso = 0;
        double menor_peso = 9999;
        int qtd_maior = 0;
        int qtd_menor = 0;
        int cont_acima = 0, cont_abaixo_media = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite a idade do " + (i + 1) + " boi : ");
            idade[i] = leitor.nextInt();
            System.out.print("Digite o peso do " + (i + 1) + " boi : ");
            peso[i] = leitor.nextDouble();

            soma_idade += idade[i];
            soma_peso += peso[i];

            if (peso[i] >= maior_peso) {
                if (peso[i] > maior_peso) {
                    maior_peso = peso[i];
                    qtd_maior = 1;
                } else {
                    qtd_maior++;
                }
            }

            if (peso[i] <= menor_peso) {
                if (peso[i] < menor_peso) {
                    menor_peso = peso[i];
                    qtd_menor = 1;
                } else {
                    qtd_menor++;
                }
            }

            if (idade[i] > IDADE_ACIMA && peso[i] > PESO_ACIMA)
                cont_acima++;
        }

        media_peso = soma_peso / TAM;
        media_idade = (double) soma_idade / TAM;

        for (int i = 0; i < TAM; i++) {
            if (peso[i] < media_peso && idade[i] < media_idade)
                cont_abaixo_media++;
        }

        System.out.println("\n#### RESULTADOS ####");

        System.out.println("\nA média da idade dos bois é: " + media_idade);
        System.out.println("A média dos pesos dos bois é: " + media_peso);
        System.out.println("O peso do boi mais pesado é: " + maior_peso);
        System.out.println("O peso do boi mais leve é: " + menor_peso);
        System.out.println("Quantidade de bois com maior (sendo esses pesos iguais): " + qtd_maior);
        System.out.println("Quantidade de bois mais leve (sendo esses pesos iguais) : " + qtd_menor);
        System.out.println("% de bois com idade > 18 meses e peso > 500KG é: " + String.format("%.2f", (cont_acima * 1.0 / TAM * 100)) + "%");
        System.out.println("% de bois com peso < MEDIA e idade < MEDIA é: " + String.format("%.2f", (cont_abaixo_media * 1.0 / TAM * 100)) + "%");

        leitor.close();
        System.exit(0);
    }
}