package mensajeRelated;

import java.util.Date;
import java.util.UUID;

public class MensajePersistente implements IMensaje{

	private String id,texto;
	private boolean leido;
	private Date fechaEnvio;
	
	public MensajePersistente(String texto) {
		id = UUID.randomUUID().toString();
		this.texto = texto;
		leido = false;
	    fechaEnvio = new Date();
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getTexto() {
		return texto;
	}

	@Override
	public boolean getLeido() {
		return leido;
	}

	@Override
	public void setLeido(boolean b) {
		leido = b;
	}

	@Override
	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	@Override
	public MensajePersistente nuevoMensaje(String texto, Date fechaEnvio) {
		MensajePersistente nuevoMensaje = new MensajePersistente(texto);
		return nuevoMensaje;
	}

}
