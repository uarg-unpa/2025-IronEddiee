package Examenes.examen2PyC;


public class ColaEnteros {
    private final int maxcola= 5;
    private int enteros [];
    private int ultimo, frente;
    

    public ColaEnteros(){
        frente= 0;
        ultimo= -1;
        enteros= new int [maxcola];
    }

    public boolean estaVacio(){
        return ultimo== -1; 
    }

    public boolean estaLleno(){
        return ultimo == (maxcola -1);
    }

    public void insertar(int nuevo){
		ultimo++;
        enteros[ultimo]= nuevo;
        
    }

    public 	int sacar(){
        int aux = enteros[frente];

        for (int i= 0; i < ultimo; i ++){
            enteros[i] = enteros[i +1];
        }
        ultimo --;
        return aux;
    }

    public boolean masElementos(ColaEnteros q2){
        ColaEnteros aux1= new ColaEnteros();
        ColaEnteros aux2= new ColaEnteros();
        int contador1= 0;
        int contador2= 0;

        //Sacamos los elementos de la cola, la agregamos en la cola aux1, y sumamos el contador por cada elemento.
        while (!estaVacio()) {
            aux1.insertar(sacar());
            contador1 ++;
        }

        //Sacamos los elementos de la cola q2, la agregamos en la cola aux2, y sumamos el contador por cada elemento.
        while (!q2.estaVacio()) {
            aux2.insertar(q2.sacar());
            contador2 ++;
        }

        //ingresamos lo elementos a las colas para que queden como estaban originalmente
        while (!aux1.estaVacio()) {
            insertar(aux1.sacar());
        }
        while (!aux2.estaVacio()) {
            q2.insertar(aux2.sacar());
        }

        //rerotnamos verdadero, si la cola tiene mas elementos que la cola q2
        return contador1 > contador2;
    }
}
