package TrabajosPracticos.tp3.punto5;
import java.util.Scanner;

public class testPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quiere ingresar?");
        int cantidad= sc.nextInt();
        Pila pilaDeNumeros= new Pila(cantidad);
        int opcion;
        do{
            System.out.println("***MENU***");
            System.out.println("1 Ingresar numero");
            System.out.println("2 Sacar numero");
            System.out.println("3 Mostrar tope de la pila");
            System.out.println("0 Terminar proceso");
            opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    if (pilaDeNumeros.estaLlena()){
                        System.out.println("Esta llena, no se pueden agregar mas");
                    }else{
                        System.out.println("Ingrese el numero");
                        int nuevoNumero= sc.nextInt();
                        pilaDeNumeros.meter(nuevoNumero);
                    }
                    break;
                case 2:
                    if (pilaDeNumeros.estaVacia()){
                        System.out.println("Ya esta vacia la pila");
                    }else{
                        pilaDeNumeros.sacar();
                    }
                    break;
                case 3:
                    System.out.println(pilaDeNumeros.elementoCima());
                    break;
                case 0:
                    System.out.println("Terminando proceso...");
                    break;
                default:
                    System.out.println("valor invalido, intente nuevamente");
                    break;
            }

        }while(opcion != 0);


        sc.close();
        
    }
}
