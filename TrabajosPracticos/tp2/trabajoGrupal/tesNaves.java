package TrabajosPracticos.tp2.trabajoGrupal;
import java.util.Scanner;

public class tesNaves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Detalle la nave: \nNombre \nCantidad de combustible \nVelocidad Maxima \nAceleracion \n");
        String name= scanner.nextLine();
        int combustible= scanner.nextInt();
        int velocidad= scanner.nextInt();
        int aceleracion= scanner.nextInt();

        Nave nave1= new Nave(name, combustible, velocidad, aceleracion);

        scanner.close();
    }
}
