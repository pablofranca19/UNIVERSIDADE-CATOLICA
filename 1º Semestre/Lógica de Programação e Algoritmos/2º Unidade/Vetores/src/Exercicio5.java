import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {



        Scanner read = new Scanner(System.in);

        System.out.println("Quantos alunos tem a turma? ");
        int QuantAlunos = read.nextInt();
        int Media[] = new int[QuantAlunos];

        System.out.println("Agora, informe a média final desses alunos: ");

        for (int i = 0; i < Media.length; i++) {
            Media[i] = read.nextInt();
        }

        read.close();

        System.out.println(MédiaTurma(Media));


    }
    public static float MédiaTurma (int[] a) {
        float Média = 0;
        for (int i = 0; i < a.length; i++) {

            Média += a[i];
        }
        Média = Média / a.length;

        System.out.println("A média dos alunos é: ");

        return Média;
    }

}
