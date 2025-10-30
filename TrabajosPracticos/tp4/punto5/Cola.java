package TrabajosPracticos.tp4.punto5;
/*5. Agregar un método en la clase Cola que elimine los elementos repetidos de la cola */

public class Cola {
      private int [] elementos;
    private int frente, ultimo, maxCola, contador;

    public Cola(){
        this.maxCola= 5;
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

    public int peek(){
        return elementos[frente];        
    }

    public void repetidos(){
        Cola aux= new Cola();
        int [] datos= new int [maxCola];
        int indice= 0;

        while (!estaVacia()) {
            int numero= borrar();
            aux.insertar(numero);
            datos [indice]= numero;
            indice ++;
        }

        while (!aux.estaVacia()) {
            for (int i= 0; i < maxCola; i++){
                if(aux.peek() != datos [i] ){
                    insertar(aux.borrar());
                }
            }
        }
    }
}
