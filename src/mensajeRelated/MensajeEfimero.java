package mensajeRelated;

import java.util.Date;

public class MensajeEfimero extends MensajePersistente{

	private Date fechaBorrado;
	
	public MensajeEfimero(String texto,Date fechaBorrado) {
		super(texto);
		this.fechaBorrado = fechaBorrado;
	}
}
