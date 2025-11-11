package TrabajosPracticos.practicaEnClases.listaDeReproduccion;

public class Musica {
    private String titulo;
    private String interprete;
    private String genero;
    private int año;


    public Musica (String titulo, String interprete, String genero, int año){
        this.titulo= titulo;
        this.interprete= interprete;
        this.genero= genero;
        this.año= año;
    }

    //metodos set
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }

    public void setInterprete(String autor){
        this.interprete= autor;
    }

    public void setGenero(String genero){
        this.genero= genero;
    }

    public void setAño(int año){
        this.año= año;
    }

    //Metodos get
    public String getTitulo(){
        return this.titulo;
    }

    public String getInterprete(){
        return this.interprete;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getAño(){
        return this.año;
    }

    public String toString(){
        return titulo + " [ Autor: " + interprete + ", Genero: " + genero + ", Año: " + año + "]";
    }
}
