package futbol;

public abstract class Futbolista implements Comparable<Object> {
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String n, int e, String p) {
		
		this.nombre=n;
		this.edad=e;
		this.posicion=p;
	}
	
	public Futbolista() {
		
		this.nombre="Maradona";
		this.edad=30;
		this.posicion="delantero";
	}
	
	@Override
	public String toString() {
		return "El futbolista "+nombre+
				" tiene "+edad+", y juega de "+posicion;
	}
	
	public boolean equals(Futbolista f) {
		return this==f;
	}
	
	public abstract boolean jugarConLasManos();
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nn) {
		this.nombre=nn;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int ee) {
		this.edad=ee;
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	
//    public abstract int compareTo(Futbolista fut);
}
