package agendaRelated;

import java.util.ArrayList;

public interface CAgenda {
	void aņadirAgenda(Agenda agenda);
	void borrarAgenda(Agenda agenda);
	Agenda buscarAgenda(String id);
	ArrayList getAgendas();
}
