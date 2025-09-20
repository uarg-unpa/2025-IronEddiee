package TrabajosPracticos.tp3.clasepractica.actividadTeatro;
import java.util.Scanner;


public class testTeatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Teatro teatroCentro= new Teatro("Teatro Municipal", "AV. San Martin 123");
        

        int opcion;

        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Agregar Obra");
            System.out.println("2 Sacar Obra");
            System.out.println("3 Informacion");
            System.out.println("0 Salir ");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if(teatroCentro.estaLlena()){
                        System.out.println("Ya hay 3 funciones asignadas");
                    }else{
                        System.out.println("Ingrese su nombre");
                        String nombre= sc.nextLine();

                        System.out.println("Que precio tiene");
                        int precio= sc.nextInt();

                        System.out.println("Cuanto dura (en minutos)?");
                        int duracion= sc.nextInt();

                        Obra nuevaObra= new Obra(nombre, precio, duracion);
                        teatroCentro.agregar(nuevaObra);
                    }
                    break;
                
                case 2:
                    if(teatroCentro.estaVacia()){
                        System.out.println("Ya no hay funciones asignadas");
                    }else{
                        Obra sacar= teatroCentro.sacar();
                        System.out.println("Se saco la Obra: " + sacar);
                    }
                    break;
                
                case 3:
                    System.out.println(teatroCentro + "\n--Funciones--" + teatroCentro.mostrarObras());
                    break;

                case 0:
                    System.out.println("Cerrando el menu");
                default:
                    break;
            }




        }while(opcion != 0);


        sc.close();
    }   
}
