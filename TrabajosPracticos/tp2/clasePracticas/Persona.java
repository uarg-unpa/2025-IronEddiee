package TrabajosPracticos.tp2.clasePracticas;
//clase practica 28/08/2025


public class Persona {
    //atributos
    String nombre;
    String apellido;
    int edad;
    int dni;


    public Persona(String nombre, String apellido, int edad, int dni){
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad=edad;
        this.dni= dni;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getDni(){
        return this.dni;
    }

    
    public void setNombre (String nombre){
        this.nombre= nombre;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    public void setDni(int dni){
        this.dni= dni;
    }

    public boolean mayorDeEdad(){
        if (this.edad >= 18){
            return true;
        }else{
            return false;
        }
    }
}
