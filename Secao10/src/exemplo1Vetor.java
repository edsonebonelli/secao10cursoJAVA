import java.util.Locale;
import java.util.Scanner;

public class exemplo1Vetor {

  /*
   * EXEMPLO 1
   * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
   * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
   * pessoas.
   */

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      double[] vect = new double[n];

      for (int i = 0; i < n; i++) {
        vect[i] = sc.nextDouble();
      }

      double add = 0.0;
      for (int i = 0; i < n; i++) {
        add += vect[i];
      }

      double avg = add / n;

      System.out.printf("Average Height: %.2f%n", avg);

      sc.close();
    }
  }
}
