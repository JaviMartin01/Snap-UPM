package agrupacionesRelated;

import java.util.ArrayList;

import mensajeRelated.MensajeEfimero;
import mensajeRelated.MensajePersistente;
import userRelated.Usuario;

public class Agrupacion implements IAgrupacion{
	protected String id,nombre;
	protected ArrayList<Usuario> usuarios;
	protected ArrayList<MensajePersistente> mensajesPersistentes;
	protected ArrayList<MensajeEfimero> mensajesEfimeros;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
}
