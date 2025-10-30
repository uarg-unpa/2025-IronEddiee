package TrabajosPracticos.tp4.punto4;

/*4. En base a la implementación Frente y Final movible, escribir un método contar que devuelva la
cantidad de elementos en la cola. Nota: no olvidar que, si bien la cola se implementa como un arreglo,
no debería manejarse como tal. */

public class ColaEnteros {
    private int [] elementos;
    private int frente, ultimo, maxCola, contador;

    public ColaEnteros(int maximo){
        this.maxCola= maximo;
        this.frente= 0;
        this.ultimo= 0;
        this.contador= 0;
        elementos= new int [maxCola];
    }

    public boolean estaVacia(){
        return ultimo== 0; 
    }

    public boolean estaLlena(){
        return ultimo == maxCola;
    }

    public int getContador(){
        return this.contador;
    }

    public void insertar(int numero){
        elementos[ultimo]= numero;
        contador++;
        ultimo++;
    }

    public int borrar(){
        int aux= elementos [frente];

        for (int i=0; i < ultimo; i++){
            elementos [i]= elementos [i + 1];
        }
        ultimo--;
        contador --;
        return aux;
    }
}
