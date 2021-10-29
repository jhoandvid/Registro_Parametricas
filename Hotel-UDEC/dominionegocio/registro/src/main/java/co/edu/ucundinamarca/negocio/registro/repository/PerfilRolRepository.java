package co.edu.ucundinamarca.negocio.registro.repository;

import co.edu.ucundinamarca.negocio.registro.model.PerfilRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRolRepository extends JpaRepository<PerfilRol, Long> {

}
