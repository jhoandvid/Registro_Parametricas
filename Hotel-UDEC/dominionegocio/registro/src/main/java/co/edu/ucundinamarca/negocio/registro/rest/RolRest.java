package co.edu.ucundinamarca.negocio.registro.rest;

import co.edu.ucundinamarca.negocio.registro.model.Persona;
import co.edu.ucundinamarca.negocio.registro.model.Rol;
import co.edu.ucundinamarca.negocio.registro.repository.PersonaRepository;
import co.edu.ucundinamarca.negocio.registro.repository.RolRepository;
import co.edu.ucundinamarca.negocio.registro.service.PersonaService;
import co.edu.ucundinamarca.negocio.registro.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/hotel/rol")
public class RolRest {

    @Autowired
    private RolService rolService;

    @Autowired
    private RolRepository rolRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Rol>> getPersona() {
        return ResponseEntity.ok().body(rolService.findAll());
    }

    @PostMapping("/agregar")
    Rol create(@RequestBody Rol rol){
        return rolService.guardar(rol);
    }

    @DeleteMapping ("/eliminar/{id_rol}")
    void delete(@PathVariable Long id_rol) {
        Rol rolElimi = rolRepository.findById(id_rol).orElseThrow(RuntimeException::new);
        rolRepository.delete(rolElimi);
    }

}
