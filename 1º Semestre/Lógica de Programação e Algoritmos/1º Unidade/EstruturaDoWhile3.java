import java.util.Scanner;

public class EstruturaDoWhile3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont;

        System.out.println("Digite um número: ");
        cont = sc.nextInt();

        System.out.print("Os números inteiros do seu número selecionado até 0, em ordem decrescente e a cada dois números, é: ");

        do {
            if (cont % 2 == 0) {
                System.out.print(cont - 2);
            } else {
                System.out.println(cont - 1);
            }
        } while (cont > 0);
    }
}
