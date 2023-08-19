package iti.libros.vista;

import iti.libros.servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

@Component
public class LibroForm extends JFrame {

    LibroServicio libroServicio;
    private JPanel panel;
    private JTable tableLibros;

    private DefaultTableModel tablaListaLibros;

    @Autowired
    public LibroForm(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        initForm();
    }

    private void initForm(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 600);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth() / 2);
        int y = (screenSize.height = getHeight() / 2);
        setLocation(x, y);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.tablaListaLibros = new DefaultTableModel(0, 6);
        String[] headers = {"ID", "Libro", "Autor", "Año", "Precio USD", "Existencia"};
        tablaListaLibros.setColumnIdentifiers(headers);

        // Instanciar objeto JTable
        this.tableLibros = new JTable(tablaListaLibros);

        listLibros();
    }

    private void listLibros(){
        // reset tabla
        tablaListaLibros.setRowCount(0);

        // Obtenemos libros ingresados
        var libros = libroServicio.listarLibros();
        libros.forEach((libro)->{
            Object[] filaLibro = {
                    libro.getId(),
                    libro.getNombreLibro(),
                    libro.getAutor(),
                    libro.getAnioPublicacion(),
                    libro.getPrecio(),
                    libro.getExistencia()
            };
            this.tablaListaLibros.addRow(filaLibro);
        });
    }
}
