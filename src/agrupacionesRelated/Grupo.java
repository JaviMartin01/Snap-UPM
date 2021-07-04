package agrupacionesRelated;

import java.util.ArrayList;
import java.util.UUID;

public class Grupo extends Agrupacion implements IGrupo{
	private String avatar;
	
	public Grupo(String nombre,String urlAvatar) {
		id = UUID.randomUUID().toString();
		this.nombre = nombre;
		avatar = urlAvatar;
		mensajesPersistentes = new ArrayList<>();
		mensajesEfimeros = new ArrayList<>();
	}

	@Override
	public String getAvatar() {
		return avatar;
	}

	@Override
	public void setAvatar(String url) {
		avatar = url;
	}

	@Override
	public Grupo nuevoGrupo(String nombre, String avatar) {
		Grupo nuevoGrupo = new Grupo(nombre,avatar);
		return nuevoGrupo;
	}
}
