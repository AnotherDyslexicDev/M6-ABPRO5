package david.bootcamp.M6_ABPRO5.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListarCapacitacionesController {
	@RequestMapping(value="/listarCapacitaciones", method = RequestMethod.GET)
	public ModelAndView listarCapacitaciones(HttpServletResponse response) throws IOException{
		
		// Creamos una lista de capacitaciones
		List<Map<String, String>> capacitaciones = new ArrayList<Map<String, String>>();
		
		// Creamos una capacitación
		Map<String, String> capacitacion1 = new HashMap<String, String>();
		capacitacion1.put("idcapacitacion", "1");
		capacitacion1.put("capfecha", "2023-05-15");
		capacitacion1.put("caphora", "10:00");
		capacitacion1.put("caplugar", "Santiago");
		capacitacion1.put("capduracion", "2 horas");
		capacitacion1.put("cliente_rut_cliente", "76.543.210-K");
		capacitacion1.put("capnombre", "Introducción a Spring Boot");
		capacitacion1.put("capasistentes", "20");
		
		// Agregamos la capacitación a la lista
		capacitaciones.add(capacitacion1);
		
		// Creamos otra capacitación
		Map<String, String> capacitacion2 = new HashMap<String, String>();
		capacitacion2.put("idcapacitacion", "2");
		capacitacion2.put("capfecha", "2023-05-20");
		capacitacion2.put("caphora", "14:00");
		capacitacion2.put("caplugar", "Viña del Mar");
		capacitacion2.put("capduracion", "3 horas");
		capacitacion2.put("cliente_rut_cliente", "99.876.543-2");
		capacitacion2.put("capnombre", "Introducción a HTML y CSS");
		capacitacion2.put("capasistentes", "15");
		
		// Agregamos la capacitación a la lista
		capacitaciones.add(capacitacion2);
		
		// Creamos el ModelAndView y le pasamos las capacitaciones como atributo
		ModelAndView modelAndView = new ModelAndView("listarCapacitaciones");
		modelAndView.addObject("capacitaciones", capacitaciones);
		
		return modelAndView;
	}
}
