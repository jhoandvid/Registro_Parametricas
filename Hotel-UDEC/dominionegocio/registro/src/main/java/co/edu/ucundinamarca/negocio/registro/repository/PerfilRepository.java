package co.edu.ucundinamarca.negocio.registro.repository;

import co.edu.ucundinamarca.negocio.registro.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
