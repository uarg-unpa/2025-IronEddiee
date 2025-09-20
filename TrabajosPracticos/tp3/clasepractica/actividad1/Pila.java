package TrabajosPracticos.tp3.clasepractica.actividad1;

public class Pila {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 5; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public Pila() {
        this.elementos = new int[MAX]; // Crear el array
        this.cima= -1; // Completar: inicializar cima
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        // Completar: devolver true si cima indica que la pila está vacía
        return this.cima == -1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        // Completar: devolver true si cima está en el límite del array
        return this.cima == this.MAX - 1;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
        // Completar: incrementar cima y asignar el elemento
        this.cima ++;
        this.elementos[cima]= elem;   
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
        // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
        int aux= this.elementos[this.cima];
        this.cima --;
        return aux;
    }

}
