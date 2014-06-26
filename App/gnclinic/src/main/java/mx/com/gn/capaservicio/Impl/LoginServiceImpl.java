package mx.com.gn.capaservicio.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.gn.capadatos.DAO.DoctorDAO;
import mx.com.gn.capadatos.DAO.UsuarioDAO;
import mx.com.gn.capadatos.DTO.Doctor;
import mx.com.gn.capadatos.DTO.Usuario;
import mx.com.gn.capaservicio.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UsuarioDAO usuarioDAO;
	
	@Autowired
	DoctorDAO doctorDAO;
	
	@Override
	public Usuario loginUsuario(Usuario usuario) {
		usuario = usuarioDAO.getUsuario(usuario);
		return usuario;
	}

	@Override
	public Doctor obtenerDatos(Usuario usuario) {
		Doctor doctor = null;
		doctor = doctorDAO.obtenerDatos(usuario);
		return doctor;
	}

}
