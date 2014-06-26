package mx.com.gn.capadatos.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import mx.com.gn.capadatos.DAO.DoctorDAO;
import mx.com.gn.capadatos.DTO.Doctor;
import mx.com.gn.capadatos.DTO.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDAOImpl implements DoctorDAO {

	@Autowired
	private DataSource datasource;

	private Connection cn;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public Doctor obtenerDatos(Usuario usuario) {

		cn = null;
		ps = null;
		rs = null;

		Doctor logDoctor = null;

		String sql = "SELECT * FROM usuarios as u, doctores as d WHERE u.id_usuario = "
				+ usuario.getIdUsuario() + " AND u.id_usuario = d.usuario";

		try {

			if (cn == null)	cn = datasource.getConnection();
			ps = cn.prepareStatement(sql);
			rs = ps.executeQuery();			
			
			if (rs.next()) 
			{				
				logDoctor = new Doctor(rs.getInt("id_doctor"),
						rs.getString("nombre"), rs.getString("apellidos"),
						rs.getString("telefono"), rs.getString("direccion"),
						rs.getString("email"), usuario);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			closeConexion();
		}
		
		return logDoctor;
	}
	
	private void closeConexion()
	{
		try
		{
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(cn != null) cn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
