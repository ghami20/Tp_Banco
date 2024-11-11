import java.util.LinkedList;

public class Cuenta {
	private int nroCuenta;
	private double saldo;
	private LinkedList<Movimiento> movimientos=new LinkedList<Movimiento>();
	public Cuenta(int nroCuenta, double saldo) {
		super();
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
		this.movimientos = movimientos;
	}
	
	
}
