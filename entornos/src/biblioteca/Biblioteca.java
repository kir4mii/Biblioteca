package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public void agregarLibro(Libro l) {
        listaLibros.add(l);
        System.out.println("Libro añadido con éxito.");
    }

    public void mostrarLibros() {
        for (Libro l : listaLibros) {
            System.out.println(l);
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro l = listaLibros.get(i);
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }


}