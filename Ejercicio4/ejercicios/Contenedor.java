
package ejercicios;

import java.util.ArrayList;

public class Contenedor<F, S> {

    private ArrayList<Par<F, S>> pares;

    public Contenedor() {
        pares = new ArrayList<>();
    }

    public void agregarPar(F primero, S segundo) {
        pares.add(new Par<>(primero, segundo));
    }

    public Par<F, S> obtenerPar(int indice) {
        if (indice < 0 || indice >= pares.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        ArrayList<Par<F, S>> auxiliar = new ArrayList<>(pares);

        for (int i = auxiliar.size() - 1; i >= 0; i--) {
            Par<F, S> plato = auxiliar.get(i);

            System.out.println("Se retiró temporalmente el plato " + plato.getPrimero());

            if (indice == 0) {
                System.out.println("Se encontró el plato " + plato.getPrimero());
                return plato;
            }

            indice--;
        }

        return pares.get(pares.size() - 1);
    }

    public ArrayList<Par<F, S>> obtenerTodosLosPares() {
        ArrayList<Par<F, S>> auxiliar = new ArrayList<>();

        for (int i = pares.size() - 1; i >= 0; i--) {
            auxiliar.add(pares.get(i));
        }

        return auxiliar;
    }

    public void mostrarPares() {
        for (int i = pares.size() - 1; i >= 0; i--) {
            System.out.println(pares.get(i));
        }
    }
}




