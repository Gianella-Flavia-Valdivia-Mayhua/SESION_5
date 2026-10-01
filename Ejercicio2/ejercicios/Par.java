package ejercicios;

public class Par <F,S> {
	private F primer;
	private S segundo;
	
	public Par(F primer, S segundo) {
		this.primer=primer;
		this.segundo=segundo;
	}
	
	public F getPrimero() {
		return primer;
	}
	
	public S getSegundo() {
		return segundo;
	}
	
	public void setPrimero(F cambiar) {
		this.primer=cambiar;
	}
	
	public void setSegundo(S cambiar) {
		segundo=cambiar;
	}
	
	public String toString() {
		return "Par: "+primer+", "+segundo;
	}
	
	
	public boolean esIgual(Par<?, ?> p) {
      if ((this.primer.equals(p.getPrimero()) && this.segundo.equals(p.getSegundo()))) {
    	   	return true;
      }else {
    	   	return false;
       }
    }
}
