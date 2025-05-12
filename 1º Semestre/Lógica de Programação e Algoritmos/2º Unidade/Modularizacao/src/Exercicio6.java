import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quer ver a tabuada? (s/n)");
        String resposta = sc.nextLine();

        if (resposta == "s") {
            System.out.println("Qual o número que deseja tabuar? (2-10)");
            int numero = sc.nextInt();

            Tabuada(numero);

        } else if (resposta == "n") {
            System.out.println("Saindo...");
            System.exit(1);

        } else {
            System.out.println("Insira um comando válido! (s/n)");
        }

        public static int Tabuada(int numero){

            if (numero >= 2 && numero <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println((numero + " x " + i + " = " + (numero * i)));
                }
            } else {
                System.out.println("Número inválido! Selecione apenas um número entre 2 e 10.");
                System.exit(1);
            }

        }
        sc.close();
    }
}
