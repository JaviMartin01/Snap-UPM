package userRelated;

public class Perfil implements IPerfil{
	private String foto,descripcion,alias;
	private Usuario due�o;
	
	public Perfil(String urlFoto,String descripcion,String alias,Usuario due�o) {
		foto = urlFoto;
		this.descripcion = descripcion;
		this.alias = alias;
		this.due�o = due�o;
	}

	@Override
	public Perfil nuevoPerfil(String urlFoto, String descripcion, String alias,Usuario due�o) {
		Perfil nuevo = new Perfil(urlFoto,descripcion,alias,due�o);
		return nuevo;
	}

	@Override
	public String getFoto() {
		return foto;
	}

	@Override
	public void setFoto(String url) {
		foto = url;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public void setDescripcion(String desc) {
		descripcion = desc;
	}

	@Override
	public String getAlias() {
		return alias;
	}

	@Override
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	@Override
	public Usuario getDue�o() {
		return due�o;
	}

	@Override
	public void editarPerfil() {
	}
}
