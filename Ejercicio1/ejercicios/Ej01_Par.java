package ejercicios;
public class Ej01_Par {
    public static void main(String[] args) {

        Par1<String, Integer> par =
                new Par1<>("Victor", 21);

        System.out.println("Par original:");
        System.out.println(par);

        System.out.println(
            "Primer elemento: " + par.getPrimero()
        );

        System.out.println(
            "Segundo elemento: " + par.getSegundo()
        );

        //modificar elementos
        par.setPrimero("Carlos");
        par.setSegundo(25);

        System.out.println("\nPar modificado:");
        System.out.println(par);
    }
}