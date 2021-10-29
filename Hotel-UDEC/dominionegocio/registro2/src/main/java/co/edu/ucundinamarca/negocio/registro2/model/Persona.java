package co.edu.ucundinamarca.negocio.registro2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="personas")
@Getter
@Setter
@ToString
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id_persona;
    private  String pri_nombre;
    private String seg_nombre;
    private String pri_apellido;
    private String seg_apellido;
    private String razon_social;
    private String direccion;
    private String correo;
    private Long identificacion;
    private Character genero;
    private Timestamp fec_cambio;


}
