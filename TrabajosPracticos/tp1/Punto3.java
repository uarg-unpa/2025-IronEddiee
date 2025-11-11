package TrabajosPracticos.tp1;
import java.util.Scanner;

/*Se tienen 3 variables A, B y C enteras. Escribir un algoritmo que intercambie entre si sus valores, para que
queden finalmente de la siguiente forma:
- B y C toman el valor de A.
- A toma el valor original de C
Ejemplo:
Si A tiene el valor 1, B tiene el valor 2, y C tiene el valor 3, entonces debería quedar B con 1, C con
1 y A con 3.
Nota: sólo se debe utilizar una variable auxiliar como ayuda */

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
        scanner.close();
    }
}