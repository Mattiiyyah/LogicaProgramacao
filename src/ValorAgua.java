import java.util.Scanner;

public class ValorAgua {
   public static void main(String args[]) {
       Scanner leitor = new Scanner(System.in);
       final double valor1 = 1.20, valor2 = 1.50;
       double quan_Consumida, valorConsumido;
       System.out.print("\nDigite o valor de água consumido em metros cubicos: ");
       quan_Consumida = leitor.nextDouble();

       if (quan_Consumida > 0 && quan_Consumida <= 10) {
          valorConsumido = quan_Consumida * valor1;
          System.out.println("\nO valor consumido em metros cubicos é: " + valorConsumido);
       } else {
           valorConsumido = quan_Consumida * valor2;
           System.out.println("\nO valor consumido em metros cubicos é: " + valorConsumido);
       }
       leitor.close();
       System.exit(0);

    }
}
