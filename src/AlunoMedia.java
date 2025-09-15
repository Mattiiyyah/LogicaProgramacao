import java.util.Scanner;

public class AlunoMedia {
    public static void main (String args[]) {
        final double MEDIA_APROVACAO = 6.0;
        double nota1, nota2, media;
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.print("\nDigite a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();
        media = (nota1 + nota2) / 2;

        if(media >= MEDIA_APROVACAO) System.out.print("\nAluno Aprovado: " + media);
        else System.out.print("Aluno reprovado: " + media);

        leitor.close();
        System.exit(0);
    }

}
