package TrabajosPracticos.practicaEnClases.controlDeNiveles;

public class PilaEnteros {
    private int [] enteros;
    private int cima;
    private int max= 5;
    private int nivelactual;

    public PilaEnteros(){
        this.enteros= new int [max];
        this.cima= -1;
        this.nivelactual= 0;
    }

    public boolean estaVacia(){
        return this.cima == -1;
    }

    public boolean estaLlena(){
        return this.cima == this.max - 1;
    }

    public void meter(int numero){
        this.cima ++;
        nivelactual ++;
        this.enteros [this.cima] = numero;
    }

    public int sacar (){
        int aux= this.enteros [this.cima];
        nivelactual --;
        this.cima --;
        return aux;
    }

    public int sacarValor(int valor){
        PilaEnteros pilaAuxiar= new PilaEnteros();
        int eliminado = 0;
        while (!estaVacia()) {
            int elemento= sacar();

            if (elemento == valor){
                eliminado = elemento;
            }

            pilaAuxiar.meter(elemento);
        }

         while (!pilaAuxiar.estaVacia()) {
            meter(pilaAuxiar.sacar());
        }

        return eliminado;
    }

    public int getNivelActual(){
        return this.nivelactual;
    }

    public int nivelesDisponibles(){
        return max - nivelactual;
    }

    public void agregarNivel(int valor){
        this.max = this.max + valor;
    }

    public int cantOcurrencias(int numero){
        PilaEnteros pilaAux= new PilaEnteros(); 
        int contador= 0;
        while (!estaVacia()) {
            int repetido = sacar();
           
            if (repetido == numero){
                contador ++;
            }

            pilaAux.meter(numero);
        }

        while (!pilaAux.estaVacia()) {
            meter(pilaAux.sacar());
        }

        return contador;
    }
}
