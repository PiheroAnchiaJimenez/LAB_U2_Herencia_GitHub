/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author Usuario
 */
public class Tesis extends Material {
    String autor;
    String universidad;
    int anioPublicacion;
    public Tesis( int id, String titulo, String autor, String universidad, int anioPublicacion )
    {
        super (id, titulo);
        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
        
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año: " + anioPublicacion);
    }
}
