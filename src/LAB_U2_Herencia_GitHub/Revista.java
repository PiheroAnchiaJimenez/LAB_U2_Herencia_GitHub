/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author pette
 */
/** aqui creo atributos propios y herede de Material usando extends*/
public class Revista extends Material {
    
    private int numeroEdicion;
    private String mesPublicacion;
    
    public Revista(
        int id,
        String titulo,
        int numeroEdicion,
        String mesPublicacion
){
        /** implemento un constructor que use super para enviar los datos heredados a Material */
        /** Uso this. para guardar los datos propios*/
    super(id, titulo);
    this.numeroEdicion = numeroEdicion;
    this.mesPublicacion = mesPublicacion;
}
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    
    public String getMesPublicacion() {
        return mesPublicacion;
    }
    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }
    /** Sobreescribo mostrar info y muestro numero de edicion y mes*/
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de edicion: " + numeroEdicion);
        System.out.println("Mes de publicacion: " + mesPublicacion);
    }
    }
