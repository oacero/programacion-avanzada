package iti.empleados.servicio;

import iti.empleados.modelo.Empleado;
import iti.empleados.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio implements IEmpleadoServicio{
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;
    @Override
    public List<Empleado> listarEmpleados() {
        List<Empleado> empleados = empleadoRepositorio.findAll();
        return empleados;
    }

    @Override
    public Empleado findEmpleado(Integer idEmpleado) {
        Empleado empleado = empleadoRepositorio.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public void saveEmpleado(Empleado empleado) {
        empleadoRepositorio.save(empleado);
    }

    @Override
    public void deleteEmpleado(Empleado empleado) {
        empleadoRepositorio.delete(empleado);
    }
}
