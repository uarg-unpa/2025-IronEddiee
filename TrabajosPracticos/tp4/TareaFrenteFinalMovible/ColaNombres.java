package TrabajosPracticos.tp4.TareaFrenteFinalMovible;

public class ColaNombres {
    private final int maxcola= 5;
    private int frente, ultimo, contador;
    private String [] elementos;

    public ColaNombres(){
        frente=0;
        ultimo=0;
        contador= 0;
        elementos=new String [maxcola];
    }

    public boolean estaVacio(){
        return frente == ultimo;
    }
    public boolean estalleno(){
        return (ultimo + 1) % maxcola == frente;
    }

    public void insertar(String nombre){
        ultimo= (ultimo + 1) % maxcola;
        elementos [ultimo]= nombre; 
        contador ++;
    }

    public String borrar (){
       frente = (frente + 1) % maxcola;
       contador --;
       return elementos [frente];
       
    }

    public String peek(){
        return elementos[(frente + 1) % maxcola] + " Cantidad de nombres: " + this.contador ;
    }

}
