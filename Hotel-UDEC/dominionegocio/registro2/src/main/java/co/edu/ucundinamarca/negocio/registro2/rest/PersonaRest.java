package co.edu.ucundinamarca.negocio.registro2.rest;

import co.edu.ucundinamarca.negocio.registro2.model.Persona;
import co.edu.ucundinamarca.negocio.registro2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/hotel/registro")
public class PersonaRest {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> getPersona() {
        return ResponseEntity.ok().body(personaService.findAll());
    }

    @PostMapping("/agregar")
    Persona create(@RequestBody Persona persona){
        return personaService.guardar(persona);
    }
}
