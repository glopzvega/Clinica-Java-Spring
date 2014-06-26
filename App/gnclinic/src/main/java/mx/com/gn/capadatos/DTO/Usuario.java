package mx.com.gn.capadatos.DTO;

//@Component
public class Usuario {
	
	private Integer idUsuario;
	private String username;
	private String password;
	private Integer estatus;
	
	public Usuario(){}	
	
	public Usuario(String username, String password, Integer estatus){		
		this.username = username;
		this.password = password; 
		this.estatus = estatus;
	}
	
	public Usuario(Integer idUsuario, String username, String password, Integer estatus){
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.estatus = estatus;
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer status) {
		this.estatus = status;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", username=" + username
				+ ", password=" + password + ", estatus=" + estatus + "]";
	}

	
}
