package TrabajosPracticos.tp4.TareaFrenteFinalMovible;

public class ColaNombres {
    private final int maxcola= 5;
    private int frente, ultimo;
    private String [] elementos;

    public ColaNombres(){
        frente=0;
        ultimo=0;
        elementos=new String [maxcola];
    }

    public boolean estaVacio(){
        return ultimo== 0;
    }
    public boolean estalleno(){
        int sigultimo = siguiente(ultimo);
        return sigultimo == frente;
    }

    private int siguiente(int indice){
        if (indice == maxcola -1){
            return 0;
        }else{
            return indice++;
        }
    }

    public void insertar(String nombre){
        ultimo= siguiente(ultimo);
        elementos [ultimo]= nombre;
    }

    public String borrar (){
        frente= siguiente(frente);
        return elementos[frente];
    }

    public String peek(){
        return elementos[frente];
    }

}
