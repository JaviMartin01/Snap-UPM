package mensajeRelated;

import java.util.Date;

public interface IMensaje {
	String getId();
	String getTexto();
	boolean getLeido();
	void setLeido(boolean b);
	Date getFechaEnvio();
	MensajePersistente nuevoMensaje(String texto,Date fechaEnvio);
}
