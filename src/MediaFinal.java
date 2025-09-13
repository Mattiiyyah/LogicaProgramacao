import java.util.Scanner;
public class MediaFinal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int total = 3;
        double n1, n2, n3, media;
        System.out.println("\n--- ## CALCULANDO MÉDIA DE ALUNO ## ---");
        System.out.print("\nDigite a primeira nota do aluno: ");
        n1 = leitor.nextDouble();
        System.out.print("\nDigite a segunda nota do aluno: ");
        n2 = leitor.nextDouble();
        System.out.print("\nDigite a terceira nota do aluno: ");
        n3 = leitor.nextDouble();

        media = (n1 + n2 + n3) / total;

        if(media > 9) System.out.printf("\nParabéns seu desempenho foi EXCELENTE: %.2f", media);

        else if(media <= 9 && media > 8) System.out.printf("\nParabéns seu desempenho foi ÓTIMO: %.2f", media);

        else if(media <= 8 && media >= 6) System.out.printf("\nParabéns seu desempenho foi ESPERADO: %.2f", media);

        else if(media < 6 && media >= 4) System.out.printf("\nVamos fazer um EXAME para aumentar em: %.2f", media);

        else System.out.printf("INFELIZMENTE VOCÊ REPROVOU: %.2f", media);

        leitor.close();
        System.exit(0);

    }
}
