import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int lado1, lado2, lado3;

            System.out.println("Qual o comprimento do primeiro lado?");
            lado1 = sc.nextInt();
            System.out.println("Qual o comprimento do segundo lado?");
            lado2 = sc.nextInt();
            System.out.println("Qual o comprimento do terceiro lado?");
            lado3 = sc.nextInt();

            String classificação = verificarTriângulo(lado1, lado2, lado3);
            System.out.println(classificação);
            String resultado = TrueFalse(resultado);
            System.out.println(resultado);

            sc.close();

        }

    public static String verificarTriângulo(int lado1, int lado2, int lado3) {

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.println("Não é um triângulo.");
        } else {

            if (lado1 == lado2 && lado2 == lado3) {
                return "Triângulo equilátero.";
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                return "Triângulo escaleno.";
            } else {
                return "Triângulo isósceles.";
            }

        }

        return "";
    }

    public static String TrueFalse(boolean resultado){

        (if verificarTriângulo(int lado1, int lado2, int lado3) == true) {
            return "Verdadeiro";
        } else {
            return "Falso";
        }
    }
}
