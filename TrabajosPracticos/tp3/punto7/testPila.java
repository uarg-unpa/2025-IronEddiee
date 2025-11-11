package TrabajosPracticos.tp3.punto7;
import java.util.Scanner;

public class testPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas letras quiere ingresar en la pila?");
        char cantidadLetras= sc.next().charAt(0);

        Pila pila1= new Pila(cantidadLetras);
        Pila aux= new Pila(cantidadLetras);

        int opcion;

        do{
            System.out.println("***MENU***");
            System.out.println("1 Ingresar letras");
            System.out.println("2 Sacar letras");
            System.out.println("3 Mostrar la pila y su copia");
            System.out.println("0 Terminar proceso");
            opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    if (! pila1.estaLlena()){
                        System.out.println("Ingrese la letra");
                        char letra= sc.next().charAt(0);
                        pila1.meter(letra);
                    }else{
                        System.out.println("La pila ya esta llena");
                    }
                    break;

                case 2:
                    if(! pila1.estaVacia()){
                        char x= pila1.sacar();
                        System.out.println("Se salco la letra " + x);
                    }else{
                        System.out.println("La pila ya esta vacia");
                    }
                    break;

                case 3:
                    
                default:
                    break;
            }

        }while(opcion != 0);


        sc.close();
    }
}
