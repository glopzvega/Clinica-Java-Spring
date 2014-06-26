package mx.com.gn.capaservicio;

import java.util.List;

import mx.com.gn.capadatos.DTO.Usuario;

public interface UsuariosService {
	
	public List<Usuario> obtenerUsuarios();
	
	public Integer borrarUsuario(String idUsuario);
	
	public Integer estatusUsuario(String idUsuario);

}
