package clases;

public class Persona {
	
	public int Codigo;
	public String Apellido;
	public String Nombre;
	public String Telefono;	
	
	public Persona(int codigo, String apellido, String nombre, String telefono) {
		
		Codigo = codigo;
		Apellido = apellido;
		Nombre = nombre;
		Telefono = telefono;
		
		
	}
	public Persona(int codigo, String nombre) {
		this.Codigo=codigo;
		this.Nombre=nombre;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTelefono() {
		return Telefono;
	}
	
	public void setTelefono(String telefono) {
		Telefono = telefono;
		
	}
	
	
}
