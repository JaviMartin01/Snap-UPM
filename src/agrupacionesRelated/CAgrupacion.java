package agrupacionesRelated;

import java.util.ArrayList;

public interface CAgrupacion {
	void a�adirAgrupacion(Agrupacion a);
	void borrarAgrupacion(Agrupacion a);
	Agrupacion buscarAgrupacion(String id);
	ArrayList<Agrupacion> getAgrupaciones();
}
