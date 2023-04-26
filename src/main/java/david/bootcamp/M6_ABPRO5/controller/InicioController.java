package david.bootcamp.M6_ABPRO5.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.LoggerFactory;

@Controller
@Slf4j
public class InicioController {
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		log.info("Se accedió al ROOT DEL PROYECTO");
		return new ModelAndView("inicio");
	}
}
