package david.bootcamp.M6_ABPRO5.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
	
	private static final Logger logger = Logger.getLogger(InicioController.class);
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{

		return new ModelAndView("inicio");
	}
}
