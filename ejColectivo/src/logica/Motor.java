package logica;

public class Motor {

	private int id_motor;
	private String modelo;
	private int estado; //Es un numero del 1 al 10, el 10 es impecable y el 1 irreparable.
	
	public Motor(int id_motor, String modelo, int estado) {
		super();
		this.id_motor = id_motor;
		this.modelo = modelo;
		this.estado = estado;
	}
	public int getId_motor() {
		return id_motor;
	}
	public void setId_motor(int id_motor) {
		this.id_motor = id_motor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public boolean arrancar() {
		if (this.estado > 5) {
			System.out.println("El motor arranco correctamente");
			return true;
		}
		System.out.println("El motor esta descompuesto, no llego a encenderse");
		return false;
	}
	
}
