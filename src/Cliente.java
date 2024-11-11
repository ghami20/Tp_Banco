import java.time.LocalDate;

public class Cliente extends Usuario{

	private Cuenta cuenta;

	public Cliente(String nombre, String contrasenia, LocalDate alta, Cuenta cuenta) {
		super(nombre, contrasenia, alta);
		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Cliente [cuenta=" + cuenta + "]";
	} 
	
	
	
}
