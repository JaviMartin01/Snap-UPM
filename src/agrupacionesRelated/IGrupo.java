package agrupacionesRelated;

public interface IGrupo {
	String getAvatar();
	void setAvatar(String url);
	Grupo nuevoGrupo(String nombre,String avatar);
}
