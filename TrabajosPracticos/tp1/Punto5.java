package TrabajosPracticos.tp1;
import java.util.Scanner;
/*Ingresar un día de la semana y si se trata de uno de los días de la cátedra resolución escribir “HOY TENGO
RESOLUCION”. Identificando a los días de la siguiente manera: ‘L’ para Lunes, ‘M’ para Martes, ‘I’ para
Miércoles, ‘J’ para Jueves, ‘V’ para Viernes, ‘S’ para Sábado y ‘D’ para Domingo. Se puede agregar el caso
dónde la letra ingresada no sea alguna de las nombradas anteriormente. */

public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bandera= false;
        System.out.println("¿Que dia es hoy? (Coloca la Primera letra del dia en Mayuscula)");

        do{
            char dia= scanner.next().charAt(0);

            switch (dia) {
                case 'L':
                    System.out.println("No tienes clases de Resolucion");
                    bandera= true;
                    break;

                case 'M':
                    System.out.println("HOY TIENES RESOLUCION ");
                    bandera= true;
                    break;

                case 'I':
                    System.out.println("HOY TIENES RESOLUCION ");
                    bandera= true;
                    break;

                case 'J':
                    System.out.println("HOY TIENES RESOLUCION ");
                    bandera= true;
                    break;

                case 'V':
                    System.out.println("No tienes clases de Resolucion");
                    bandera= true;
                    break;

                case 'S':
                    System.out.println("No tienes clases de Resolucion");
                    bandera= true;
                    break;

                case 'D':
                    System.out.println("No tienes clases de Resolucion");
                    bandera= true;
                    break;
        
                default:
                    System.out.println("La letra ingresada no es valida, intentalo denuevo");
                    break;
            }
        }while (bandera == false);
        scanner.close();
    }
} 
