package futbol;

public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String n, int e,short gr,byte d) {
		super(n,e,"Portero");
		this.golesRecibidos=gr;
		this.dorsal=d;
	}
	
	@Override
	public String toString() {
		return "El futbolista "+getNombre()+
				" tiene "+getEdad()+", y juega de "+getPosicion()+
				" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
	}
	
	public int compareTo(Object por) {
		Portero portero = (Portero) por;
	      return Math.abs(this.golesRecibidos-portero.golesRecibidos);
	  }
	
	public boolean jugarConLasManos() {
		return true;
	}
}
