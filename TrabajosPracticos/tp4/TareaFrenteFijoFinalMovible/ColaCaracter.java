package TrabajosPracticos.tp4.TareaFrenteFijoFinalMovible;

public class ColaCaracter {
    private final int maxcola= 5;
    private int frente, ultimo;
    private char []elementos;

    public ColaCaracter()
    {
    frente=0;
    ultimo=0;
    elementos=new char [maxcola];
    }


    public boolean estaVacia(){
        return ultimo== 0;
    }
    

    public boolean estaLlena(){
        return ultimo== maxcola;
    }

    public void insertar(char letra){
        elementos[ultimo] = letra;
        ultimo ++;
    }

    public char borrar(){
        char aux = elementos[frente];

        for (int i= 0; i < ultimo; i ++){
            elementos[i] = elementos[i +1];
        }
        ultimo --;
        return aux;
    }

    public char peek(){
        return elementos[frente];        
    }
}
