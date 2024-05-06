import java.util.Scanner;
public class Contador {


/**
 * @param args
 */
public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
        if (parametroUm > parametroDois) {
          ParametrosInvalidosException novo;
        throw new .ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm + 1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    } catch (ParametrosInvalidosException exception) {
        System.out.println("Finalizar Programa");
    }
}
}
