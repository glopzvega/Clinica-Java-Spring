package mx.com.gn.capaservicio.Impl;

import java.util.List;

import mx.com.gn.capadatos.DAO.UsuarioDAO;
import mx.com.gn.capadatos.DTO.Usuario;
import mx.com.gn.capaservicio.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	UsuarioDAO usuarioDAO;
	
	@Override
	public List<Usuario> obtenerUsuarios() {
		
		return usuarioDAO.listUsuarios();
		
	}
	
	@Override
	public Integer borrarUsuario(String idUsuario) {

		return usuarioDAO.deleteUsuario(idUsuario);
	}
	
	@Override
	public Integer estatusUsuario(String idUsuario) {

		return usuarioDAO.estatusUsuario(idUsuario);
	}

}
