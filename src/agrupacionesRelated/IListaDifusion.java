package agrupacionesRelated;

import java.util.Date;

import userRelated.Usuario;

public interface IListaDifusion {
	Date getFechaBorrado();
	void setFechaBorrado(Date fechaBorrado);
	Usuario getCreador();
	ListaDifusion nuevaListaDifusion(String nombre,Date fechaBorrado,Usuario creador);
}
