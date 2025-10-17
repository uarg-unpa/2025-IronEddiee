package TrabajosPracticos.practicaEnClases.actividad1;

public class ColaString {
    private String [] elementos;
    private int frente, ultimo, maxCola;


    public ColaString (int maximo){
        this.maxCola= maximo;
        this.frente= 0;
        this.ultimo= 0;
        elementos = new String [maxCola];
    }

    public boolean estaVacia(){
        return ultimo== 0;
    }

    public boolean estaLlena(){
        return ultimo == maxCola;
    }

    public void insertar(String palabra){
        elementos [ultimo]= palabra;
        ultimo ++;
    }

    public String sacar(){
        String aux= elementos[frente];

        for(int cont= 0; cont < ultimo; cont ++){
            elementos [cont]= elementos[cont + 1];
        }
        ultimo --;
        return aux;
    }

    public String mostrar(){
        String [] aux= new String [maxCola];

        while (!estaVacia()) {
            String elemento= sacar();
            return elemento;
        }
    }
}
