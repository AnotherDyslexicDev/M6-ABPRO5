package david.bootcamp.M6_ABPRO5.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrearCapacitacionController {
	@RequestMapping(value="/crearCapacitacion")
	public ModelAndView crearCapacitacion(HttpServletResponse response) throws IOException{
		return new ModelAndView("crearCapacitacion");
	}
}

