package TrabajosPracticos.tp2part2.punto4;

/*4. Un artículo tiene una descripción, un precio, un código, y un stock (cantidad de unidades disponibles del
artículo). Implementar las operaciones que permitan decrementar e incrementar el stock. */

public class Articulo {
    private String producto;
    private String marca;
    private String descripcion;
    private int precio;
    private int codigo;
    private int stock;

    public Articulo(String producto, String marca, String descripcion, int precio, int codigo, int stock){
        if (producto != null && !producto.trim().isEmpty()){
            this.producto= producto;
        }
         if (marca != null && !marca.trim().isEmpty()){
            this.marca= marca;
        }
         if (descripcion != null && !descripcion.trim().isEmpty()){
            this.descripcion= descripcion;
        }
        if( precio > 0){
        this.precio= precio;
        }
        if( codigo > 0){
        this.codigo= codigo;
        }
        if( stock > 0){
        this.stock= stock;
        }
        else{
            this.producto= "Invalido";
            this.marca= "invalido";
            this.descripcion= "invalido";
            this.precio= 00;
            this.codigo= 0000000000;
            this.stock= 0;
        }
    }

    //metodos get
    public String getProducto(){
        return this.producto;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public int getStock(){
        return this.stock;
    }

    //metodos set
    public void setProducto(String nombre){
        this.producto= nombre;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
    public void setPrecio(int precio){
        this.precio= precio;
    }
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    public void setStock(int stock){
        this.stock= stock;
    }

    //otros metodos
    public void incrementarStock(int cantidad){
        if (cantidad > 0 ){
            this.stock= this.stock + cantidad;
        }
    }

    public void decrementarStock(int cantidad){
        if (this.stock > cantidad){
            this.stock= this.stock - cantidad;
        }else{
            System.out.println("Hay menos de la cantidad a decrementar. El stock quedara en 0");
            this.stock= 0;
        }
    }

    public int vender(int cantidad){
        if (this.stock > cantidad){
            return cantidad * this.precio;
        }
        return 0;
    }

    public String toString(){
        return "Articulo[" + this.producto + " Marca: " + this.marca + ", precio: " + this.precio + ", codigo: " + this.codigo + " Stock: " + this.stock + "\nDescripcion: " + this.descripcion;
    }
}
