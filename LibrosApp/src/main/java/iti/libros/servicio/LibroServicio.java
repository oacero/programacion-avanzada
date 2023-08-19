package iti.libros.servicio;

import iti.libros.modelo.Libro;
import iti.libros.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio implements ILibroServicio{

    @Autowired
    private LibroRepositorio libroRepositorio;
    @Override
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro findLibroById(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
        return libro;
    }

    @Override
    public void saveLibro(Libro libro) {
        libroRepositorio.save(libro);
    }

    @Override
    public void deleteLibro(Libro libro) {
        libroRepositorio.delete(libro);
    }
}
