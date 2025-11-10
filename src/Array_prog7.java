import java.util.Scanner;

public class Array_prog7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int TAM = 4;

        int[] idade = new int[TAM];
        char[] sexo = new char[TAM];

        int soma_idade = 0, soma_idadef = 0, soma_idadem = 0;
        double media_idade, media_idadef, media_idadem;
        int cont_f = 0, cont_m = 0;
        int maior_idade = 0, menor_idade = 999;
        int qtd_maior = 0, qtd_menor = 0;
        int maior_idade_f = 0, maior_idade_m = 0;
        int menor_idade_f = 999, menor_idade_m = 999;


        for(int i = 0; i < TAM; i++) {

            System.out.println("\n\nInformações da " + (i+1) + "º pessoa: ");

            // Validação idade
            do {
                System.out.print("\nDigite idade sendo (18 a 100): ");
                idade[i] = leitor.nextInt();
                if (idade[i] <= 18 || idade[i] > 100) {
                    System.out.println("Idade inválida! Tente novamente.");
                }
            } while (idade[i] <= 18 || idade[i] > 100);


            // Validação do sexo
            do {
                System.out.print("\nDigite [M] - Masculino ou [F] - Feminino da " + (i + 1) + "º pessoa: ");
                sexo[i] = leitor.next().charAt(0);
                sexo[i] = Character.toUpperCase(sexo[i]); // transforma em maiúscula
                if (sexo[i] != 'M' && sexo[i] != 'F') {
                    System.out.println("Sexo inválido! Digite M ou F.");
                }
            } while (sexo[i] != 'M' && sexo[i] != 'F');

            soma_idade += idade[i];

            if(sexo[i] == 'F') {
                soma_idadef += idade[i];
                cont_f++;

                if(idade[i] > maior_idade_f)
                    maior_idade_f = idade[i];
                if(idade[i] < menor_idade_f)
                    menor_idade_f = idade[i];
            }
            else {
                soma_idadem += idade[i];
                cont_m++;

                if(idade[i] > maior_idade_m)
                    maior_idade_m = idade[i];
                if(idade[i] < menor_idade_m)
                    menor_idade_m = idade[i];
            }

            if(idade[i] >= maior_idade)
                if(idade[i] > maior_idade) {
                    maior_idade = idade[i];
                    qtd_maior = 1;
                }
                else
                    qtd_maior++;

            if(idade[i] <= menor_idade)
                if(idade[i] < menor_idade) {
                    menor_idade = idade[i];
                    qtd_menor = 1;
                }
                else
                    qtd_menor++;
        }

        media_idade = (double) soma_idade / TAM;
        media_idadef = (double) soma_idadef / cont_f;
        media_idadem = (double) soma_idadem / cont_m;

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("A média das idades é: " + media_idade);
        System.out.println("A média das idades do sexo feminino é: " + media_idadef);
        System.out.println("A média das idades do sexo masculino é: " + media_idadem);
        System.out.println("A maior idade é: " + maior_idade + " A quantidade de pessoas com essa idade é: " + qtd_maior);
        System.out.println("A menor idade é: " + menor_idade + " A quantidade de pessoas com essa idade é: " + qtd_menor);
        System.out.println("A maior idade do sexo feminino é: " + maior_idade_f);
        System.out.println("A menor idade do sexo feminino é: " + menor_idade_f);
        System.out.println("A maior idade do sexo masculino é: " + maior_idade_m);
        System.out.println("A menor idade do sexo masculino é: " + menor_idade_m);

        leitor.close();
        System.exit(0);
    }
}
