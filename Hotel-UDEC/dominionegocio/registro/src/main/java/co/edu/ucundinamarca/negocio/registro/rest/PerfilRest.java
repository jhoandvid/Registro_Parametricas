package co.edu.ucundinamarca.negocio.registro.rest;
import co.edu.ucundinamarca.negocio.registro.model.Perfil;
import co.edu.ucundinamarca.negocio.registro.repository.PerfilRepository;
import co.edu.ucundinamarca.negocio.registro.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel/perfil")
public class PerfilRest {

    @Autowired
    private PerfilService perfilService;

    @Autowired
    private PerfilRepository perfilRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Perfil>> getPerfil() {
        return ResponseEntity.ok().body(perfilRepository.findAll());
    }

    @PostMapping("/agregar")
    Perfil create(@RequestBody Perfil perfil){
        return perfilService.guardar(perfil);
    }


   @DeleteMapping ("/eliminar/{id_perfil}")
    void delete(@PathVariable Long id_perfil) {
        Perfil perfilElimi = perfilRepository.findById(id_perfil).orElseThrow(RuntimeException::new);
        perfilRepository.delete(perfilElimi);
    }

}
