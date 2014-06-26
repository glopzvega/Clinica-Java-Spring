package mx.com.gn.capadatos.DAO.Impl;

import java.util.List;

import mx.com.gn.capadatos.DAO.UsuarioDAO;
import mx.com.gn.capadatos.DTO.Usuario;
import mx.com.gn.capadatos.DTO.UsuarioRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {	
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate; 

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Usuario getUsuario(Usuario usuario) {

		String sql = "SELECT * FROM usuarios WHERE username = :username AND password = :password";
		Usuario usuarioResult = null;
		
		try {
			SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(usuario);			
			usuarioResult = namedParameterJdbcTemplate.queryForObject(sql, namedParameters, new UsuarioRowMapper());
		} 
		catch (Exception e) {
			e.printStackTrace();			
		}

		return usuarioResult;
	}
	
	public List<Usuario> listUsuarios(){
		
		String sql = "SELECT * FROM usuarios";
		return jdbcTemplate.query(sql, new UsuarioRowMapper());
	}
	
	@Override
	public Integer deleteUsuario(String idUsuario) {
		
		String sql = "UPDATE usuarios SET estatus=3 WHERE id_usuario = " + idUsuario;
		return jdbcTemplate.update(sql);		
	}
	
	@Override
	public Integer estatusUsuario(String idUsuario) {
		
		String sql = "SELECT estatus FROM usuarios WHERE id_usuario = " + idUsuario;
		int result = jdbcTemplate.queryForInt(sql);
		
		switch(result){
		case 1: 
			sql = "UPDATE usuarios SET estatus=2 WHERE id_usuario = " + idUsuario;
			break;
			
		case 2: 
			sql = "UPDATE usuarios SET estatus=1 WHERE id_usuario = " + idUsuario;
			break;
		}
		return jdbcTemplate.update(sql);
		
	}

}