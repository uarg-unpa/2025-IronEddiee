package TrabajosPracticos.tp3.punto7;

/*7. Agregar a la clase Pila un método que retorne una copia exacta de una pila. Nota: no olvidar que si bien la
pila se implementa como un arreglo, no debería manejarse como tal.
 */

public class Pila {
    private char [] letras;
    private int cima;
    private int cantMax;

    public Pila(int cantidad){
        this.cantMax= cantidad;
        this.cima= -1;
        this.letras= new char[cantMax];
    }

    public boolean estaVacia(){
        return this.cima== -1;
    }
    public boolean estaLlena(){
        return this.cima == cantMax -1;
    }

    public void meter(char nuevaLetra){
        cima ++;
        letras [cima]= nuevaLetra;
    }
    public char sacar(){
        char aux= letras [cima];
        this.cima--;
        return aux;
    }

    
}
