package Examenes.examen2PyC;
import java.util.Scanner;

public class pila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creamos las pila y le agregamos elementos.
        PilaCaracter p= new PilaCaracter();

        //creamos una pila aux y una variable contador.
        PilaCaracter aux= new PilaCaracter();
        int contador= 0;

        //Ingresamos elementos
        p.insertar('a');
        p.insertar('b');
        p.insertar('c');
        p.insertar('d');
        p.insertar('e');

        //vaciamos la pila original, agregando sus elementos a la pila aux, ademas hacemos un if preguntando que si cada elemento es una vocal.
        while (!p.estaVacia()) {
            char elemento= p.sacar();
            aux.insertar(elemento);

            if(elemento == 'a' || elemento== 'e' || elemento== 'i' || elemento == '0' || elemento== 'u'){
                contador ++;
            }
        }

        //insertamos los elementos de la pila aux a la pila original para que quede como estaba
        while (!aux.estaVacia()) {
            p.insertar(aux.sacar());
        }

        //Mostramos el resultado.
        System.out.println("La pila tiene " + contador + " de vocales.");
        scanner.close();
    }
}
