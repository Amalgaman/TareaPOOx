package Logica;

public class Pasajero {

	private static int id=1;
	private String nombre;
	private double saldo;
	private int edad;
	private int paradas_recorridas;
	
	public Pasajero(int id, String nombre, double saldo, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.saldo = saldo;
		this.edad = edad;
		this.paradas_recorridas = 0;
		this.id++;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Pasajero.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
