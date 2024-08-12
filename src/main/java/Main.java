import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int Alcool = 1;
    int Gasolina = 2;

    int Diesel = 3;
    int Fim = 4;

    int preferencia = 0;
    while (preferencia != Fim) {
      System.out.println("Qual tipo de combustível você quer?");

      preferencia = sc.nextInt();

      if (preferencia == Alcool) {
        System.out.println("Obrigado pelo contribuição");
      } else if (preferencia == Gasolina) {
        System.out.println("Obrigado pelo contribuição");
      } else if (preferencia == Diesel) {
        System.out.println("Obrigado pelo contribuição");
      } else if (preferencia == Fim) {
        System.out.println("Muito obrigado.");

        System.out.println("1520 pessoas escolheram Alcool");
        System.out.println("2500 pessoas escolheram gasolina");
        System.out.println("2756 pessoas escolheram Diesel");
      } else {
        System.out.println("Opção inválida. Por favor, escolha novamente.");
}
}
}
}
