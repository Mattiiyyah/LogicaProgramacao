import java.util.Scanner;
public class CaracteristicaPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int IDADE1 = 18, IDADE2 = 68;
        final double ALTURA1 = 1.65,ALTURA2 = 1.75, PESO1 = 70, PESO2 = 80;
        int idade;
        double altura, peso;
        System.out.println("\n--- ## VERIFICANDO CARACTERISTICAS ## ---");
        System.out.print("\nDigite sua idade: ");
        idade = leitor.nextInt();
        System.out.print("\nDigite sua altura: ");
        altura = leitor.nextDouble();
        System.out.print("\nDigite seu peso: ");
        peso = leitor.nextDouble();

        if((idade > IDADE1 && idade < IDADE2) && (altura > ALTURA1 && altura < ALTURA2) && (peso > PESO1 && peso < PESO2)) {
                    System.out.println("\nVOCÊ POSSUI TODAS AS CARACTERISTICAS DESEJADAS:");
                    System.out.print("\n" + idade + " anos " + altura + " m " + peso + " kg ");
        } else {
            System.out.println("\nVocê não possui as caracteristicas desejadas pois: ");

            if(idade <= IDADE1 || idade >= IDADE2) {
                System.out.print("\nSua idade é: " + idade + " anos");
            }

            if(altura < ALTURA1 || altura > ALTURA2) {
                System.out.print("\nSua altura é: " + altura + " m");
            }

            if(peso < PESO1 || peso > PESO2) {
                System.out.print("\nSeu peso é: " + peso + " kg");
            }
        }

        leitor.close();
        System.exit(0);
    }
}
