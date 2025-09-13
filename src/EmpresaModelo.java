import java.util.Scanner;
public class EmpresaModelo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        double peso, altura;
        System.out.println("\n--- (## MODELO ##) ---");
        System.out.print("\nDigite sua idade: ");
        idade = leitor.nextInt();
        System.out.print("\nDigite sua altura: ");
        altura = leitor.nextDouble();
        System.out.print("\nDigite seu peso: ");
        peso = leitor.nextDouble();

        if(idade > 18 && altura > 1.75 && (peso >= 50 && peso <= 80)) {
            System.out.println("PARÁBENS VOCÊ FOI CONTRATADO PARA SER MODELO");
        } else {
            if(idade <= 18) {
                System.out.println("Você não está contratado pois você tem " + idade + " anos");
            }
            if(altura < 1.75) {
                System.out.println("Você não está contratado pois sua altura é " + altura + " m");
            }
            if(peso < 50 || peso > 80) {
                System.out.println("Você não está contratado pois você tem " + peso + " KG");
            }
        }


        leitor.close();
        System.exit(0);

    }
}
