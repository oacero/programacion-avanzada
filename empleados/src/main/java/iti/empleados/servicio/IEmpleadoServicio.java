package iti.empleados.servicio;

import iti.empleados.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();

    public Empleado findEmpleado(Integer idEmpleado);

    public void saveEmpleado(Empleado empleado);

    public void deleteEmpleado(Empleado empleado);

}
