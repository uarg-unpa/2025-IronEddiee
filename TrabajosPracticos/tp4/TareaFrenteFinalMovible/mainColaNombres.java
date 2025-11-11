package TrabajosPracticos.tp4.TareaFrenteFinalMovible;
import java.util.Scanner;

public class mainColaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ColaNombres nombres= new ColaNombres();
        int opcion;

        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar un nombre");
            System.out.println("2 Sacar al primero de la fila");
            System.out.println("3 Peek");
            System.out.println("0 terminar \n");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if(! nombres.estalleno()){
                        System.out.println("Ingrese el nombre");
                        String letra= sc.nextLine();
                        nombres.insertar(letra);
                    }else{
                        System.out.println("La cola esta LLena");
                    }
                    break;
                
                case 2:
                    if (!nombres.estaVacio()){
                        
                        System.out.println("Se fue el nombre " + nombres.borrar());
                    }else{
                        System.out.println("La cola ya esta vacia");

                    }
                    break;
                
                case 3: 
                    if(!nombres.estaVacio()){
                        System.out.println("El primero en la fila es " + nombres.peek());
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
