package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import dao.LibroDAO;

public class Principal {

	public static void main(String[] args) {
		// TODO va el menú test 
		//se crea un libro y ubn socio (objeto)
		LibroDAO consulta = new LibroDAO();
		
		
		LibroDTO libro = new LibroDTO (6889,"Libro brujería V2", "Lucifer", "Fuego", new Date(), "001141114110", 75,666);	
		/*
		int filasAfectadas = consulta.insertLibro(libro);
		if(filasAfectadas == 1) {
			System.out.println("Libro introducido correctamente");
			
		}else {
			System.out.println("No se pudo introducir el libro.");
		} 
		ArrayList<LibroDTO> libros = new ArrayList<LibroDTO>();
		libros = consulta.consultarLibros();
		for (LibroDTO libroDTO : libros) {
			System.out.println(libroDTO.toString()+"\n");
		}*/
		int filasActualizadas = consulta.actualizarLibro(libro);
		if(filasActualizadas == 1) {
			System.out.println("Libro actualizado correctamente");
			
		}else {
			System.out.println("No se pudo actualizar el libro.");
		} 
	
	}

}
