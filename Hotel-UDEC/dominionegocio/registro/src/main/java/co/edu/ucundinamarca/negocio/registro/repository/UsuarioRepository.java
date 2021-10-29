package co.edu.ucundinamarca.negocio.registro.repository;
import co.edu.ucundinamarca.negocio.registro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
