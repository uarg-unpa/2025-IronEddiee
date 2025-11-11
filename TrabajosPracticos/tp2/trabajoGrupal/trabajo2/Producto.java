package TrabajosPracticos.tp2.trabajoGrupal.trabajo2;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private Proveedor proveedor;
    private int stock;

    public Producto(String nombre, String descripcion, double precio, Proveedor proveedor, int stock){
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.precio= precio;
        this.proveedor= proveedor;
        this.stock= stock;
    }

    //metodos get
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }


    //metodo set
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void  setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
    public void setStock(int stock){
        this.stock= stock;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }


    public boolean esCaro(){
        if (this.precio > 1000){
            return true;
        }else{
            return false;
        }
    }

    public void actualizarPrecio(double precio){
        if (precio > 0 && precio != this.precio){
            this.precio= precio;
        }
    }

    public double calcularDescuento(double descuento){
        return (descuento * this.precio) / 100;
    }

    public String toString(){
        return "Producto: [Nombre: " + this.nombre + ", descripcion: "+ this.descripcion + ", precio:" + this.precio  + ", stock disponible:" + stock + "\n Proveedor: " + this.proveedor +  ".]";
    }

}
