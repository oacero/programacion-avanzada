package iti.estudiantes.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
