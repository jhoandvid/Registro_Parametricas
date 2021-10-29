package co.edu.ucundinamarca.negocio.registro.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name="perfiles")
@Getter
@Setter
@ToString
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long  id_perfil;
    private String nom_perfil;
    private String desc_perfil;
    private Timestamp fec_cambio;
    private Long id_usuario_cambio;



}
