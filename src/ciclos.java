import java.util.Scanner;

public class ciclos {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("selecciona un numero");
        int numero = scanner.nextInt();

        switch (numero){
            case 1 -> System.out.println("ingreso de notas");
            case 2 -> System.out.println("ver promedio ");
            case 3 -> System.out.println("salir");


        }

        double suma = 0;

        for (int i = 1; i<= 5; i++){
            System.out.println("ingresa la nota " + i + ":");
            double nota = scanner.nextDouble();
            suma = suma + nota;

        }




    }
}
