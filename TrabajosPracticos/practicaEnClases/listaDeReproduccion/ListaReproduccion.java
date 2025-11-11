package TrabajosPracticos.practicaEnClases.listaDeReproduccion;

public class ListaReproduccion {
    private int frente, ultimo, maxCola;
    private Musica [] lista;

    public ListaReproduccion(int maximo){
		this.maxCola= maximo;
		this.frente= 0;
        this.ultimo= -1;
        lista= new Musica[maxCola];
    }

	public boolean estaVacio(){
        return ultimo== -1; 
    }

    public boolean estaLleno(){
        return ultimo == (maxCola -1);
    }

	public void insertar(Musica nuevo){
		ultimo++;
        lista[ultimo]= nuevo;
        
    }

	public 	Musica sacar(){
        Musica aux = lista[frente];

        for (int i= 0; i < ultimo; i ++){
            lista[i] = lista[i +1];
        }
        ultimo --;
        return aux;
    }

    public Musica peek(){
        return lista[frente];
    }

    public int contador(){
        ListaReproduccion aux= new ListaReproduccion(maxCola);
        int contador= 0;

        while(!estaVacio()){
            aux.insertar(sacar());
            contador++;
        }

        while (!aux.estaVacio()) {
            insertar(aux.sacar());
        }
        return contador;
    }

    public int cantidadDispo(){
        return (maxCola) - contador();
    }

	
}
