package futbol;
import java.lang.Math;
public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String n, int e, String p,short gm,byte d) {
		super(n,e,p);
		this.golesMarcados=gm;
		this.dorsal=d;
	}
	
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	
  @Override
  public int compareTo(Object fut) {
	  Jugador player = (Jugador) fut; // Casteo de futbolista a jugador
      return Math.abs(this.getEdad()-player.getEdad());
  }
  
  @Override
	public String toString() {
		return "El futbolista "+getNombre()+
				" tiene "+getEdad()+", y juega de "+getPosicion()+
				" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
	}
	
  public boolean jugarConLasManos() {
		return false;
	}

}
