import java.util.Scanner;

public class SimuladoNota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final double P1 = 2, P2 = 3, P3 = 4;
        final double MEDIA_APROVACAO = 6;
        double nota1, nota2, nota3, media, total, soma_notas;
        System.out.print("\nInforme a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.print("\nInforme a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();
        System.out.print("\nInforme a terceira nota do aluno: ");
        nota3 = leitor.nextDouble();

        total = P1 + P2 + P3;
        soma_notas = (nota1 * P1) + (nota2 * P2) + (nota3 * P3);
        media = soma_notas / total;

        System.out.printf("\nMédia final: %.2f\n", media);

        if(media >= MEDIA_APROVACAO) System.out.println("\nAluno aprovado");
        else System.out.println("\nAluno reprovado");

        leitor.close();
        System.exit(0);
    }
}
