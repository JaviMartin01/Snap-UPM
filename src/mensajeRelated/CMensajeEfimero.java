package mensajeRelated;

import java.util.ArrayList;

public interface CMensajeEfimero {
	void a�adirMensajeEfimeroEnviado(MensajeEfimero m);
	void a�adirMensajeEfimeroRecibido(MensajeEfimero m);
	void borrarMensajeEfimeroEnviado(MensajeEfimero m);
	void borrarMensajeEfimeroRecibido(MensajeEfimero m);
	MensajeEfimero buscarMensajeEfimero(String id);
	ArrayList<MensajeEfimero> getMensajesEfimerosEnviados();
	ArrayList<MensajeEfimero> getMensajesEfimerosRecibidos();
}
