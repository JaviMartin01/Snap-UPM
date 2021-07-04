package agrupacionesRelated;

import java.util.ArrayList;

public interface CAgrupacion {
	void añadirAgrupacion(Agrupacion a);
	void borrarAgrupacion(Agrupacion a);
	Agrupacion buscarAgrupacion(String id);
	ArrayList<Agrupacion> getAgrupaciones();
}
