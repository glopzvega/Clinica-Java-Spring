package mx.com.gn.capadatos.DAO;

import java.util.List;

import mx.com.gn.capadatos.DTO.Usuario;

public interface UsuarioDAO {

	public Usuario getUsuario(Usuario usuario);		
	
	public List<Usuario> listUsuarios();
	
	public Integer deleteUsuario(String idUsuario);
	
	public Integer estatusUsuario(String idUsuario);
	
}
