package co.edu.ucundinamarca.negocio.registro2.Repository;

import co.edu.ucundinamarca.negocio.registro2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository  extends JpaRepository<Persona, Long> {


}
