package ejercicios;

public class MainCola {
    public static void main(String[] args) {

        Contenedor1<String, String> cola = new Contenedor1<>();

        cola.agregarPar("Gianella", "Hamburguesa clásica");
        cola.agregarPar("Camila", "Hamburguesa con queso");
        cola.agregarPar("Sergio", "Hamburguesa doble");
        cola.agregarPar("Yanett", "Hamburguesa BBQ");
        cola.agregarPar("Luis", "Hamburguesa de pollo");

        System.out.println("COLA DE PERSONAS EN EL RESTAURANTE:");
        cola.mostrarPares();

        System.out.println("\nObtener persona en la posición 0:");

        try {
            System.out.println(cola.obtenerPar(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nObtener persona en la posición 3:");

        try {
            System.out.println(cola.obtenerPar(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTODAS LAS PERSONAS:");
        System.out.println(cola.obtenerTodosLosPares());
    }
}

