package agrupacionesRelated;

import java.util.ArrayList;

import userRelated.Usuario;

public interface IAgrupacion {
	String getId();
	String getNombre();
	void setNombre(String nombre);
	ArrayList<Usuario> getUsuarios();
}
