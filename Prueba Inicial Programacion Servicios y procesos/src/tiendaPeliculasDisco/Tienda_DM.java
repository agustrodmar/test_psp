package tiendaPeliculasDisco;
import java.util.Scanner;

public class Tienda_DM {

	public Tienda_DM() { //Constructor
		
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int seleccionar;
		
		System.out.println(".:Menú:.\n"
				+ "1. Listar los discos\n"
				+ "2. Listar las películas\n"
				+ "3. Comprar una película o disco\n"
				+ "4. Listar los clientes\n"
				+ "5. Salir\n");
		
		seleccionar = entrada.nextInt();
		
		
	}
	
}

