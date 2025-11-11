package Examenes.examen2PyC;

public class PilaCaracter {
    private char [] caracteres;
    private int cima;
    private final int maxPila= 5;

    public PilaCaracter(){
        caracteres= new char[maxPila];
        cima= -1;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return this.cima == -1;
    }

    public boolean estaLlena() {
        return this.cima == this.maxPila - 1;
    }

    public void insertar(char letra) {
        this.cima ++;
        this.caracteres[cima]= letra;   
    }

     public char sacar() {
        char aux= this.caracteres[this.cima];
        this.cima --;
        return aux;
    }

    public int contChar(){
        PilaCaracter aux= new PilaCaracter();
        int contador= 0;

        //contamos los elementos de la pila
        while (!this.estaVacia()) {
            aux.insertar(sacar());
            contador ++;
        }

        //agregamos los elementos a la pila para que quede como estaba
        while (!aux.estaVacia()) {
            insertar(aux.sacar());
        }

        return contador;
    }
}
