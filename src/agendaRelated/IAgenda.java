package agendaRelated;

import userRelated.Usuario;

public interface IAgenda {
	String getId();
	String getNombre();
	void SetNombre(String nombre);
	Agenda nuevaAgenda(String nombre,Usuario due�o);
	void a�adirUsuario();
	void borrarUsuario(Usuario usuario);
}
