package core;

import java.util.Scanner;

import userRelated.GestionUsuario;
import userRelated.Usuario;

public class PruebaAceptacion {

	private Scanner scan;
	private GestionUsuario gU;
	public PruebaAceptacion() {
		scan = new Scanner(System.in);
		gU = new GestionUsuario();
		System.out.println("Bienvenid@ a la demo de SnapUPM");
		System.out.println("::::::::::::::::::::::::::::::\n\n");
		MostrarMenu();
	}
	
	private void MostrarMenu() {
		System.out.println("Por favor, decida que hacer");
		int opcion = 0;
		do {
			System.out.println("1.Añadir un usuario\n2.Comprobar usuarios existentes\n3.Salir");
			opcion = scan.nextInt();
			switch(opcion) {
			
			case 1:
				GestionUsuario.DarDeAlta();
				break;
			case 2:
				ComprobarUsuarios();
				break;
			}
			
			if(opcion == 1 || opcion == 2) {
				System.out.println("Desea hacer algo más(1->Sí/2->No)?");
				opcion = scan.nextInt();
			}
			if(opcion != 1) opcion = 0;
			else System.out.println("\n\n\n");
		}while(opcion != 0);
		System.out.println("\nSaliendo de la demo de SnapUPM...");
	}
	
	private void ComprobarUsuarios() {
		if(GestionUsuario.getUsuarios().size() == 0)
			System.out.println("No existen usuarios actualmente");
		else {
			System.out.println("Mostrando informacion de los usuarios:");
			for(int i = 0;i < GestionUsuario.getUsuarios().size();i++)
			{
				Usuario u = GestionUsuario.getUsuarios().get(i);
				System.out.println("    Usuario: " + u.getNombre() + " " + u.getApellidos());
				System.out.println("    Id: " + u.getId());
				System.out.println("    Correo: " + u.getCorreo());
				System.out.println("    Contraseña: " + u.getContrase�a());
				System.out.println("\n");
		    }
	   }
   }
}