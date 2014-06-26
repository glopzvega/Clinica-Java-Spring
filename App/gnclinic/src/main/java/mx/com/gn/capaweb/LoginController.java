package mx.com.gn.capaweb;

import javax.servlet.http.HttpServletRequest;

import mx.com.gn.capadatos.DTO.Doctor;
import mx.com.gn.capadatos.DTO.Usuario;
import mx.com.gn.capaservicio.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"usuarioLogin"})
public class LoginController {
		
	@Autowired
	public LoginService lService;		
	
	@RequestMapping(value="/")
	public String Home(HttpServletRequest request)
	{		
		if(request.getSession().getAttribute("usuarioLogin") != null) return "main";		
		return "main";				
	}	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginUsuario(@ModelAttribute Usuario usuario, Model model){				
		
		usuario = lService.loginUsuario(usuario);
		
		if(usuario != null){
			Doctor doctor = lService.obtenerDatos(usuario);			
			model.addAttribute("usuarioLogin", doctor);		
			model.addAttribute("mensaje", " logueado correctamente");
		}
		else {
			model.addAttribute("mensaje", " logueado incorrectamente");
			return "login";
		}
		return "main";
	}

	@RequestMapping(value="/salir")	
	public String salir(SessionStatus status){		
		status.setComplete();
		return "login";
	}
	
	
	
}
