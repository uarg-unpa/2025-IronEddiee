package TrabajosPracticos.tp3.punto5;

/*5. Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota:
no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal. */

public class Pila {
    private int [] numeros;
    private int cima;
    private int cantMaxima;


    public Pila(int cantidad){
        this.cantMaxima= cantidad;
        this.cima= -1;
        this.numeros= new int [cantMaxima];
    }

    public boolean estaVacia(){
        return this.cima== -1;
    }
    public boolean estaLlena(){
        return this.cima== this.cantMaxima -1;
    }

    public void meter( int numero){
        this.cima ++;
        this.numeros[cima]=  numero;
    }

    public int sacar(){
        int aux= numeros[cima];
        cima --;
        return aux;
    }

    public int elementoCima(){
        return numeros[cima];
    }
}
