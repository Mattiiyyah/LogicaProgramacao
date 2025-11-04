import java.util.Scanner;
public class Array_prog1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int TAM = 5;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int[] c = new int[TAM];

        for(int i = 0; i < TAM; i++) {
            System.out.print("Digite a [" + i + "] : ");
            a[i] = leitor.nextInt();
            System.out.print("Digite b [" + i + "] : ");
            b[i] = leitor.nextInt();
            c[i] = a[i] * b[i];
        }

        for(int i = 0; i < TAM; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }

        leitor.close();
        System.exit(0);

    }
}
