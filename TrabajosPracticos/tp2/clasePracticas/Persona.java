package TrabajosPracticos.tp2.clasePracticas;
//clase practica 28/08/2025


public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private Domicilio domicilio; // ¡Aquí el atributo complejo! Inicialícenlo en constructores

    // Constructor con nombre (solo asigna nombre, el resto por defecto de Java)
    public Persona(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
        this.domicilio = new Domicilio("", 0); // Inicializa el objeto complejo con valores por defecto
    }

    // Constructor completo
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura, Domicilio domicilio) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }

        if (edad >= 0) {
            this.edad = edad;
        }

        if (dni != null && !dni.trim().isEmpty()) {
            this.dni = dni;
        }

        if (comprobarSexo(sexo) == true) {
            this.sexo = sexo;
        }else{
            this.sexo= 'I';
        }

        if (peso >= 0) {
            this.peso = peso;
        }

        if (altura >= 0) {
            this.altura = altura;
        }

        this.domicilio = domicilio; // Asigna el objeto complejo
    }

    // Método esMayorDeEdad
    public boolean esMayorDeEdad() {
        return edad >= 18; //avanzado pero lo dejo para que sus cerebros se activen 
    }

    // Método privado para validar sexo
    private boolean comprobarSexo(char sexo) {
        return sexo == 'M' || sexo == 'F';
        //completar
    }

    // toString
    
    public String toString() {
        return "Persona [Nombre= " + nombre + ", Edad= " + edad + ", DNI= " + dni +
               ", Sexo= " + sexo + ", Peso= " + peso + ", Altura= " + altura + ", Domicilio= " + domicilio + "]";
    }

   
    public String infoDomicilio() {
        return "Domicilio de " + nombre + ": " + domicilio + ". ¿Completo? " + domicilio.esCompleto();
    }
}
