import java.util.Locale;
import java.util.Scanner;

public class TesteExecucao {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Qual seria o seu nome? ");
            String nome = scanner.next();

            System.out.println("E seu sobrenome? ");
            String sobrenome = scanner.next();

            System.out.println("Sua idade? ");
            int idade = scanner.nextInt();

            System.out.println("Por último... qual sua altura? ");
            final double altura = scanner.nextDouble();

            System.out.println("Olá, ser humano chamado " + nome + " " + sobrenome);
            System.out.println("Hm... então você tem " + idade + " anos, ein?");

            if (idade >= 18) {
                System.out.println("Você já pode ser preso... rs.");
            }

            else {
                System.out.println("Você ainda não pode ser preso... AINDA!");
            }

            System.out.println("Você tem " + altura + "m " + "de altura??!!");

            if (altura >= 1.70) {
                System.out.println("Isso é um pouco... alto, não acha?");
            }

            else {
                System.out.println("Você é um ser humano meio baixinho... hahah, pobre.");
            }
        }

    }
}
