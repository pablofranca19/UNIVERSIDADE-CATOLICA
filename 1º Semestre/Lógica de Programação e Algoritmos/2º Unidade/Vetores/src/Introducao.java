import java.util.Scanner;

public class Introducao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas são?");
        int pessoas = sc.nextInt();

        String vetores[] = new String [pessoas];

        System.out.println("Insira o nome das pessoas ");
        for (int i = 0; i < pessoas; i++) {
            vetores[i] = sc.next();
        }

        System.out.println("Os nomes que voce inseriu foi:");

        for (int j = 0; j <= pessoas; j++) {
            System.out.println("Ola, " + vetores[j] + "!");
        }

        sc.close();
    }

}
