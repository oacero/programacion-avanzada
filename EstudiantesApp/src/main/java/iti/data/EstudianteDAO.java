package iti.data;

import iti.componente.Estudiante;
import static iti.connection.ConnectionDB.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


// DAO - Data Access Object
public class EstudianteDAO {

    public List<Estudiante> getAll(){
        List<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        // Sentencias SQL
        String sql = "SELECT * FROM estudiante ORDER BY id";

        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();

                // Setear datos de resultado de consulta
                estudiante.setId(rs.getInt("id"));
                estudiante.setCedula(rs.getString("cedula"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));

                estudiantes.add(estudiante);
            }
        }
        catch (Exception e){
            System.out.println("Error en listar estudiantes: " + e.getMessage());
        }

        finally {
            try{
                con.close();
            }
            catch (Exception e){
                System.out.println("Error en cerrar conexion: " + e.getMessage());
            }

        }

        return estudiantes;

    }

    public boolean add(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();

        // Sentencias SQL
        String sql = "INSERT INTO estudiante(cedula, nombre, apellido, telefono, email)" +
                "VALUES(?, ?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getCedula());
            ps.setString(2, estudiante.getNombre());
            ps.setString(3, estudiante.getApellido());
            ps.setString(4, estudiante.getTelefono());
            ps.setString(5, estudiante.getEmail());
            ps.execute();
            return true;
        }
        catch (Exception e){
            System.out.println("Error en agregar estudiante: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            }
            catch (Exception e){
                System.out.println("Error en cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean edit(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();

        // Sentencias SQL
        String sql = "UPDATE estudiante SET " +
                "cedula=?, nombre=?, apellido=?, telefono=?, email=? " +
                "WHERE id=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getCedula());
            ps.setString(2, estudiante.getNombre());
            ps.setString(3, estudiante.getApellido());
            ps.setString(4, estudiante.getTelefono());
            ps.setString(5, estudiante.getEmail());
            ps.setInt(6, estudiante.getId());
            ps.execute();
            return true;
        }
        catch (Exception e){
            System.out.println("Error en modificar estudiante: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            }
            catch (Exception e){
                System.out.println("Error en cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean delete(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();

        // Sentencias SQL
        String sql = "DELETE FROM estudiante " +
                "WHERE id=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getId());
            ps.execute();
            return true;
        }
        catch (Exception e){
            System.out.println("Error en eliminar estudiante: " + e.getMessage());
        }
        finally {
            try{
                con.close();
            }
            catch (Exception e){
                System.out.println("Error en cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }



    public static void main(String[] args){

        var estudiantesAction = new EstudianteDAO();

        // Agregar estudiante
        /*var newEstudiante = new Estudiante("1711111111", "Maria", "Cajas", "0974174184", "maria@mail.com");
        var addEstudiante = estudiantesAction.add(newEstudiante);

        if(addEstudiante)
            System.out.println("Estudiante agregado exitosamente!!! " + newEstudiante);
        else
            System.out.println("Error al agregar nuevo estudiante: " + newEstudiante);*/

        // Editar estudiante 5
        /*var editEstudiante = new Estudiante(5, "1722222200", "Daniela", "Perez", "0974174184", "daniela@mail.com");

        var moificado = estudiantesAction.edit(editEstudiante);

        if(moificado)
            System.out.println("Estudiante modificado exitosamente!!! " + editEstudiante);
        else
            System.out.println("Error al editar estudiante: " + editEstudiante);*/

        // Eliminar estudiante 4
        var delEstudiante = new Estudiante(4);
        var eliminado = estudiantesAction.delete(delEstudiante);

        if(eliminado)
            System.out.println("Estudiante eliminado exitosamente!!! " + delEstudiante);
        else
            System.out.println("Error al eliminar estudiante: " + delEstudiante);

        // Listar estudiantes
        var estudiantesList = new EstudianteDAO();

        System.out.println("Lita de estudiantes");
        List<Estudiante> estudiantes1 = estudiantesAction.getAll();
        estudiantes1.forEach(System.out::println);

    }
}
