package ejercicios;

import java.util.ArrayList;

public class Contenedor1<F, S> {

    private ArrayList<Par<F, S>> pares;

    public Contenedor1() {
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

        for (int i = 0; i < auxiliar.size(); i++) {
            Par<F, S> persona = auxiliar.get(i);

            System.out.println("Se atendió temporalmente a " + persona.getPrimero());

            if (indice == 0) {
                System.out.println("Se encontró a " + persona.getPrimero());
                return persona;
            }

            indice--;
        }

        return pares.get(0);
    }

    public ArrayList<Par<F, S>> obtenerTodosLosPares() {
        ArrayList<Par<F, S>> auxiliar = new ArrayList<>();

        for (int i = 0; i < pares.size(); i++) {
            auxiliar.add(pares.get(i));
        }

        return auxiliar;
    }

    public void mostrarPares() {
        for (int i = 0; i < pares.size(); i++) {
            System.out.println(pares.get(i));
        }
    }
}

