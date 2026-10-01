package ejercicios;

class Par1<F, S> {

    private F primero;
    private S segundo;

    // Constructor
    public Par1(F primero, S segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // Obtener primer elemento
    public F getPrimero() {
        return primero;
    }

    // Obtener segundo elemento
    public S getSegundo() {
        return segundo;
    }

    // Modificar primer elemento
    public void setPrimero(F primero) {
        this.primero = primero;
    }

    // Modificar segundo elemento
    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }

    // Mostrar el par
    @Override
    public String toString() {
        return "(Primero: " + primero
                + ", Segundo: " + segundo + ")";
    }
}


