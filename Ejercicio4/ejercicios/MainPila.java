
package ejercicios;

public class MainPila {
    public static void main(String[] args) {

        Contenedor<String, String> platos = new Contenedor<>();

        platos.agregarPar("1", "Cerámica");
        platos.agregarPar("2", "Vidrio");
        platos.agregarPar("3", "Cerámica");
        platos.agregarPar("4", "Porcelana");
        platos.agregarPar("5", "Vidrio");
        platos.agregarPar("6", "Cerámica");
        platos.agregarPar("7", "Porcelana");

        System.out.println("PILA DE PLATOS:");
        platos.mostrarPares();

        System.out.println("\nObtener plato en la posición 0:");

        try {
            System.out.println(platos.obtenerPar(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nObtener plato en la posición 4:");

        try {
            System.out.println(platos.obtenerPar(4));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTODOS LOS PLATOS:");
        System.out.println(platos.obtenerTodosLosPares());
    }
}
