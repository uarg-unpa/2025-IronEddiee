package TrabajosPracticos.tp2.puntoo6;
import java.util.Scanner;

public class tesFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fecha fecha1 = new Fecha(26, 1, 2025);

        System.out.println(fecha1.devolverFecha());
      
        System.out.println("Cambie el mes");
        int mes= scanner.nextInt();

        System.out.println("Cambie el dia");
        int dia= scanner.nextInt();

        System.out.println("Cambie el año");
        int año= scanner.nextInt();
        
        fecha1.setAño(año);
        fecha1.setDia(dia);
        fecha1.setMes(mes);

        fecha1.meses(mes);

        //Punto 7
        System.out.println("ingrese una nueva fecha");

        System.out.println("dia");
        dia= scanner.nextInt();
        
        System.out.println("mes");
        mes= scanner.nextInt();

        System.out.println("año");
        año= scanner.nextInt();

        Fecha fecha2= new Fecha(mes, dia, año);
        fecha2.meses(mes);

        if (fecha1.fechaMayor(fecha1.getAño(), fecha2.getAño())){
            System.out.println("La fecha mator es: " + fecha1.devolverFecha());
        }else{
            System.out.println("La fecha mayor es: " + fecha2.devolverFecha());
        }

    scanner.close();

    }
}
