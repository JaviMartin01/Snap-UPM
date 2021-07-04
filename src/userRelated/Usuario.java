package userRelated;

import java.util.ArrayList;
import java.util.UUID;

import agendaRelated.Agenda;
import agendaRelated.CAgenda;
import agrupacionesRelated.Agrupacion;
import agrupacionesRelated.CAgrupacion;
import mensajeRelated.CMensajeEfimero;
import mensajeRelated.CMensajePersistente;
import mensajeRelated.MensajeEfimero;
import mensajeRelated.MensajePersistente;

public class Usuario implements IUsuario,CPerfil,CAgenda,CMensajePersistente,CMensajeEfimero,CAgrupacion{
	
	private String id,nombre,apellidos,contraseña,correo;
	private boolean estadoConexion; // true -> conectado  false -> desconectado
	private Perfil miPerfil;
	private ArrayList<Agenda> misAgendas;
	private ArrayList<MensajePersistente> mensajesPersistentesEnviados;
	private ArrayList<MensajePersistente> mensajesPersistentesRecibidos;
	private ArrayList<MensajeEfimero> mensajesEfimerosEnviados;
	private ArrayList<MensajeEfimero> mensajesEfimerosRecibidos;
	private ArrayList<Agrupacion> agrupaciones;
	
	public Usuario(String nombre,String apellidos,String contraseña,String correo) {
		id = UUID.randomUUID().toString();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contraseña = contraseña;
		this.correo = correo;
		estadoConexion = false;
		miPerfil = null;
		
		misAgendas = new ArrayList<>();
		mensajesPersistentesEnviados = new ArrayList<>();
		mensajesPersistentesRecibidos = new ArrayList<>();
		mensajesEfimerosEnviados = new ArrayList<>();
		mensajesEfimerosRecibidos = new ArrayList<>();
		agrupaciones = new ArrayList<>();
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		return apellidos;
	}

	@Override
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String getContraseña() {
		return contraseña;
	}

	@Override
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	@Override
	public String getCorreo() {
		return correo;
	}

	@Override
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public boolean estadoConexion() {
		return estadoConexion;
	}

	@Override
	public void setEstadoConexion(boolean b) {
		estadoConexion = b;
	}

	@Override
	public Usuario nuevoUsuario(String nombre, String apellidos, String correo, String contraseña) {
		Usuario nuevo = new Usuario(nombre,apellidos,correo,contraseña);
		GestionUsuario.getUsuarios().add(nuevo);
		return nuevo;
	}
	
	public Perfil getPerfil() {
		return miPerfil;
	}

	@Override
	public void añadirPerfil(Perfil perfil) {
		miPerfil = perfil;
	}

	@Override
	public void borrarPerfil(Perfil perfil) {
		miPerfil = null;
	}

	@Override
	public void añadirAgenda(Agenda agenda) {
		misAgendas.add(agenda);
	}

	@Override
	public void borrarAgenda(Agenda agenda) {
		misAgendas.remove(agenda);
	}

	@Override
	public Agenda buscarAgenda(String id) {
		Agenda a = null;
		int i = 0;
		while(i < misAgendas.size() && a == null)
		{
			if(id.compareTo(misAgendas.get(i).getId()) == 0)
				a = misAgendas.get(i);
			i++;
		}
		return a;
	}

	@Override
	public ArrayList<Agenda> getAgendas() {
		return misAgendas;
	}

	@Override
	public void añadirMensajePersistenteEnviado(MensajePersistente m) {
		mensajesPersistentesEnviados.add(m);
	}
	
	@Override
	public void añadirMensajePersistenteRecibido(MensajePersistente m) {
		mensajesPersistentesRecibidos.add(m);
	}

	@Override
	public void borrarMensajePersistenteEnviado(MensajePersistente m) {
		mensajesPersistentesEnviados.remove(m);
	}
	@Override
	public void borrarMensajePersistenteRecibido(MensajePersistente m) {
		mensajesPersistentesRecibidos.remove(m);
	}

	@Override
	public MensajePersistente buscarMensajePersistente(String id) {
		MensajePersistente mp = null;
		int i = 0;
		while(i < mensajesPersistentesEnviados.size() && mp == null)
		{
			if(id.compareTo(mensajesPersistentesEnviados.get(i).getId()) == 0)
				mp = mensajesPersistentesEnviados.get(i);
			i++;
		}
		
		if(mp != null) return mp;
		i = 0;
		while(i < mensajesPersistentesRecibidos.size() && mp == null)
		{
			if(id.compareTo(mensajesPersistentesRecibidos.get(i).getId()) == 0)
				mp = mensajesPersistentesRecibidos.get(i);
			i++;
		}
		
		return mp;
	}

	@Override
	public ArrayList<MensajePersistente> getMensajesPersistentesEnviados() {
		return mensajesPersistentesEnviados;
	}
	
	@Override
	public ArrayList<MensajePersistente> getMensajesPersistentesRecibidos() {
		return mensajesPersistentesRecibidos;
	}

	@Override
	public void añadirMensajeEfimeroEnviado(MensajeEfimero m) {
		mensajesEfimerosEnviados.add(m);
	}
	
	@Override
	public void añadirMensajeEfimeroRecibido(MensajeEfimero m) {
		mensajesEfimerosRecibidos.add(m);
	}

	@Override
	public void borrarMensajeEfimeroEnviado(MensajeEfimero m) {
		mensajesEfimerosEnviados.remove(m);
	}
	
	@Override
	public void borrarMensajeEfimeroRecibido(MensajeEfimero m) {
		mensajesEfimerosRecibidos.remove(m);
	}

	@Override
	public MensajeEfimero buscarMensajeEfimero(String id) {
		MensajeEfimero me = null;
		int i = 0;
		while(i < mensajesEfimerosEnviados.size() && me == null)
		{
			if(id.compareTo(mensajesEfimerosEnviados.get(i).getId()) == 0)
				me = mensajesEfimerosEnviados.get(i);
			i++;
		}
		
		if(me != null) return me;
		i = 0;
		while(i < mensajesEfimerosRecibidos.size() && me == null)
		{
			if(id.compareTo(mensajesEfimerosRecibidos.get(i).getId()) == 0)
				me = mensajesEfimerosRecibidos.get(i);
			i++;
		}
		
		return me;
	}

	@Override
	public ArrayList<MensajeEfimero> getMensajesEfimerosEnviados() {
		return mensajesEfimerosEnviados;
	}
	
	@Override
	public ArrayList<MensajeEfimero> getMensajesEfimerosRecibidos() {
		return mensajesEfimerosRecibidos;
	}

	@Override
	public void añadirAgrupacion(Agrupacion a) {
		agrupaciones.add(a);
	}

	@Override
	public void borrarAgrupacion(Agrupacion a) {
		agrupaciones.remove(a);
	}

	@Override
	public Agrupacion buscarAgrupacion(String id) {
		Agrupacion a = null;
		int i = 0;
		while(i < agrupaciones.size() && a == null) {
			if(id.compareTo(agrupaciones.get(i).getId()) == 0)
				a = agrupaciones.get(i);
		}
		return a;
	}

	@Override
	public ArrayList<Agrupacion> getAgrupaciones() {
		return agrupaciones;
	}
	
}
