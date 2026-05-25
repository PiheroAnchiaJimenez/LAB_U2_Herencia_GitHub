/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author Usuario
 */
public class AudioLibro extends Material {
    String narrador;
    double duracionHoras;
    Genero genero;
     
    public AudioLibro(int id, String titulo, String narrador, double duracionHoras, Genero genero){
        
        super(id, titulo);
        
        this.narrador = narrador;
        this.duracionHoras = duracionHoras;
        this.genero = genero;
    }
    
}
