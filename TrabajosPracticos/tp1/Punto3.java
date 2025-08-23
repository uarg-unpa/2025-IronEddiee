package TrabajosPracticos.tp1;
import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de la Variable A");
        int a= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el numero de la variable B");
        int b= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el numero de la variable C");
        int c= scanner.nextInt();
        int cambio= c;
        scanner.nextLine();
        b= a;
        c= a;
         a= cambio;

        System.out.println("Ahora la variable A es: " + a);
        System.out.println("Ahora la variable B es: " + b);
        System.out.println("Ahora la variable c es: " + c);

    }
}