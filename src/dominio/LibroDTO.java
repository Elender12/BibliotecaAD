package dominio;
import java.util.Date;

public class LibroDTO {
	private int codigo;
	private String titulo;
	private String autor;
	private String editorial;
	private Date anio;
	private String isbn;
	private int numEjemplares;
	private int numPaginas;
	public LibroDTO(int codigo, String titulo, String autor, String editorial, Date anio, String isbn,
			int numEjemplares, int numPaginas) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.anio = anio;
		this.isbn = isbn;
		this.numEjemplares = numEjemplares;
		this.numPaginas = numPaginas;
	}
	public LibroDTO() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Date getAnio() {
		return anio;
	}
	public void setAnio(Date anio) {
		this.anio = anio;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return "LibroDTO [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", anio=" + anio + ", isbn=" + isbn + ", numEjemplares=" + numEjemplares + ", numPaginas="
				+ numPaginas + "]";
	}

	
}
