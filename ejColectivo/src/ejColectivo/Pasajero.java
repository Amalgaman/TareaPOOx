package ejColectivo;

public class Pasajero {

	private int id_pasajero; 
	private String dni;
	private String nombre;
	private Sube sube;
	
	public Pasajero(int id_pasajero, String dni, String nombre, Sube sube) {
		super();
		this.id_pasajero = id_pasajero;
		this.dni = dni;
		this.nombre = nombre;
		this.sube = sube;
	}

	public int getId_pasajero() {
		return id_pasajero;
	}

	public void setId_pasajero(int id_pasajero) {
		this.id_pasajero = id_pasajero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sube getSube() {
		return sube;
	}

	public void setSube(Sube sube) {
		this.sube = sube;
	}
	
	public boolean subirBondi(Colectivo bondi) {
		
		if (bondi.getCantidad_pasajeros()>=bondi.getCapacidad_maxima()) {
			System.out.println("El colectivo esta lleno, no se puede ingresar");
			return false;
		}
		if (this.sube.pagarViaje(bondi.getTarifa())) {
			System.out.println("Se ingreso al colectivo con exito");
			bondi.setCantidad_pasajeros(bondi.getCantidad_pasajeros()+1);
			return true;
		}else {
			System.out.println("No se pudo pudo subir al colectivo");
			return false;
		}
	}
	
}
