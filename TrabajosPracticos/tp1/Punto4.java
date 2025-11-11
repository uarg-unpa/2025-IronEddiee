package TrabajosPracticos.tp1;
import java.util.Scanner;

/* Dado tres números, escribir el mayor de ellos. Asumir que los tres números son distintos */

public class Punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros enteros");
        int nro1= scanner.nextInt();
        int nro2= scanner.nextInt();
        int nro3= scanner.nextInt();

        if (nro1 > nro2 & nro1 > nro3) {
            System.out.println("El mayor es: " + nro1);
        }else{
            if (nro2 > nro1 & nro2 > nro3) {
                System.out.println("El mayor es: " + nro2);
            }else{
                System.out.println("El mayor es: " + nro3);
            }
        }
        scanner.close();
    }
}
