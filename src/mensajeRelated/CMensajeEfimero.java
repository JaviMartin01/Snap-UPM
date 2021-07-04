package mensajeRelated;

import java.util.ArrayList;

public interface CMensajeEfimero {
	void añadirMensajeEfimeroEnviado(MensajeEfimero m);
	void añadirMensajeEfimeroRecibido(MensajeEfimero m);
	void borrarMensajeEfimeroEnviado(MensajeEfimero m);
	void borrarMensajeEfimeroRecibido(MensajeEfimero m);
	MensajeEfimero buscarMensajeEfimero(String id);
	ArrayList<MensajeEfimero> getMensajesEfimerosEnviados();
	ArrayList<MensajeEfimero> getMensajesEfimerosRecibidos();
}
