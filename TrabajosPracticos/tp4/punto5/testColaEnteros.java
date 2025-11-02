package TrabajosPracticos.tp4.punto5;
import java.util.Scanner;

public class testColaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cola enteros= new Cola();
            System.out.println("En esta cola de enteros solo se pueden ingresar 5 numeros");

        int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar numero");
            System.out.println("2 Sacar numero");
            System.out.println("3 Mostrar tope de la pila");
            System.out.println("4 Eliminar un numero que se repita");
            System.out.println("0 Terminar proceso");
            opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    if(!enteros.estaLlena()){
                        System.out.println("Ingrese el numero");
                        int num= sc.nextInt();
                        enteros.insertar(num);
                        System.out.println("Se Ingreso el numero " + num + " a la cola");
                    }else{
                        System.out.println("La cola ya esta llena, debe sacar un numero primero");
                    }
                    break;

                case 2:
                    if (!enteros.estaVacia()){
                        System.out.println("El numero " + enteros.borrar() + " se saco de la cola");
                    }else{
                        System.out.println("La cola ya esta vacia");
                    }
                    break;

                case 3:
                    if (!enteros.estaVacia()){
                        System.out.println("el numero " + enteros.peek() + " es el primero en la cola");
                    }else{
                        System.out.println("La cola esta vacia");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el numero que no quiere que se repita");
                    int repetido= sc.nextInt();
                    int contador= enteros.borraRepetido(repetido);
                    System.out.println("El numero " + repetido + " estaba repetido " + contador + " veces en la cola");
                    break;

                case 0:
                    System.out.println("Terminando proceso...");
                    break;

                default:
                    System.out.println("El numero ingresado no es valido, intente nuevamente");
                    break;
            }

        }while(opcion != 0);


        sc.close();
    }
}
