package TrabajosPracticos.tp2part2.punto3;

/*3. Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases. */

public class Teatro {
    private String nombre;
    private String direccion;
    private Obra funcion1;
    private Obra funcion2;
    private Obra funcion3;


    public Teatro(String nombre, String direccion, Obra funcion1, Obra funcion2, Obra funcion3){
        this.nombre= nombre;
        this.direccion= direccion;
        this.funcion1= funcion1;
        this.funcion2= funcion2;
        this.funcion3= funcion3;
        
    }

    //metodo get
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }

    //metodo set
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }

    //otros metodos
    public double descuento(double porcentaje){
        switch (this.nombre) {
            case "Capelucita Roja":
                return (funcion1.getPrecio() * porcentaje) / 100;
            
            case "Romeo y Julieta":
                return (funcion1.getPrecio() * porcentaje) / 100;

            case "hamlet":
                return (funcion1.getPrecio() * porcentaje) / 100;

            default:
                return 0;
        }
    }


    public double cantidadDePersonas(double cantidad){
        boolean cond= true;
        do{
            switch (this.nombre) {
                case "Capelucita Roja":
                    cond= false;
                    return funcion1.getPrecio() * cantidad;
                    
                
                case "Romeo y Julieta":
                    cond= false;
                    return funcion2.getPrecio() * cantidad;
                    

                case "hamlet":
                    cond= false;
                    return funcion3.getPrecio() * cantidad;
                    

                default:
                    System.out.println("No existe esa funcion, ingresa la funcion");
                    return 0;
            }
        }while (cond);
        }

    public String toString(){
        return "Teatro [" + this.nombre + "Direccion: " + this.direccion + "]\nFunciones\n" + funcion1 + "\n" + funcion2 + "\n" + funcion3;
    }

}

    


