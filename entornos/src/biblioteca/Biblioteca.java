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
    
    public void eliminarLibro(Libro l) {
        listaLibros.remove(l);
        System.out.println("Libro eliminado de la biblioteca.");
    }

    public boolean reservarLibro(String titulo) {
        for (Libro l : listaLibros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                if (!l.isReservado()) {
                    l.setReservado(false);
                    System.out.println("Libro reservado con éxito.");
                    return true;
                } else {
                    System.out.println("El libro ya está reservado.");
                    return false;
                }
            }
        }
        System.out.println("Libro no encontrado.");
        return false;
    }

  


}