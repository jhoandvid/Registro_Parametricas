package co.edu.ucundinamarca.negocio.registro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@ToString
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id_usuario;
    private String clave;
    private String Login;
    private Timestamp fec_cambio;
    private String id_usuario_cambio;
    private Boolean verificado_correo;
    @ManyToOne
    @JoinColumn(name="id_persona")
    private Persona idpersona;//llave foranea

    @ManyToOne
    @JoinColumn(name="id_perfil")
    private Perfil idperfil;


}
