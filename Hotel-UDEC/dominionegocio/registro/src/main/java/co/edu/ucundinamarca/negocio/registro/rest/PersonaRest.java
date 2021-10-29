package co.edu.ucundinamarca.negocio.registro.rest;
import co.edu.ucundinamarca.negocio.registro.model.Persona;
import co.edu.ucundinamarca.negocio.registro.repository.PersonaRepository;
import co.edu.ucundinamarca.negocio.registro.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel/persona")
public class PersonaRest {
    @Autowired
    private PersonaService personaService;

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> getPersona() {
        return ResponseEntity.ok().body(personaService.findAll());
    }

    @PostMapping("/agregar")
    Persona create(@RequestBody Persona persona){
        return personaService.guardar(persona);
    }
    @DeleteMapping ("/eliminar/{id_persona}")
    void delete(@PathVariable Long id_persona) {
        Persona personaElimi = personaRepository.findById(id_persona).orElseThrow(RuntimeException::new);
        personaRepository.delete(personaElimi);
    }

}


