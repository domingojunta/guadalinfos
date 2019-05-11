package es.domingojunta.Guadalinfos;

import java.util.Scanner;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



public class ObtenerClaves {

	public static void main(String[] args) {
		
		String rawPassword="";
		Scanner in = new Scanner(System.in);   
		System.out.println("Introduce la Contraseña a codificar: ");
		rawPassword = in.nextLine();
		System.out.println("La contraseña sin encriptar es: ");
		System.out.println(rawPassword);
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashPassword = encoder.encode(rawPassword);
		System.out.println("La clave encriptada es: ");
		System.out.println(hashPassword);
		System.out.println("Y su longitud es de: "+hashPassword.length());
		
		

	}

}
