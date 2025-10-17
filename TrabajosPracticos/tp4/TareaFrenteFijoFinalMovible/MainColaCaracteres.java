package TrabajosPracticos.tp4.TareaFrenteFijoFinalMovible;
import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ColaCaracter cola1= new ColaCaracter();
        
        int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar una letra a la cola");
            System.out.println("2 Sacar el primero de la fila");
            System.out.println("3 Peek");
            System.out.println("0 terminar \n");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if(! cola1.estaLlena()){
                        System.out.println("Ingrese la letra");
                        char letra= sc.next().charAt(0);
                        cola1.insertar(letra);
                    }else{
                        System.out.println("La cola esta LLena");
                    }
                    break;
                
                case 2:
                    if (!cola1.estaVacia()){
                        
                        System.out.println("Se fue la letra " + cola1.borrar());
                    }else{
                        System.out.println("La cola ya esta vacia");

                    }
                    break;
                
                case 3: 
                    if(!cola1.estaVacia()){
                        System.out.println("El primero en la fila es " + cola1.peek());
                    }else{
                        System.out.println("La cola de caracteres esta vacia");
                    }
                    break;
                
                case 0:
                    System.out.println("Terminando proceso...");
                    break;
                
                default:
                    System.out.println("Valor ingresado invalido, intente nuevamente");
                    break;
            }
        }while(opcion != 0);


        sc.close();
    }
}
