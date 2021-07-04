package userRelated;

public interface IUsuario {
	String getId();
	String getNombre();
	void setNombre(String nombre);
	String getApellidos();
	void setApellidos(String apellidos);
	String getContraseña();
	void setContraseña(String contraseña);
	String getCorreo();
	void setCorreo(String correo);
	boolean estadoConexion();
	void setEstadoConexion(boolean b);
	Usuario nuevoUsuario(String nombre,String apellidos,String correo,String contraseña);
}
