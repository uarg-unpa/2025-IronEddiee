package TrabajosPracticos.tp2part2.punto1;

/*1. Implementar una clase Persona que siga las siguientes condiciones:
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan
directamente a ellos.
Todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para
String, etc.).
Se implementarán varios constructores:
 Un constructor por defecto.
 Un constructor con el nombre.
Los métodos que se implementaran son:
 esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. No será visible al exterior.
 toString(): devuelve toda la información del objeto. */
public class Persona {
    private String nombreyapellido;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    Persona(){
        this.nombreyapellido= "";
        this.edad= 0;
        this.dni= 0;
        this.sexo= ' ' ;
        this.peso= 0;
        this.altura= 0;
    }

    Persona(String nombre, int edad, int dni, char sexo, double peso, double altura){
        this.nombreyapellido= nombre;
        this.edad= edad;
        this.dni= dni;
        this.sexo= sexo;
        this.peso= peso;
        this.altura= altura;
    }

    //metodos get
    public String GetNombre(){
        return this.nombreyapellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getDni(){
        return this.dni;
    }
    public char getSexo(){
        return this.sexo;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(){
        return this.altura;
    }

    //metodos set
    public void setNombre(String nombre){
        this.nombreyapellido= nombre;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setSexo(char sexo){
        this.sexo= sexo;
    }
    public void setPeso(double peso){
        this.peso= peso;
    }
    public void setAltura(double altura){
        this.altura= altura;
    }

    //otros metodos

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public char comprobarSexo(){
        if (this.sexo == 'M'){
            return 'M';
        }
        if (this.sexo == 'F'){
            return 'F';
        }
        else{
            return 'N';
        }
    }

    public String toString(){
        return "Persona [Nombre: " + this.nombreyapellido + ", Edad: " + this.edad + ", DNI: " + this.dni + ", Sexo: " + this.sexo + ", Peso: " + this.peso + "Kg, Altura: " + this.altura;
    }

    
}
