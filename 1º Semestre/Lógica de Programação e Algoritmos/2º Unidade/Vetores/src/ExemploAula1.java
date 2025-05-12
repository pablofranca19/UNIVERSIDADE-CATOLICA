import java.util.Scanner;

public class ExemploAula1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variável inicializada que guarda o salário total.
        double totalSalario = 0;

        //Vetor que armazena salários

        double salarios [] = new double [10];

        // Propriedade ".length" que mostra o tamanho em quantidade do array (vetor).

        System.out.println("Tamanho da lista = " + salarios.length);

        System.out.println("Digite o salario dos funcionarios:");

        //Est. de repetição de salários

        for (int i = 0; i < 10; i++) {
            salarios[i] = sc.nextDouble();
        }

        // Soma dos salários repetidos em um dado comprimento "salarios".

        for (int j = 0; j < salarios.length ; j++) {
            totalSalario += salarios[j];
        }

        System.out.println("O salario total dos 10 funcionarios é " + totalSalario);

        sc.close();

    }

}