import java.util.Scanner;

public class EstruturaDoWhile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont;
        System.out.print("Digite um numero: ");
        cont = sc.nextInt();

        System.out.println("Os números que vão do número selecionado até 1 são: ");

        do {
            cont--;
            System.out.println(cont);
        } while (cont > 1 );
    }
}
