package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dominio.LibroDTO;
import gestion.Conexion;


public class LibroDAO {
	//leva todo el código SQL
	//devuelve objetos de una clase libro
	
	public int insertLibro(LibroDTO libro) {
		Connection connection = Conexion.getConnection();
		String sql= "INSERT INTO libros VALUES (?,?,?,?,?,?,?)";
		PreparedStatement sentencia= null ;
		int filasAfectadas = 0;
		try {
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, libro.getCodigo());
			sentencia.setString(2, libro.getAutor());
			sentencia.setString(3, libro.getTitulo());
			sentencia.setString(4, libro.getIsbn());
			sentencia.setString(5, libro.getEditorial());
			sentencia.setInt(6, libro.getNumEjemplares());
			sentencia.setInt(7, libro.getNumPaginas());
			//execute update
			filasAfectadas = sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Conexion.close(connection);
			Conexion.close(sentencia);
		}
		return filasAfectadas;
	} 
	
	public ArrayList<LibroDTO> consultarLibros(){
		Connection connection = Conexion.getConnection();
		Statement sentencia= null;
		ResultSet rs = null;
		String sql= "SELECT * FROM libros ";
		ArrayList<LibroDTO> libros = new ArrayList<LibroDTO>();
		try {
			 sentencia = connection.createStatement();
			 rs = sentencia.executeQuery(sql);
			 while(rs.next()) {
				 LibroDTO libro = new LibroDTO();
				 libro.setCodigo(rs.getInt(1));
				 libro.setAutor(rs.getString(2));
				 libro.setTitulo(rs.getString(3));
				 libro.setIsbn(rs.getString(4));
				 libro.setEditorial(rs.getString(5));
				 libro.setNumEjemplares(rs.getInt(6));
				 libro.setNumPaginas(rs.getInt(7));
				 libros.add(libro);
			 }
		//execute query
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally{
			Conexion.close(rs);
			Conexion.close(sentencia);
			Conexion.close(connection);
		}
		return libros;
	}
	
	public Integer actualizarLibro(LibroDTO libro) {
		Connection connection = Conexion.getConnection();

	
		int filasActualizadas = 0;
		
	    PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(
			  "UPDATE libros SET autor = ?, titulo = ? WHERE idLibros = ? ");
			   // set the preparedstatement parameters
		    ps.setString(1,libro.getAutor());
		    ps.setString(2,libro.getTitulo());
		    ps.setInt(3,libro.getCodigo());
		   filasActualizadas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Conexion.close(ps);
			Conexion.close(connection);;
		}
		return filasActualizadas;
		
	}
	
	
}
