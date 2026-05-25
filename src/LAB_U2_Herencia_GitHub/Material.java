package LAB_U2_Herencia_GitHub;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phiero
 */
/**la clase debia ser abstracta*/
public abstract class Material {
    
/**declaraciones con sus especificaciones*/
    private final int id;
    private String titulo;
    private boolean disponible;
    private static int contadorMateriales;
/**en esta parte cree los constructores*/
    public Material(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = true;
        contadorMateriales++;
    }
    
/**cree los "métodos get/set"*/
    public int getId() {
    return id;
    }
    public String getTitulo() {
    return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public static int getContadorMateriales() {
        return contadorMateriales;
    }
    
/**cree el metodo mostrar"*/
    public void  mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Disponible: " + disponible);
    }
    
/**cree el metodo prestar y devolver"*/
    public void  prestar(){
        if (disponible) {
            disponible = false;
            System.out.println("Material prestado");
        }
        else {
            System.out.println("Este material ya ha sido prestado");
        }
    
    }
    public void  devolver(){
        if (!disponible) {
            disponible = true;
            System.out.println("Material devuelto");
        }
        else {
            System.out.println("Este material ya se encuentra disponible");
        }
    
    }
}
