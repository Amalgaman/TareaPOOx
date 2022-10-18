package ejColectivo;

public class Sube {

	private int id_sube;
	private int codigo;
	private double saldo;
	
	public Sube(int id_sube, int codigo, double saldo) {
		super();
		this.id_sube = id_sube;
		this.codigo = codigo;
		this.saldo = saldo;
	}
	public int getId_sube() {
		return id_sube;
	}
	public void setId_sube(int id_sube) {
		this.id_sube = id_sube;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean pagarViaje(double tarifa) {
		if (this.saldo >= tarifa) {
			this.saldo = this.saldo - tarifa;
			System.out.println("Se realizo el pago, el saldo restante es: $"+this.saldo);
			return true;
		}
		System.out.println("Saldo insuficiente, no se concreto el pago");
		return false;
	}
	
}
