package iti.libros.servicio;

import iti.libros.modelo.Libro;

import java.util.List;

public interface ILibroServicio {
    public List<Libro> listarLibros();

    public Libro findLibroById(Integer idLibro);

    public void saveLibro(Libro libro);

    public void deleteLibro(Libro libro);
}
