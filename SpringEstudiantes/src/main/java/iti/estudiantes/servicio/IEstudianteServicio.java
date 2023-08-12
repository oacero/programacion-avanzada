package iti.estudiantes.servicio;

import iti.estudiantes.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {
    public List<Estudiante> listarEstudiantes();

    public Estudiante findEsudiante(Integer idEstudiante);

    public void saveEstudiante(Estudiante estudiante);

    public void deleteEstudiante(Estudiante estudiante);
}
