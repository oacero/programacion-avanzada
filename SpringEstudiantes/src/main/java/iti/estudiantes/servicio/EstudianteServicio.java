package iti.estudiantes.servicio;

import iti.estudiantes.modelo.Estudiante;
import iti.estudiantes.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio{

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public Estudiante findEsudiante(Integer idEstudiante) {
        Estudiante estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiante;
    }

    @Override
    public void saveEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void deleteEstudiante(Estudiante estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
}
