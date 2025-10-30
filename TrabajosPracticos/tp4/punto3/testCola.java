package TrabajosPracticos.tp4.punto3;
import java.util.Scanner;

public class testCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos enteros ingresan?");
        int cantidad= sc.nextInt();
        Cola colaEnteros= new Cola(cantidad);

        int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar un numero a la cola");
            System.out.println("2 Sacar el primero de la fila");
            System.out.println("0 terminar \n");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if(!colaEnteros.estaLlena()){
                        System.out.println("ingrese el numero");
                        int numero= sc.nextInt();
                        colaEnteros.insertar(numero);
                        System.out.println("se ingreso el numero " + numero + " a la cola.");
                    }else{
                        System.out.println("la cola esta llena.");
                    }
                    break;
                
                case 2:
                    if (!colaEnteros.estaVacia()){
                        System.out.println("Se saco el numero " + colaEnteros.borrar());
                    }else{
                        System.out.println("La cola ya esta vacia.");
                    }
                    break;

                case 0:
                    System.out.println("Terminando proceso...");
                    break;

                default:
                    System.out.println("El valor ingresado no es valido, intente nuevamente.");
                    break;
            }
        }while(opcion != 0);
        
        sc.close();;
    }
}
