package TrabajosPracticos.tp4.Punto6;

/*6. Escribir un método en la clase cola que tenga como argumento una cola del mismo tipo y
devuelva verdadero o falso si las dos colas son o no idénticas (tienen el mismo tamaño y poseen los
mismos elementos), respectivamente. Nota: no olvidar que, si bien la cola se implementa como un
arreglo, no debería manejarse como tal */

public class ColaEnteros {
    private int [] elementos;
    private int frente, ultimo, maxCola;


    public ColaEnteros(){
        this.maxCola= 5;
        this.frente= 0;
        this.ultimo= 0;
        elementos= new int [maxCola];
    }

    public int getMaxCola(){
        return this.maxCola;
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
        int aux = elementos[frente];

        for (int i= 0; i < ultimo; i ++){
            elementos[i] = elementos[i +1];
        }
        ultimo --;
        return aux;
    }

     public int peek(){
        return elementos[frente];
    }

    public boolean sonRepetidos(ColaEnteros r){
        ColaEnteros aux= new ColaEnteros();
        int [] datos= new int [maxCola];
        int indice= 0;
        if(getMaxCola() == r.getMaxCola()){
            
            while (!estaVacia()){
                int numero = borrar();
                if (numero == r.borrar()){
                    
                }
            }
        }
        return false;

        
    }
}
