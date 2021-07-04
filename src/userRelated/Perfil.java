package userRelated;

public class Perfil implements IPerfil{
	private String foto,descripcion,alias;
	private Usuario dueño;
	
	public Perfil(String urlFoto,String descripcion,String alias,Usuario dueño) {
		foto = urlFoto;
		this.descripcion = descripcion;
		this.alias = alias;
		this.dueño = dueño;
	}

	@Override
	public Perfil nuevoPerfil(String urlFoto, String descripcion, String alias,Usuario dueño) {
		Perfil nuevo = new Perfil(urlFoto,descripcion,alias,dueño);
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
	public Usuario getDueño() {
		return dueño;
	}

	@Override
	public void editarPerfil() {
	}
}
