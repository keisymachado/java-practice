import java.util.Scanner;

public class exercie2 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.println("como te llamas bro");
        String nombre = scanner.nextLine();
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.replace(" "," ").length());
        StringBuilder sb = new StringBuilder(nombre);
        System.out.println(sb.reverse().toString());

    }
}
