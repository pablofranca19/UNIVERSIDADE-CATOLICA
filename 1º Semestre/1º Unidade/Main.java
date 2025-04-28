import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;
        System.out.print("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", que horas são agora? (Expresse em horas, minutos e segundos)");
        System.out.print("Hora: ");
        hora = sc.nextInt();
        System.out.print("Minuto: ");
        minuto = sc.nextInt();
        System.out.print("Segundo: ");
        segundo = sc.nextInt();
        System.out.print("Já se passaram " + (hora*3600 + minuto*60 + segundo) + " segundos do seu dia");

        sc.close();

        }
    }
