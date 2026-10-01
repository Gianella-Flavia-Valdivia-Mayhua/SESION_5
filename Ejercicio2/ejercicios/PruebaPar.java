package ejercicios;

public class PruebaPar {
	public static void main(String []args) {
		Par<String,Integer> par1=new Par<>("hola",3);
		Par<Double, Boolean> par2 = new Par<>(3.3, true);
		Par<String,Integer> par3=new Par<>("hola",3);
		System.out.println(par1.esIgual(par2));
		System.out.println(par1.esIgual(par3));
		
	}
}
