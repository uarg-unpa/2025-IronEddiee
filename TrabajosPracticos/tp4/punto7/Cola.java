package TrabajosPracticos.tp4.punto7;

public class Cola {
    private int [] pares;
    private int frente, ultimo, maxCola;

    public Cola (int maximo){
        this.maxCola= maximo;
        this.frente= 0;
        this.ultimo= 0;
        pares= new int [maxCola];
    }

    public boolean estaVacia(){
        return ultimo== 0; 
    }

    public boolean estaLlena(){
        return ultimo == maxCola;
    }

     public void insertar(int numero){
        pares[ultimo]= numero;
        ultimo++;
    }

    public int borrar(){
        int aux = pares[frente];

        for (int i= 0; i < ultimo; i ++){
            pares[i] = pares[i +1];
        }
        ultimo --;
        return aux;
    }

    public int peek(){
        return pares[frente];
    }
}
