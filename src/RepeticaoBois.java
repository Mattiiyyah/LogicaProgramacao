import java.util.Scanner;

public class RepeticaoBois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int N_BOIS = 3;
        double peso;
        int idade, piquete;
        int soma_idade = 0, cont_abate = 0;
        double soma_peso = 0, maior_peso = 0, menor_peso = Double.MAX_VALUE;
        double cont_p1 = 0, cont_p2 = 0, cont_p3 = 0;
        double soma_peso1 = 0 , soma_peso2 = 0, soma_peso3 = 0;


        for (int i = 0; i < N_BOIS; i++) {
            System.out.println("\nInforme o peso em KG do boi: ");
            peso = leitor.nextDouble();
            System.out.println("\nInforme a idade em meses do boi: ");
            idade = leitor.nextInt();
            System.out.println("\n[1] - Piquete, [2] - Piquete, [3] - Piquete");
            piquete = leitor.nextInt();

            soma_idade += idade;
            soma_peso += peso;

            if(peso > maior_peso) maior_peso = peso;
            if(peso < menor_peso) menor_peso = peso;

            if(piquete == 1) {
                soma_peso1 += peso;
                cont_p1++;
            }
            else if (piquete == 2) {
                soma_peso2 += peso;
                cont_p2++;
            }
            else {
                soma_peso3 += peso;
                cont_p3++;
            }

            if(idade > 18 && peso > 500) cont_abate++;

        }

        System.out.printf("\nA média dos pesos dos bois é: %.2f", soma_peso / N_BOIS);
        System.out.print("\nA média da idades dos bois é: " +  soma_idade / N_BOIS);
        System.out.print("\nO peso do boi mais pesado é : " +  maior_peso);
        System.out.print("\nO peso do boi mais leve é : " +  menor_peso);
        System.out.print("\nMédia do piquete 1: " +  soma_peso1 / cont_p1);
        System.out.print("\nMédia do piquete 2: " +  soma_peso2 / cont_p2);
        System.out.print("\nMédia do piquete 3: " +  soma_peso3 / cont_p3);
        System.out.printf("\nPorcentagem de bois acima da idade e acima do peso: %.2f", (cont_abate * 100.0 / N_BOIS));

        leitor.close();
        System.exit(0);

    }
}
