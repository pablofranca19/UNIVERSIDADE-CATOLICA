import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá nadador, por favor informe a sua idade:");
        int idade = sc.nextInt();



        String resultado = verificarIdade(idade);
        System.out.println(resultado);


        sc.close();
    }

public static String verificarIdade(int idade){

        if (idade < 5) {
            return "Idade fora do escopo mínimo.";
        } else if (idade >= 5 && idade <=7) {
            return "Categoria: Infantil A";
        } else if (idade >= 8 && idade <=10) {
            return "Categoria: Infantil B";
        } else if (idade >= 11 && idade <=13) {
            return "Categoria: Juvenil A";
        } else if (idade >= 14 && idade <=17) {
            return "Categoria: Juvenil B";
        } else {
            return "Categoria: Sênior";
        }

    }
}