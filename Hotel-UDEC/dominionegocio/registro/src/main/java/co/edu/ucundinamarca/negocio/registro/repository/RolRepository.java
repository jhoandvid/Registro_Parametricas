package co.edu.ucundinamarca.negocio.registro.repository;

import co.edu.ucundinamarca.negocio.registro.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}
