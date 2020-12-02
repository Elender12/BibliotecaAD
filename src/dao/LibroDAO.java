package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dominio.LibroDTO;
import gestion.Conexion;


public class LibroDAO {
	//leva todo el código SQL
	//devuelve objetos de una clase libro
	public void insertLibro(LibroDTO libro) {
		Connection connection = Conexion.getConnection();
		String sql= "INSERT INTO libros VALUES (?,?,?,?,?)";
		try {
			PreparedStatement sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, libro.getCodigo());
			sentencia.setString(2, libro.getAutor());
			sentencia.setString(3, libro.getTitulo());
			sentencia.setString(4, libro.getIsbn());
			sentencia.setString(5, libro.getEditorial());
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
