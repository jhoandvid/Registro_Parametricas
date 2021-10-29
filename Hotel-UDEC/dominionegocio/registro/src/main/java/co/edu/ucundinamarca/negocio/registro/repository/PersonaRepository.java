package co.edu.ucundinamarca.negocio.registro.repository;

import co.edu.ucundinamarca.negocio.registro.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
