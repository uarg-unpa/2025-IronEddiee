package TrabajosPracticos.practicaEnClases.listaDeReproduccion;

public class ListaReproduccion {
    private final int maxcola = 2;
    private int frente, ultimo;
    private Musica [] lista;

    public ListaReproduccion(){
        this.frente= 0;
        this.ultimo= 0;
        lista= new Musica[maxcola];
    }

    public boolean estaVacio()
	{
		return (ultimo == frente);
	}
   
	public boolean estaLleno()
	{
		int sigUltimo=siguiente(ultimo);
		return (sigUltimo == frente);
	}
	
	private int siguiente(int subind)
	{
		if (subind == maxcola -1)
			return 0;
		else
			return ++subind;
	}
	
	public void insertar(Musica elem)
	{		
		ultimo =siguiente(ultimo);
		lista[ultimo]=elem;		
	}
	
	public Musica borrar()
	{
		frente =siguiente(frente);
		return lista[frente];
	}

     public Musica peek(){
        return lista[(frente + 1) % maxcola];
    }
}
