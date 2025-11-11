package TrabajosPracticos.practicaEnClases.actividad1;

import java.util.Scanner;

public class tesPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. cantidad de ocurrencias");
            System.out.println("4. Verificar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (pila.estaLlena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        pila.meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (pila.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = pila.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;

                case 3:
                    System.out.println("Que numero es?");
                    int numero= sc.nextInt();
                    System.out.println("El numero " + numero + "se repite " + pila.cantOcurrencias(numero) + " veces en la pila");    

                case 4: // Verificar estado
                    System.out.println("¿Vacía? " + pila.estaVacia() + " | ¿Llena? " + pila.estaLlena());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
 
    }
}
