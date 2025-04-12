# **Documentação do código interativo**
#### Primeiramente, importei o Locale e o Scanner que iria ser utilizado para possibilitar o input do usuário:
~~~ Java
import java.util.Locale;
import java.util.Scanner;
~~~
#### Após isso, criei a variável _scanner_:
~~~ Java
try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US))
~~~
#### Depois, para organizar o sistema de input, imprimi no terminal a primeira pergunta e, em seguida, criei a variável _nome_:
~~~ Java
try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Qual seria o seu nome? ");
            String nome = scanner.next();
~~~
#### Repeti o processo para as outras três variáveis: 
~~~ Java
try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Qual seria o seu nome? ");
            String nome = scanner.next();

            System.out.println("E seu sobrenome? ");
            String sobrenome = scanner.next();

            System.out.println("Sua idade? ");
            int idade = scanner.nextInt();

            System.out.println("Por último... qual sua altura? ");
            double altura = scanner.nextDouble();
~~~
#### Imprimi no terminal a mensagem com algumas informações dadas pelo próprio usuário, junto de uma mensagem:
~~~ Java
System.out.println("Olá, ser humano chamado " + nome + " " + sobrenome);
            System.out.println("Hm... então você tem " + idade + " anos, ein?");
~~~
#### Adicionei condicionais para uma resposta mais específica sobre o usuário:
~~~ Java
            if (idade >= 18) {
                System.out.println("Você já pode ser preso... rs.");
            }

            else {
                System.out.println("Você ainda não pode ser preso... AINDA!");
            }
~~~
#### Em seguida, imprimi outra mensagem no terminal e adicionei condicionais para uma resposta complementar:
~~~ Java
System.out.println("Você tem " + altura + "m " + "de altura??!!");

            if (altura >= 1.70) {
                System.out.println("Isso é um pouco... alto, não acha?");
            }

            else {
                System.out.println("Você é um ser humano meio baixinho... hahah, pobre.");
            }
~~~
## Aqui, por fim, um dos resultados possíveis:
![Resultado do programa](https://github.com/spidercaio/codigo-interativo-java/assets/166333842/d1e81132-5d5a-4dec-85d9-f013073e72c7)

##### Para mais informações, veja a documentação Java [clicando aqui.](https://docs.oracle.com/en/java/javase/22/)
