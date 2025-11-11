package TrabajosPracticos.tp2part2.punto2;
import java.util.Scanner;

public class testEstacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        Estacion estacion1= new Estacion("San Cristoval", "Zapiola 123", 1000, 30);
        boolean cond= true;
        

        //MENU
        do{
            System.out.println("***MENU***\n1: Ingresar vehiculo\n2: Suministrar estacion de servicio\n3: Informacion\n4: Cerrar estacion de servicio \n");
            int opcion= scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    if(estacion1.getLitros() > 0 ){
                        System.out.println("Cuanto tiene que cargar?");
                        double cantidad= scanner.nextDouble();
                        estacion1.cargarVehiculo(cantidad);
                    }
                    break;
                case 2:
                    System.out.println("Cuanto va a suministrar la estacion de servicio?");
                    double niveldelitros= scanner.nextDouble();
                    if (estacion1.cargaEstacion(niveldelitros)){
                        System.out.println("Niveles de combustibe de la estacion: " + estacion1.getLitros() + " / 1000");
                    }else{
                        System.out.println("capacidad maxima 1000 / " + estacion1.getLitros());
                    }
                    break;
                case 3:
                    System.out.println(estacion1);
                    break;
                case 4:
                    System.out.println("Se cierra la estacion de servisio");
                    cond= false;
                default:
                    break;
            }
            if (estacion1.controlDeLitros()){
                System.out.println("Nivel bajo de combustible en la estacion: " + estacion1.getLitros() + " Litros");
            }
        }while(cond == true);
        scanner.close();
    }
    
}
