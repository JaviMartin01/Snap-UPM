package agendaRelated;

import java.util.ArrayList;

public interface CAgenda {
	void a�adirAgenda(Agenda agenda);
	void borrarAgenda(Agenda agenda);
	Agenda buscarAgenda(String id);
	ArrayList getAgendas();
}
