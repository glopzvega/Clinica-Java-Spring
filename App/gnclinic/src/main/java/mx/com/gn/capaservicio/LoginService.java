package mx.com.gn.capaservicio;

import mx.com.gn.capadatos.DTO.Doctor;
import mx.com.gn.capadatos.DTO.Usuario;

public interface LoginService {

	public Usuario loginUsuario(Usuario usuario);
	
	public Doctor obtenerDatos(Usuario usuario);
}
