package iti.empleados.controlador;

import iti.empleados.modelo.Empleado;
import iti.empleados.servicio.EmpleadoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(IndexControlador.class);
    @Autowired
    EmpleadoServicio empleadoServicio;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String iniciar(ModelMap modelo){
        List<Empleado> empleados = empleadoServicio.listarEmpleados();
        //return empleados;
        empleados.forEach(empleado -> logger.info(empleado.toString()));

        //Compartir datos de consulta con la vista
        modelo.put("empleados", empleados);

        return "index"; // index.jsp
    }

    @RequestMapping(value="/agregar", method = RequestMethod.GET)
    public String viewAddForm(){
        return "add"; //add.jsp
    }


}
