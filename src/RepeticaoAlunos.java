import java.util.Scanner;

public class RepeticaoAlunos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int N_ALUNO = 4;
        double nota;
        char sexo;
        double soma_nota = 0, maior_nota = 0, menor_nota = Double.MAX_VALUE;
        double soma_m = 0, soma_f = 0, cont_m = 0, cont_f = 0;
        double aprovados = 0, reprovados = 0;

        for (int i = 0; i < N_ALUNO; i++) {
            // Validação da nota
            do {
                System.out.println("\nDigite a nota do aluno (0 a 10): ");
                nota = leitor.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota < 0 || nota > 10);

            // Validação do sexo
            do {
                System.out.println("Digite [M] - Masculino ou [F] - Feminino:");
                sexo = leitor.next().charAt(0);
                sexo = Character.toUpperCase(sexo); // transforma em maiúscula
                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo inválido! Digite M ou F.");
                }
            } while (sexo != 'M' && sexo != 'F');

            soma_nota += nota;

            if(nota > maior_nota) maior_nota = nota;
            if(nota < menor_nota) menor_nota = nota;

            if(sexo == 'F') {
                soma_f += nota;
                cont_f++;
            } else {
                soma_m += nota;
                cont_m++;
            }

            if(nota >= 5) aprovados++;
            else reprovados++;
        }

        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Média das notas dos alunos: %.2f%n", soma_nota / N_ALUNO);
        System.out.printf("A maior nota é: %.2f%n", maior_nota);
        System.out.printf("A menor nota é: %.2f%n", menor_nota);

        if (cont_f > 0)
            System.out.printf("Média de nota para meninas: %.2f%n", soma_f / cont_f);
        else
            System.out.println("Não há alunas cadastradas.");

        if (cont_m > 0)
            System.out.printf("Média de nota para meninos: %.2f%n", soma_m / cont_m);
        else
            System.out.println("Não há alunos cadastrados.");

        System.out.printf("Porcentagem de alunos femininos: %.2f%%%n", (cont_f * 100.0 / N_ALUNO));
        System.out.printf("Porcentagem de alunos masculinos: %.2f%%%n", (cont_m * 100.0 / N_ALUNO));
        System.out.printf("Porcentagem de alunos aprovados: %.2f%%%n", (aprovados * 100.0 / N_ALUNO));
        System.out.printf("Porcentagem de alunos reprovados: %.2f%%%n", (reprovados * 100.0 / N_ALUNO));

        leitor.close();
        System.exit(0);
    }
}
