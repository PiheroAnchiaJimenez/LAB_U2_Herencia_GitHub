package LAB_U2_Herencia_GitHub;
import java.util.ArrayList;


public class Biblioteca {
    private ArrayList<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material agregado correctamente.");
    }

    public void listarMateriales() {
        for (Material m : materiales) {
            m.mostrarInfo();
        }
    }

    public Material buscarPorId(int id) {
        for (Material m : materiales) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public void prestarMaterial(int id) {
        Material m = buscarPorId(id);

        if (m != null) {
            m.prestar();
        } else {
            System.out.println("Material no encontrado.");
        }
    }

    public void devolverMaterial(int id) {
        Material m = buscarPorId(id);

        if (m != null) {
            m.devolver();
        } else {
            System.out.println("Material no encontrado.");
        }
    }
}
