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

    public static void main(String[] args){

        var estudiantesList = new EstudianteDAO();
        // Listar estudiantes

        System.out.println("Lita de estudiantes");

        List<Estudiante> estudiantes1 = estudiantesList.getAll();

        estudiantes1.forEach(System.out::println);

    }

}
