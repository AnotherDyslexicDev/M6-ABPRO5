package david.bootcamp.M6_ABPRO5.dao;

import java.util.logging.Logger;

import david.bootcamp.M6_ABPRO5.model.Capacitacion;

public class CapacitacionDao {
	
	//--- SISTEMA DE LOG PARA REVISIONES ---
	private Logger miLogger = Logger.getLogger(getClass().getName());

	public void crearCapacitacion(Capacitacion capacitacion) {
		miLogger.info("***[!] SE HA CREADO UNA CAPACITACIÓN [!]***");
		System.out.println(capacitacion.toString());
	}
}
