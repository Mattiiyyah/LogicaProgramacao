import java.util.Scanner;
public class EmpresaModelo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int LIM_IDADE = 18;
        final double LIM_ALTURA = 1.75, LIM_PESO1 = 50, LIM_PESO2 = 80;
        int idade;
        double peso, altura;
        System.out.println("\n--- (## MODELO ##) ---");
        System.out.print("\nDigite sua idade: ");
        idade = leitor.nextInt();
        System.out.print("\nDigite sua altura: ");
        altura = leitor.nextDouble();
        System.out.print("\nDigite seu peso: ");
        peso = leitor.nextDouble();

        if(idade > LIM_IDADE && altura > LIM_ALTURA && (peso >= LIM_PESO1 && peso <= LIM_PESO2)) {
            System.out.println("PARÁBENS VOCÊ FOI CONTRATADO PARA SER MODELO");
        } else {
            if(idade <= LIM_IDADE) {
                System.out.println("Você não está contratado pois você tem " + idade + " anos");
            }
            if(altura < LIM_ALTURA) {
                System.out.println("Você não está contratado pois sua altura é " + altura + " m");
            }
            if(peso < LIM_PESO1 || peso > LIM_PESO2) {
                System.out.println("Você não está contratado pois você tem " + peso + " KG");
            }
        }


        leitor.close();
        System.exit(0);

    }
}
