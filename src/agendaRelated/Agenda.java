package agendaRelated;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

import userRelated.GestionUsuario;
import userRelated.Usuario;

public class Agenda implements IAgenda{
	private String id,nombre;
	private HashMap<Usuario,Fecha> usuarios;
	private Usuario due�o;
	private Scanner scan;
	
	public Agenda(String nombre,Usuario due�o) {
		scan = new Scanner(System.in);
		id = UUID.randomUUID().toString();
		this.nombre = nombre;
		usuarios = new HashMap<>();
		this.due�o = due�o;
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
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Agenda nuevaAgenda(String nombre,Usuario due�o) {
		int opcion = 1;
        do{
            System.out.println("Introduce un nombre para la nueva agenda");
            nombre = scan.nextLine();
            for(int i = 0;i < due�o.getAgendas().size();i++)
                if(due�o.getAgendas().get(i).getNombre() == nombre) opcion = 0;

            if(opcion == 0) System.out.println("Ya existe una agenda con el nombre introducido");

        }while(opcion == 0);

        Agenda agenda = new Agenda(nombre,due�o);
        return agenda;
	}
	
	
	public HashMap getUsuarios() {
		return usuarios;
	}
	
	public Usuario getDue�o() {
		return due�o;
	}

	@Override
	public void a�adirUsuario() {
		String correoAmigo;
		Usuario amigo = null;
		int i = 0;
		System.out.print("Introduce el correo del usuario que deseas añadir a tu agenda");
		correoAmigo = scan.nextLine();
		
		while(amigo == null && i < GestionUsuario.getUsuarios().size()) {
			if(GestionUsuario.getUsuarios().get(i).getCorreo() == correoAmigo)
				amigo = GestionUsuario.getUsuarios().get(i);
			else i++;
		}
		
		if(amigo == null) System.out.println("No se ha encontrado ningun usuario con ese correo");
		else usuarios.put(amigo,new Fecha(new Date()));
	}

	@Override
	public void borrarUsuario(Usuario usuario) {
	}
}
