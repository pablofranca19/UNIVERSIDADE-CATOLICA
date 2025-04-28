
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float saldo;
        double valorCredito1;
        double valorCredito2;
        double valorCredito3;
        String zeroCredito = "Nenhum crédito encontrado";



        System.out.println("==============TABELA======================");
        System.out.println("0,00 a 200,00 |  Nenhum crédito");
        System.out.println("200,01 a 400,00 | 20% do saldo médio");
        System.out.println("400,01 a 600,00 | 30% do saldo médio");
        System.out.println("Acima de 600,00 | 40% do saldo médio");
        System.out.println("======================================");


        System.out.print("Digite o seu saldo médio em R$: ");
        saldo = sc.nextFloat();
        System.out.println("-----------------------");
        System.out.println("=======SISTEMA========" );
        System.out.println("-----------------------");
        System.out.println("SEU SALDO É R$ " + saldo);

        if (saldo >= 0 && saldo <= 200.00)
        {
            System.out.println(zeroCredito);
        } else if (saldo >= 200.01 && saldo <= 400.00) {
            valorCredito1 = saldo * 0.2;
            System.out.println("O VALOR DO SEU CRÉDITO É " + valorCredito1);
        } else if (saldo >= 400.01 && saldo <= 600.00) {
            valorCredito2 = saldo * 0.3;
            System.out.println("E O VALOR DO SEU CRÉDITO É " + valorCredito2);
        } else if (saldo > 600.00) {
            valorCredito3 = (saldo * 0.4);
            System.out.println("E O VALOR DO SEU CRÉDITO É " + valorCredito3);
        }




        sc.close();
    }

}
