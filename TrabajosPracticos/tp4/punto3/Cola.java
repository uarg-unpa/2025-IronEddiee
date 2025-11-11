package TrabajosPracticos.tp4.punto3;

/*3. Escriba la clase Cola cuya declaración de atributos y métodos correspondan a la implementación
Frente Fijo y Final Movible (tener en cuenta que al borrar debe correr todos los elementos). */

public class Cola {
    private int [] elementos;
    private int frente, ultimo, maxCola;

    public Cola(int maximo){
        this.maxCola= maximo;
        this.frente= 0;
        this.ultimo= 0;
        elementos= new int [maxCola];
    }

    public boolean estaVacia(){
        return ultimo== 0; 
    }

    public boolean estaLlena(){
        return ultimo == maxCola;
    }

    public void insertar(int numero){
        elementos[ultimo]= numero;
        ultimo++;
    }

    public int borrar(){
        int aux= elementos [frente];

        for (int i=0; i < ultimo; i++){
            elementos [i]= elementos [i + 1];
        }
        ultimo--;
        return aux;
    }
}
