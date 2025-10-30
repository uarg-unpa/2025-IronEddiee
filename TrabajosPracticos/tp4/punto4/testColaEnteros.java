package TrabajosPracticos.tp4.punto4;

import java.util.Scanner;

public class testColaEnteros {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos enteros ingresan?");
        int cantidad= sc.nextInt();
        ColaEnteros cola1= new ColaEnteros(cantidad);

        int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar un numero a la cola");
            System.out.println("2 Sacar el primero de la fila");
            System.out.println("3 Cuantos quedan?");
            System.out.println("0 terminar \n");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if(!cola1.estaLlena()){
                        System.out.println("ingrese el numero");
                        int numero= sc.nextInt();
                        cola1.insertar(numero);
                        System.out.println("se ingreso el numero " + numero + " a la cola.");
                    }else{
                        System.out.println("la cola esta llena.");
                    }
                    break;
                
                case 2:
                    if (!cola1.estaVacia()){
                        System.out.println("Se saco el numero " + cola1.borrar());
                    }else{
                        System.out.println("La cola ya esta vacia.");
                    }
                    break;

                case 3:
                    System.out.println("Quedan " + cola1.getContador() + " en la cola.");
                    break;

                case 0:
                    System.out.println("Terminando proceso...");
                    break;

                default:
                    System.out.println("El valor ingresado no es valido, intente nuevamente.");
                    break;
            }
        }while(opcion != 0);
        
        sc.close();
    }
}
