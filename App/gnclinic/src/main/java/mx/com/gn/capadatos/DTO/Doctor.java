package mx.com.gn.capadatos.DTO;

public class Doctor {

	private Integer idDoctor;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String email;
	private Usuario usuario;

	public Doctor(String nombre, String apellidos, String telefono,
			String direccion, String email) {		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}

	public Doctor(Integer idDoctor, String nombre, String apellidos, String telefono,
			String direccion, String email, Usuario usuario) {
		this.idDoctor = idDoctor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.usuario = usuario;
	}
	
	public Doctor(){}		
	
	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Doctores [idDoctor=" + idDoctor + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", email=" + email
				+ ", usuario=" + usuario + "]";
	}

}
