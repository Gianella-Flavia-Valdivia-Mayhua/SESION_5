package ejercicios;

public class Main {
	public static <F, S> void imprimirPar(Par<F, S> p) {
	    System.out.println(p.toString());
	}
	public static void main(String args[]) {
		Par<String,Integer> par1=new Par<>("hola",3);
		Par<Double, Boolean> par2 = new Par<>(3.3, true);
		Persona persona1=new Persona("Gianella");
		Par<Persona,Integer> par3= new Par<>(persona1, 4);
		imprimirPar(par1);
		imprimirPar(par2);
		imprimirPar(par3);
	}
}
