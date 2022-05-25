package futbol;

public class Portero extends Futbolista {

	public short golesResibidos;
	public byte dorsal;
	
	public Portero(String n, int e,short gr,byte d) {
		super(n,e,"Portero");
		this.golesResibidos=gr;
		this.dorsal=d;
	}
	
	@Override
	public String toString() {
		return "El futbolista "+getNombre()+
				" tiene "+getEdad()+", y juega de "+getPosicion()+
				" con el dorsal "+dorsal+". Le han marcado "+golesResibidos;
	}
	
	public int compareTo(Object por) {
		Portero portero = (Portero) por;
	      return Math.abs(this.golesResibidos-portero.golesResibidos);
	  }
	
	public boolean jugarConLasManos() {
		return true;
	}
}
