package userRelated;

public interface IPerfil{
	
	Perfil nuevoPerfil(String urlFoto,String descripcion,String alias,Usuario dueño);
	String getFoto();
	void setFoto(String url);
	String getDescripcion();
	void setDescripcion(String desc);
	String getAlias();
	void setAlias(String alias);
	Usuario getDueño();
	void editarPerfil();
}
