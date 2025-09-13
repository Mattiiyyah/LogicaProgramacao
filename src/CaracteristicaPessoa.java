import java.util.Scanner;
public class CaracteristicaPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        double altura, peso;
        System.out.println("\n--- ## VERIFICANDO CARACTERISTICAS ## ---");
        System.out.print("\nDigite sua idade: ");
        idade = leitor.nextInt();
        System.out.print("\nDigite sua altura: ");
        altura = leitor.nextDouble();
        System.out.print("\nDigite seu peso: ");
        peso = leitor.nextDouble();

        if(idade > 18 && idade < 68) {
            if(altura > 1.65 && altura < 1.75) {
                if(peso > 70 && peso < 80) {
                    System.out.print("\nVOCÊ POSSUI TODAS AS CARACTERISTICAS DESEJADAS:");
                    System.out.print(idade + " anos " + altura + " m " + peso + " kg ");
                }
            }
        } else {
            System.out.print("Você não possui as caracteristicas desejadas pois: ");

            if(idade <= 18 || idade >= 68) {
                System.out.print("Sua idade é: " + idade + " anos");
            }

            if(altura < 1.65 || altura > 1.75) {
                System.out.print("Sua altura é: " + altura + " m");
            }

            if(peso < 70 || peso > 80) {
                System.out.print("Seu peso é: " + peso + " kg");
            }
        }

        leitor.close();
        System.exit(0);
    }
}
