package userRelated;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionUsuario {
	
	//referencia a la base de datos
	private static Scanner scan;
	private static ArrayList<Usuario> usuarios;
	
	public GestionUsuario()
	{
		scan = new Scanner(System.in);
		usuarios = new ArrayList<>();
	}
	public static void DarDeAlta() {
		String correo;
		System.out.println("Introduce tu correo: ");
		correo = scan.nextLine();
        if(!validarCorreo(correo)) System.out.println("El correo introducido no pertenece a la UPM");
        else{
            String nombre,apellidos,contrase�a;

            System.out.println("Introduce tu nombre:");
            nombre = scan.nextLine();
            System.out.println("Introduce tus apellidos");
            apellidos = scan.nextLine();
            
            do{
                System.out.println("Intoduce tu contraseña:");
                contrase�a = scan.nextLine();
                System.out.println("Vuelve a introducir tu contraseña:");
                contrase�a = (contrase�a.compareTo(scan.nextLine()) == 0) ? contrase�a : null;
                if(contrase�a == null) System.out.println("Las contraseñas no coinciden\n");
            }while(contrase�a == null);
            
            utilidades.Cifrado.cifrar(contrase�a);
            
            try {
                Usuario nuevoUsuario = new Usuario(nombre,apellidos,contrase�a,correo);
                usuarios.add(nuevoUsuario);
                //Insert en la base de datos
                System.out.println("El usuario ha sido creado correctamente");
            }catch (Exception e){
                System.out.println("El usuario no ha podido ser creado correctamente");
            }
        }
	}
	
	public static void iniciarSesion(Usuario usuario) {
		
	}
	public static void cerrarSesion(Usuario usuario) {
		
	}
	public static void cambiarContrase�a(Usuario usuario) {
		
	}
	
	private static boolean validarCorreo(String correo) {
		
		servidor.Autenticacion a = new servidor.Autenticacion();
		return a.existeCuentaUPM(correo);
	}
	
	public static ArrayList<Usuario> getUsuarios(){
		return usuarios;
	}
	
	public static Usuario getUsuario(String id) {
		Usuario usuario = null;
		int i = 0;
		while(usuario == null && i < usuarios.size())
			if(usuarios.get(i).getId() == id) usuario = usuarios.get(i);
		return usuario;
	}
}
