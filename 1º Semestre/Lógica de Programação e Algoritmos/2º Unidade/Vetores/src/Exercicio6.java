import javax.print.attribute.standard.Media;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio6 {

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
        System.out.println(AcimaMédia(Media));

    }
    public static float MédiaTurma (int[] a) {
        float Média = 0;
        for (int i = 0; i < a.length; i++) {

            Média += a[i];
        }
        Média = Média / a.length;

        System.out.println("A média da turma foi: ");
        return Média;

    }

    public static int AcimaMédia (int[] a) {

    int QuantAprovados = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] > 7.0) {
                a[j] = QuantAprovados++;
            }
        }

        System.out.println("A quantidade de alunos que ficaram acima da média foi(ram): ");
      return QuantAprovados;
    }


}
