package david.bootcamp.M6_ABPRO5.model;

import java.util.Date;

/**
 * 
 * @author David Morales Palta
 * @author Leonel Briones Palacios
 * @version 0.0.1b
 *
 */
public class Capacitacion {
	
	//Miembros de Clase
	private int id;
	private Date fecha;
	private String hora;
	private String lugar;
	private int duracion;
	private int rutCliente;
	
	/**
	 * Constructor Predeterminado
	 */
	public Capacitacion() {}

	/**
	 * Contructor Parameterizado
	 * @param id int
	 * @param fecha Date
	 * @param hora String
	 * @param lugar String
	 * @param duracion int
	 * @param rutCliente int
	 */
	public Capacitacion(int id, Date fecha, String hora, String lugar, int duracion, int rutCliente) {
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.rutCliente = rutCliente;
	}

	/**
	 * Método Getter
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método Setter: recibe un valor int
	 * @param id int
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método Getter
	 * @return Date
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Método Setter: recibe un valor Date
	 * @param fecha Date
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Método Getter
	 * @return String
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Método Setter: recibe un valor String
	 * @param hora String
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	/**
	 * Método Getter
	 * @return String
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Método Setter: recibe un valor String
	 * @param lugar String
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * Método Getter
	 * @return int
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Método Setter: recibe un valor int
	 * @param duracion int
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * Método Getter
	 * @return int
	 */
	public int getRutCliente() {
		return rutCliente;
	}

	/**
	 * Método Setter: recibe un valor int
	 * @param rutCliente int
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * Método toString concatena los atributos de clase para devolver un String.
	 * @return String
	 */
	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", rutCliente=" + rutCliente + "]";
	}
	
}
