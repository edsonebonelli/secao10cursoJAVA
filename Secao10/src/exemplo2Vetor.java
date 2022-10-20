import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class exemplo2Vetor {
  /*
   * EXEMPLO 2
   * Fazer um programa para ler um número inteiro N e os dados (nome e preço) de
   * N produtos. Armazene os N produtos em um valor. Em seguida, mostre o preço
   * médio dos produtos.
   */

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      Products[] vect = new Products[n];

      for (int i = 0; i < n; i++) {
        sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        vect[i] = new Products(name, price);
      }

      double add = 0.0;
      for (int i = 0; i < n; i++) {
        add += vect[i].getPrice();
      }

      double avg = add / n;

      System.out.printf("Average Price: %.2f%n", avg);

      sc.close();
    }
  }
}
