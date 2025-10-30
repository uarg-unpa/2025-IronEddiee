package TrabajosPracticos.tp4.punto7;
import java.util.Scanner;

public class TestPilaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quiere ingresar?");
        int cantidad= sc.nextInt();

        Pila pilaEnteros = new Pila(cantidad);
        Pila aux= new Pila(cantidad);
        Cola colaPares= new Cola(cantidad);
        int contador= 0;

        int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar numero");
            System.out.println("2 Sacar numero");
            System.out.println("3 Mostrar tope de la pila");
            System.out.println("4 Sacar los elementos pares");
            System.out.println("0 Terminar proceso");
            opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    if (!pilaEnteros.estaLlena()){
                        System.out.println("Ingrese el numero");
                        int numero= sc.nextInt();
                        pilaEnteros.meter(numero);
                    }else{
                        System.out.println("La pila ya esta llena");
                    }
                    break;
                
                case 2:
                    if (!pilaEnteros.estaVacia()){
                        System.out.println("Se saco el numero " + pilaEnteros.sacar() + " de la pila");
                    }else{
                        System.out.println("La pila ya esta vacia");
                    }
                    break;
                
                case 3:
                    System.out.println("El tope de la pila es el numero " + pilaEnteros.elementoCima());
                    break;

                case 4:
                    while (!pilaEnteros.estaVacia()) {
                        int elemento= pilaEnteros.sacar();
                        if (elemento % 2 == 0){
                            System.out.println("El numero " + elemento + " Se agrega a la cola");
                            colaPares.insertar(elemento);
                            contador ++;
                        }else{
                            aux.meter(elemento);
                        }
                    }

                    while (!aux.estaVacia()) {
                        pilaEnteros.meter(aux.sacar());
                    }
                    System.out.println("Se ingresaron " + contador + " a la cola");
                    break;
                default:
                    System.out.println("El numero ingresado no es valido, intente nuevamente");
                    break;
            }

        }while(opcion != 0);

        sc.close();
    }
}
