import java.time.LocalDate;
import java.util.LinkedList;

public abstract class Usuario {
	private String nombre;
	private String contrasenia;
	private LocalDate alta;
	
	private static LinkedList<Cliente> clientes = new LinkedList<Cliente>();
	
	
	public Usuario(String nombre, String contrasenia, LocalDate alta) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.alta = alta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public LocalDate getAlta() {
		return alta;
	}
	public void setAlta(LocalDate alta) {
		this.alta = alta;
	}
	public static LinkedList<Cliente> getCliente() {
		return clientes;
	}
	public static void setCliente(LinkedList<Cliente> usuario) {
		Usuario.clientes = clientes;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrasenia=" + contrasenia + ", alta=" + alta + "]";
	}
	
	public static void Login(String nombre,String contrsaenia) {
	
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().equals(nombre)
					&& cliente.getContrasenia().equals(contrsaenia)) {
				
			}
		}
		
		
	}
	


}
