package TrabajosPracticos.tp3.clasepractica.actividadPilaLibro;

public class Libro {
    private String titulo;
    private String autor;
    private int cantPaginas;
    

    Libro(String titulo, String autor, int pag){
        this.titulo= titulo;
        this.autor= autor;
        this.cantPaginas= pag;
    }

    //metodo get
    public String getTitulo(){
        return this. titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getCantPaginas(){
        return this.cantPaginas;
    }

    //metodos set
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }
    public void setCantPaginas(int pag){
        this.cantPaginas= pag;
    }

    //toString
    public String toString(){
        return "[Obra: " + this.titulo + ", Autor: " + this.autor + ", Paqginas: " + this.cantPaginas + "]";
    }

}
