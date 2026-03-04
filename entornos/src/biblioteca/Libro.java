package biblioteca;

public class Libro {

	private String titulo; 
	private String autor; 
	private boolean reservado; 
	
	public Libro(String titulo, String autor, boolean reservado) {
		this.titulo = titulo; 
		this.autor = autor; 
		this.reservado = reservado; 
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

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
}
