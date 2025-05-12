
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos há na sala?");
        int alunos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= alunos; i++) {
            System.out.print("Nome do " + i + "º aluno: ");
            String nomeAluno = sc.nextLine();

            System.out.println("Agora, digite a primeira nota do aluno " + i + ": ");
            double nota1 = sc.nextDouble();
            System.out.println("Agora, digite a segunda nota do aluno " + i + ": ");
            double nota2 = sc.nextDouble();
            System.out.println("Agora, digite a terceira nota do aluno " + i + ": ");
            double nota3 = sc.nextDouble();
            System.out.println("Agora, digite a quarta nota do aluno " + i + ": ");
            double nota4 = sc.nextDouble();
            sc.nextLine();

            String resultado = verificarAprovacao(nomeAluno, nota1, nota2, nota3, nota4);
            System.out.println(resultado);
        }

        sc.close();
    }

    // Método que calcula a média
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    // Método que verifica a aprovação
    public static String verificarAprovacao(String nome, double nota1, double nota2, double nota3, double nota4) {
        double media = calcularMedia(nota1, nota2, nota3, nota4);

        if (media >= 7.0) {
            return "Parabéns, " + nome + ", você foi aprovado! Média: " + media;
        } else if (media >= 4.0 && media <= 6.9) {
            return nome + ", apresente-se para a prova final. Média: " + media;
        } else {
            return nome + ", infelizmente você não atingiu a média mínima. Média: " + media;
        }
    }
}