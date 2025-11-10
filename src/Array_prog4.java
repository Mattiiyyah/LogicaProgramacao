import java.util.Scanner;
public class Array_prog4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        final int TAM = 5;
        final double MEDIA_APROVACAO = 6.0;

        char[] sexo = new char[TAM];
        double[] nota = new double[TAM];
        double soma_nota = 0, media_nota;
        double maior_nota = -1, menor_nota = 11;
        int qtd_maior = 0, qtd_menor = 0;
        int cont_aprovado = 0, cont_reprovado = 0;
        double soma_notaf = 0, soma_notam = 0, media_feminino, media_masculino;
        int cont_f = 0, cont_m = 0;
        int cont_af = 0, cont_rf = 0, cont_am = 0, cont_rm = 0;
        int cont_inferior = 0, cont_superior = 0;

        for(int i = 0; i < TAM; i++) {

            System.out.println("\n\nInformações do aluno " + (i+1) + ": ");

            // Validação da nota aluno
            do {
                System.out.print("\nDigite a nota do aluno sendo de (0 a 10): ");
                nota[i] = leitor.nextDouble();
                if (nota[i] < 0 || nota[i] > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota[i] < 0 || nota[i] > 10);

            // Validação do sexo
            do {
                System.out.print("\nDigite [M] - Masculino ou [F] - Feminino do " + (i + 1) + "º aluno: ");
                sexo[i] = leitor.next().charAt(0);
                sexo[i] = Character.toUpperCase(sexo[i]); // transforma em maiúscula
                if (sexo[i] != 'M' && sexo[i] != 'F') {
                    System.out.println("Sexo inválido! Digite M ou F.");
                }
            } while (sexo[i] != 'M' && sexo[i] != 'F');

            soma_nota += nota[i];

            if (nota[i] >= maior_nota)
                if(nota[i] > maior_nota) {
                    maior_nota = nota[i];
                    qtd_maior = 1;
                }
                else
                   qtd_maior++;

            if (nota[i] <= menor_nota)
                if(nota[i] < menor_nota) {
                    menor_nota = nota[i];
                    qtd_menor = 1;
                } else
                    qtd_menor++;


            if (nota[i] >= MEDIA_APROVACAO)
                cont_aprovado++;
            else
                cont_reprovado++;

            if(sexo[i] == 'F') {
                soma_notaf += nota[i];
                cont_f++;

                if (nota[i] >= MEDIA_APROVACAO)
                    cont_af++;
                else
                    cont_rf++;

            } else {
               soma_notam += nota[i];
               cont_m++;

                if (nota[i] >= MEDIA_APROVACAO)
                    cont_am++;
                else
                    cont_rm++;
            }
        }

        media_nota = soma_nota / TAM;

        // Se cont_f > 0, faz o cálculo, senão (:) o resultado é 0.
        media_feminino = (cont_f > 0) ? (soma_notaf / cont_f) : 0;

        // Se cont_m > 0, faz o cálculo, senão (:) o resultado é 0.
        media_masculino = (cont_m > 0) ? (soma_notam / cont_m) : 0;

        for (int i = 0; i < TAM; i++) {
            if(nota[i] < media_nota)
                cont_inferior++;
            else
                cont_superior++;
        }

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("\nA média das notas é: " + String.format("%.2f", media_nota));
        System.out.println("A maior nota é: " + String.format("%.2f", maior_nota));
        System.out.print("Quantidade dos alunos com a maior nota [sendo igual] : " + qtd_maior);

        System.out.println("\nA menor nota é: " + String.format("%.2f", menor_nota));
        System.out.println("Quantidade dos alunos com a menor nota [sendo igual] : " + qtd_menor);

        System.out.println("% de alunos aprovados: " + String.format("%.2f", (cont_aprovado * 1.0 / TAM * 100)) + "%");
        System.out.println("% de alunos reprovados: " + String.format("%.2f", (cont_reprovado * 1.0 / TAM * 100)) + "%");

        System.out.println("Média de nota do sexo feminino é: " + String.format("%.2f", media_feminino));
        System.out.println("Média de nota do sexo masculino é: " + String.format("%.2f", media_masculino));

        System.out.println("% de aluno do sexo feminino é: " + String.format("%.2f", (cont_f * 1.0 / TAM * 100)) + "%");
        System.out.println("% de aluno do sexo masculino é: " + String.format("%.2f", (cont_m * 1.0 / TAM * 100)) + "%");

        System.out.println("% de aluno do sexo feminino aprovado: " + String.format("%.2f", (cont_af * 1.0 / cont_f * 100)) + "%");
        System.out.println("% de aluno do sexo feminino reprovado: " + String.format("%.2f", (cont_rf * 1.0 / cont_f * 100)) + "%");
        System.out.println("% de aluno do sexo masculino aprovado: " + String.format("%.2f", (cont_am * 1.0 / cont_m * 100)) + "%");
        System.out.println("% de aluno do sexo masculino reprovado: " + String.format("%.2f", (cont_rm * 1.0 / cont_m * 100)) + "%");

        System.out.println("% de aluno com nota < que a média : " + String.format("%.2f", (cont_inferior * 1.0 / TAM * 100)) + "%");
        System.out.println("% de aluno com nota >= que média : " + String.format("%.2f", (cont_superior * 1.0 / TAM * 100)) + "%");

        leitor.close();
        System.exit(0);

    }
}
