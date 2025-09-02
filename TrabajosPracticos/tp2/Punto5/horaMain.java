package TrabajosPracticos.tp2.Punto5;
import java.util.Scanner;

public class horaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la hora, los minutos y los segundos");
        int hora= scanner.nextInt();
        int minutos= scanner.nextInt();
        int segundos= scanner.nextInt();

        Hora primerHora= new Hora(hora, minutos, segundos);

        if(primerHora.validacion(hora, minutos, segundos) == true){
            System.out.println("El horario registrado es valido ");
            primerHora.imprimirInfo();
        }



        scanner.close();
    }
}
