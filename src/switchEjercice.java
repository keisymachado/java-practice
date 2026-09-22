import java.util.Scanner;

public class switchEjercice {

    public static void main(String[] arg){

        Scanner keisy = new Scanner(System.in);
        System.out.println("cuanto quieres a tu novia");
        System.out.println("selecciona un numero");
        int numero =  keisy.nextInt();

        switch (numero) {
            case 1 -> System.out.println("nada");
            case 2 -> System.out.println("maso ");
            case 3 -> System.out.println("mej");
            case 4 -> System.out.println("muchisimo");
            case 5 -> System.out.println("lo mas que se pueda ");
            default -> System.out.println( " escribe bien vale ");
        }












    }
}
