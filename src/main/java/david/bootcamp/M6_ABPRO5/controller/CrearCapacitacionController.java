package david.bootcamp.M6_ABPRO5.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import david.bootcamp.M6_ABPRO5.dao.CapacitacionDao;
import david.bootcamp.M6_ABPRO5.model.Capacitacion;

@Controller
public class CrearCapacitacionController {
	@RequestMapping(value="/crearCapacitacion")
	public ModelAndView crearCapacitacion(HttpServletResponse response) throws IOException{
		
		Capacitacion capacitacion = new Capacitacion();
		
		CapacitacionDao capaDAO = new CapacitacionDao();
		capaDAO.crearCapacitacion(capacitacion);
		
		return new ModelAndView("crearCapacitacion");
	}
}

