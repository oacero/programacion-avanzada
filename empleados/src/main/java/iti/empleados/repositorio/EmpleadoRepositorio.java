package iti.empleados.repositorio;

import iti.empleados.EmpleadosApplication;
import iti.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
