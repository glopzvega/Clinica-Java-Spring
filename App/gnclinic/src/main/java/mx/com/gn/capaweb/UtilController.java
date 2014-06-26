package mx.com.gn.capaweb;

import java.util.List;

import mx.com.gn.capadatos.DTO.Usuario;
import mx.com.gn.capaservicio.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UtilController {

	@Autowired
	UsuariosService uService;
	
	@RequestMapping(value = "/menu", method= RequestMethod.GET)
	public @ResponseBody List<Usuario> obtenerUsuarios() {
		
		return uService.obtenerUsuarios();		
		
	}
	
	@RequestMapping(value = "/module", method= RequestMethod.GET)
	public @ResponseBody Integer borrarUsuario(@RequestParam("accion") String accion, @RequestParam("id") String id){
		
		Integer result = null;
		
		if(accion.equals("delete"))
		{		
			result = uService.borrarUsuario(id);
		}
		else if(accion.equals("estatus"))
		{
			result = uService.estatusUsuario(id);
		}
		return result;	
		
	}
	

}
