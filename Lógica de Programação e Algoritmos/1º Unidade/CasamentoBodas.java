import java.util.Scanner;

public class CasamentoBodas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.print("Quantos anos de casados tem o casal? ");
        ano = sc.nextInt();

        if (ano == 1){
            System.out.println("O casal está nas Bodas de Papel");
        } else if (ano == 10){
            System.out.println("O casal está nas Bodas de Estanho");
        } else if (ano == 20){
            System.out.println("O casal está nas Bodas de Porcelana");
        } else if (ano == 30){
            System.out.println("O casal está nas Bodas de Pérola");
        } else if (ano == 40){
            System.out.println("O casal está nas Bodas de Esmeralda");
        } else if (ano == 50){
            System.out.println("O casal está nas Bodas de Ouro");
        } else {
            System.out.println("Não sei informar em qual boda o casal está.");
        }


        sc.close();
    }

}


