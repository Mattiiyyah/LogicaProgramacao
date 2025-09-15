import java.util.Scanner;

public class ValorAgua {
   public static void main(String args[]) {
       Scanner leitor = new Scanner(System.in);
       final int LIMITE = 10;
       final double V1 = 1.20, V2 = 1.50;
       double quan_Consumida, valorConsumido;
       System.out.print("\nDigite o valor de água consumido em metros cubicos: ");
       quan_Consumida = leitor.nextDouble();

       if (quan_Consumida <= LIMITE) valorConsumido = quan_Consumida * V1;
       else valorConsumido = quan_Consumida * V2;

       System.out.println("\nO valor consumido em metros cubicos é: " + valorConsumido);
       leitor.close();
       System.exit(0);

    }
}
