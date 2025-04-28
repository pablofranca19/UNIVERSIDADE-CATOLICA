import java.util.Scanner;

public class Bilheteria {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int quantidade;
        double valor = 0, troco;
        System.out.printf("-------Bilhetes-------\n1       2,00\n2       3,00\n10      12,00\n----------------------\nEscolha a quantidade de bilhetes:");
        quantidade =  tc.nextInt();

        switch (quantidade){
            case 1: valor = 2.00;
                break;
            case 2: valor = 3.00;
                break;
            case 10: valor = 12.00;
                break;
            default: System.out.println("Erro");
        }
        System.out.println("O valor foi "+ valor +" reais \nDigite 1 se você precisa de troco e 2 se você não precisar");
        quantidade = tc.nextInt();
        if (quantidade == 1){
            System.out.print("Troco para quanto: ");
            troco = tc.nextDouble();
            troco = troco - valor;
            System.out.println("Seu troco foi de "+troco);
        }else if (quantidade == 2){
            System.out.println("Fim do programa");
        }else {
            System.out.println("Erro");
        }

    }
}