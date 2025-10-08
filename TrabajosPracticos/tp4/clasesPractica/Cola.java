package TrabajosPracticos.tp4.clasesPractica;

public class Cola {
    private final int maxcola=5;
    private int frente, ultimo;
    private int []elementos;

    public Cola()
    {
    frente=0;
    ultimo=0;
    elementos=new int[maxcola];
    }


    public boolean estaVacia(){
        return ultimo== 0;
    }
    

    public boolean estaLlena(){
        return ultimo== maxcola;
    }

    public void insertar(int numero){
        elementos[ultimo] = numero;
        ultimo ++;
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

}
