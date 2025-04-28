import java.util.Scanner;

public class EstruturaFor {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int resp;
        float num1, num2;

        System.out.print("Digite o primeiro número da operação: ");
        num1 = sc.nextFloat();
        System.out.print("Digite o número que será operado: ");
        num2 = sc.nextFloat();

        System.out.println("------------------");
        System.out.println("       MENU       ");
        System.out.println("------------------");

        System.out.println("Qual operação deseja realizar?");
        System.out.println();
        for (int opcao = 0; opcao != 6; ) {
            System.out.println("\nMenu de Operações:");
            System.out.println("1 – Soma");
            System.out.println("2 – Subtração");
            System.out.println("3 – Multiplicação");
            System.out.println("4 – Divisão");
            System.out.println("5 – Trocar valores");
            System.out.println("6 – Sair");
            System.out.print("Escolha uma opção: ");
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado da divisão: " + ((double) num1 / num2));
                        // casting da divisão, mudança de float para double
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                case 5:
                    System.out.println("Digite o novo primeiro número:");
                    num1 = sc.nextInt();
                    System.out.println("Digite o novo segundo número:");
                    num2 = sc.nextInt();
                    System.out.println("Valores trocados com sucesso!");
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    


                    sc.close();
            }
        }
    }

}