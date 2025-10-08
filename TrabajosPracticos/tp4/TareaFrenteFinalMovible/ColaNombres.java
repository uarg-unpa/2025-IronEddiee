package TrabajosPracticos.tp4.TareaFrenteFinalMovible;

public class ColaNombres {
    private final int maxcola= 5;
    private int frente, ultimo;
    private String [] elementos;

    public ColaNombres()
    {
    frente=0;
    ultimo=0;
    elementos=new String [maxcola];
    }


    public boolean estaVacia(){
        return ultimo== 0;
    }
    

    public boolean estaLlena(){
        return ultimo== maxcola;
    }

    public void insertar(String nombre){
        elementos[ultimo] = nombre;
        ultimo ++;
    }

    public String borrar(){
        String aux = elementos[frente];

        for (int i= 0; i < ultimo; i ++){
            elementos[i] = elementos[i +1];
        }
        ultimo --;
        return aux;
    }

    public String peek(){
        return elementos[frente];        
    }
}
