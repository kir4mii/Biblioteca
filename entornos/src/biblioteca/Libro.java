package biblioteca;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
 
    
    public String getTitulo() {
		return titulo;
	}


	@Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor;
    }
}