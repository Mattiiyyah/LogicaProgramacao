import java.util.Scanner;

public class SimuladoBoi {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int N_BOIS = 3;
        char raca;
        double peso;
        int idade;
        double soma_peso = 0;
        int soma_idade = 0;
        double maior_peso = 0, menor_peso = Double.MAX_VALUE;
        int cont_c = 0, cont_t = 0, cont_z = 0;
        double peso_c = 0, peso_t = 0, peso_z = 0;
        int idade_c = 0, idade_t = 0, idade_z = 0;

        for(int i = 0; i < N_BOIS; i++) {
            // validação da raça
            do {
                System.out.print("\nInforme a raça do boi (C/T/Z): ");
                raca = leitor.next().charAt(0);

                if(raca != 'C' && raca != 'T' && raca != 'Z') {
                    System.out.println("Informe corretamente a raça do boi sendo: C, T ou Z");
                }
            } while (raca != 'C' && raca != 'T' && raca != 'Z');

            // validação do peso
            do {
                System.out.print("Informe o peso em arrobas: ");
                peso = leitor.nextDouble();

                if(peso <= 0) {
                    System.out.println("Informe o peso do boi corretamente (valor positivo).");
                }
            } while(peso <= 0);

            // validação da idade
            do {
                System.out.print("Informe a idade do boi em meses: ");
                idade = leitor.nextInt();

                if(idade <= 0) {
                    System.out.println("Informe a quantidade de meses corretamente (valor positivo).");
                }
            } while(idade <= 0);

            // acumula valores gerais
            soma_peso += peso;
            soma_idade += idade;

            if(peso > maior_peso) maior_peso = peso;
            if(peso < menor_peso) menor_peso = peso;

            // acumula por raça
            if(raca == 'C') {
                peso_c += peso;
                idade_c += idade;
                cont_c++;
            } else if (raca == 'T') {
                peso_t += peso;
                idade_t += idade;
                cont_t++;
            } else {
                peso_z += peso;
                idade_z += idade;
                cont_z++;
            }
        }

        // resultados gerais
        System.out.printf("\nMédia dos pesos dos bois: %.2f\n", soma_peso / N_BOIS);
        System.out.printf("Média das idades dos bois: %.2f\n", (double)soma_idade / N_BOIS);
        System.out.println("Maior peso de boi: " + maior_peso);
        System.out.println("Menor peso de boi: " + menor_peso);

        // resultados por raça
        if(cont_c > 0) {
            System.out.print("\nCaracu:\n");
            System.out.printf("Porcentagem: %.2f%%\n", cont_c * 100.0 / N_BOIS);
            System.out.printf("Peso médio: %.2f\n", peso_c / cont_c);
            System.out.printf("Idade média: %.2f\n", (double)idade_c / cont_c);
        } else {
            System.out.println("\nNão há bois da raça Caracu.");
        }

        if(cont_t > 0) {
            System.out.print("\nTabapuã:\n");
            System.out.printf("Porcentagem: %.2f%%\n", cont_t * 100.0 / N_BOIS);
            System.out.printf("Peso médio: %.2f\n", peso_t / cont_t);
            System.out.printf("Idade média: %.2f\n", (double)idade_t / cont_t);
        } else {
            System.out.println("\nNão há bois da raça Tabapuã.");
        }

        if(cont_z > 0) {
            System.out.print("\nZebu:\n");
            System.out.printf("Porcentagem: %.2f%%\n", cont_z * 100.0 / N_BOIS);
            System.out.printf("Peso médio: %.2f\n", peso_z / cont_z);
            System.out.printf("Idade média: %.2f\n", (double)idade_z / cont_z);
        } else {
            System.out.println("\nNão há bois da raça Zebu.");
        }

        leitor.close();
        System.exit(0);
    }
}
