package TrabajosPracticos.tp4.punto5;
/*5. Agregar un método en la clase Cola que elimine los elementos repetidos de la cola */

public class Cola {
      private int [] elementos;
    private int frente, ultimo, maxCola, contador;

    public Cola(){
        this.maxCola= 5;
        this.frente= 0;
        this.ultimo= -1;
        elementos= new int [maxCola];
    }

    public boolean estaVacia(){
        return ultimo== -1; 
    }

    public boolean estaLlena(){
        return ultimo == (maxCola - 1);
    }

    public int getContador(){
        return this.contador;
    }

    public void insertar(int numero){
        ultimo++;
        elementos[ultimo]= numero;
    }

    public int borrar(){
        int aux= elementos [frente];

        for (int i=0; i < ultimo; i++){
            elementos [i]= elementos [i + 1];
        }
        ultimo--;
        return aux;
    }

    public int peek(){
        return elementos[frente];        
    }


    public int borraRepetido(int valor){
        Cola aux= new Cola();
        int contador= 0;
        while(!estaVacia()){
            int numero= borrar();
            if (numero != elementos [frente]){
                aux.insertar(numero);
            }else{
                contador ++;
            }
        }

        while (!aux.estaVacia()) {
            insertar(aux.borrar());
        }

        return contador;
    }
}
