package TrabajosPracticos.tp2.trabajoGrupal;
import java.util.Scanner;

public class tesNaves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Nave nave1= new Nave("Julio", 500, 10, 1000);

        System.out.println("A donde quiere viajar la nave");
        String destino= scanner.nextLine();
        System.out.println("Cuantos kilometros son?");
        double km= scanner.nextDouble();

        double gasto = nave1.calculoCombustible(km);
        if (nave1.esMayor(km) == true){
            nave1.setCombustible(gasto);
            System.out.println(nave1.getcombustible());
            System.out.println("la nave puede llegar a su destino");

        }else{
            System.out.println("la nave no llega a destino");
        }
       
        System.out.println("Informe\n " + "Lugar: " + destino + " Distancia: " + km + "Km" + nave1);


        System.out.println(nave1);
        scanner.close();
    }
}
