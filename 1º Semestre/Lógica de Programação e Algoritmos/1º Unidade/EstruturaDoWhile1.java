import java.util.Scanner;

public class EstruturaDoWhile1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 0;;
        int n = 0;;
        System.out.print("Digite um numero: ");
        n = sc.nextInt();

        System.out.println("Os números que vão de 1 até o número selecionado são: ");

        do {
            cont++;
            System.out.println(cont);
        } while (cont < n);




        sc.close();


    }
}
