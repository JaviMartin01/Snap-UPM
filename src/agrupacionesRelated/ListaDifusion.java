package agrupacionesRelated;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import userRelated.Usuario;

public class ListaDifusion extends Agrupacion implements IListaDifusion{

	private Usuario creador;
	private Date fechaBorrado;
	
	public ListaDifusion(String nombre,Date fechaBorrado,Usuario creador) {
		id = UUID.randomUUID().toString();
		this.nombre = nombre;
		this.fechaBorrado = fechaBorrado;
		this.creador = creador;
		mensajesPersistentes = new ArrayList<>();
		mensajesEfimeros = new ArrayList<>();
	}
	
	@Override
	public Date getFechaBorrado() {
		return fechaBorrado;
	}

	@Override
	public void setFechaBorrado(Date fechaBorrado) {
		this.fechaBorrado = fechaBorrado;
	}

	@Override
	public Usuario getCreador() {
		return creador;
	}

	@Override
	public ListaDifusion nuevaListaDifusion(String nombre, Date fechaBorrado, Usuario creador) {
		ListaDifusion nuevaLista = new ListaDifusion(nombre,fechaBorrado,creador);
		return nuevaLista;
	}

}
