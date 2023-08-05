package iti.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection getConnection(){
        Connection connect = null;

        var dataBase = "estudiantesdb";
        var url = "jdbc:mysql://localhost:3307/" + dataBase;
        var username = "root";
        var password = "";

        // Cargar driver de conexion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, username, password);
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en conexion a BD: " + e.getMessage());
        }

        return connect;
    }


    public static void main(String[]args){
        var conexion = ConnectionDB.getConnection();

        if(conexion != null)
            System.out.println("Conexion satisfactoria: " + conexion);
        else
            System.out.println("Error al conectar al BD");

    }

}
