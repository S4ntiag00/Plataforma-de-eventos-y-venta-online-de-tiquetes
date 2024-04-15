package modelo;

public class Categoria {
    // Atributos de la clase Categoria -> tabla categorías
    int idCategoria;
    String nombreCategoria;

    // Constructor vacío ->
    public Categoria() {
    }

    // Constructor con loa atributos de la clase ->
    public Categoria(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    //Getters y Setters  de la clase ->
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
