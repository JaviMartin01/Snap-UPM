package userRelated;

public interface IPerfil{
	
	Perfil nuevoPerfil(String urlFoto,String descripcion,String alias,Usuario due�o);
	String getFoto();
	void setFoto(String url);
	String getDescripcion();
	void setDescripcion(String desc);
	String getAlias();
	void setAlias(String alias);
	Usuario getDue�o();
	void editarPerfil();
}
