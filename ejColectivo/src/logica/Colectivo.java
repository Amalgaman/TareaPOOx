package logica;

public class Colectivo {

	private int id_colectivo;
	private String patente;
	private Motor motor;
	private int cantidad_pasajeros;
	private int capacidad_maxima;
	private double tarifa;
	
	public Colectivo(int id_colectivo, String patente, Motor motor, int capacidad_maxima,
			double tarifa) {
		super();
		this.id_colectivo = id_colectivo;
		this.patente = patente;
		this.motor = motor;
		this.cantidad_pasajeros = 14;
		this.capacidad_maxima = capacidad_maxima;
		this.tarifa = tarifa;
	}
	public int getId_colectivo() {
		return id_colectivo;
	}
	public void setId_colectivo(int id_colectivo) {
		this.id_colectivo = id_colectivo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public int getCantidad_pasajeros() {
		return cantidad_pasajeros;
	}
	public void setCantidad_pasajeros(int cantidad_pasajeros) {
		this.cantidad_pasajeros = cantidad_pasajeros;
	}
	public int getCapacidad_maxima() {
		return capacidad_maxima;
	}
	public void setCapacidad_maxima(int capacidad_maxima) {
		this.capacidad_maxima = capacidad_maxima;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public boolean realizarViaje() {
		
		if(this.motor.arrancar()) {
			this.cantidad_pasajeros = this.cantidad_pasajeros - (int)(Math.random()*this.cantidad_pasajeros+1);
			return true;
		}else {
			return false;
		}
	}
	
}
