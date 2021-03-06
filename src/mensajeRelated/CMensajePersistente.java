package mensajeRelated;

import java.util.ArrayList;

public interface CMensajePersistente {
	void aņadirMensajePersistenteEnviado(MensajePersistente m);
	void aņadirMensajePersistenteRecibido(MensajePersistente m);
	void borrarMensajePersistenteEnviado(MensajePersistente m);
	void borrarMensajePersistenteRecibido(MensajePersistente m);
	MensajePersistente buscarMensajePersistente(String id);
	ArrayList<MensajePersistente> getMensajesPersistentesEnviados();
	ArrayList<MensajePersistente> getMensajesPersistentesRecibidos();
}
