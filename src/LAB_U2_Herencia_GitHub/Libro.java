/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author pette
 */
/**En esta parte Herede de mateial y ademas implemente atributos propios */
public class Libro extends Material {
    private String autor;
    private int cantidadPaginas;
    private Genero genero;
    
    /**Uso Super para llamar al constructor de Material y utilizo el this para guardar los atributos propios*/
    public Libro (
            int id,
            String titulo,
            String autor,
            int cantidadPaginas,
            Genero genero
    ){
    
    super(id, titulo);
    this.autor = autor;
    this.cantidadPaginas = cantidadPaginas;
    this.genero = genero;
    }
    /** getters y setters*/
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getCantidadPaginas(){
        return cantidadPaginas;
    }
    public void setCantidadPaginas(int cantidadPaginas){
        this.cantidadPaginas = cantidadPaginas;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    /** acá uso super y muestro primero los datos heredados, luego imprimo los nuevos*/
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor" + autor);
        System.out.println("Paginas" + cantidadPaginas);
        System.out.println("Genero" + genero);
    }
}

