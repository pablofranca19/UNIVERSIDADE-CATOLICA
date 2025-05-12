import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();

        String resultadoVoto = verificarVoto(idade);
        System.out.println(resultadoVoto);

        sc.close();
    }

    // Método que exibe a idade (se necessário)
    public static void exibirIdade(int idade) {
        System.out.println("Idade informada: " + idade);
    }

    // Método que verifica a situação de voto
    public static String verificarVoto(int idade) {
        exibirIdade(idade); // Chamada opcional para exibir a idade

        if (idade <= 15) {
            return "Sem permissão para votar";
        } else if ((idade >= 16 && idade <= 17) || idade >= 65) {
            return "Voto facultativo.";
        } else if (idade >= 18 && idade <= 64) {
            return "Voto obrigatório.";
        } else {
            return "Situação de voto não definida.";
        }
    }
}