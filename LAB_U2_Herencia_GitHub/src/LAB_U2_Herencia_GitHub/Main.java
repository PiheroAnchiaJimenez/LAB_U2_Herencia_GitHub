
package LAB_U2_Herencia_GitHub;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Listar materiales");
            System.out.println("2. Prestar material");
            System.out.println("3. Devolver material");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            switch(opcion) {

                case 1:
                    biblioteca.listarMateriales();
                    break;

                case 2:
                    System.out.print("ID: ");
                    int idPrestamo = sc.nextInt();
                    biblioteca.prestarMaterial(idPrestamo);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idDevolver = sc.nextInt();
                    biblioteca.devolverMaterial(idDevolver);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while(opcion != 4);

        sc.close();
    }
}