package co.edu.ucundinamarca.negocio.registro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="roles")
@Getter
@Setter
@ToString
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id_rol;
    private String nom_rol;
    private String desc_rol;
    private Timestamp fec_cambio;
    private Long id_usuario_cambio;

   // @ManyToMany
    //@JoinColumn(name="id_perfil")
    //private List<Perfil> idperfil;


}
