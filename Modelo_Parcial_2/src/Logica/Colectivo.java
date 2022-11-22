package Logica;

import java.util.LinkedList;

public class Colectivo {

	private String linea;
	private int id;
	private int capacidad;
	private boolean encendido;
	private double precio;
	private LinkedList<Pasajero> pasajeros;
	private Chofer chofer;
	
	public Colectivo(String linea, int id, int capacidad, boolean encendido, double precio,Chofer chofer) {
		super();
		this.linea = linea;
		this.id = id;
		this.capacidad = capacidad;
		this.encendido = encendido;
		this.precio = precio;
		this.pasajeros = new LinkedList<Pasajero>();
		this.chofer = chofer;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
	
	
}
