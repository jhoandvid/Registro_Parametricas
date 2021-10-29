package co.edu.ucundinamarca.negocio.registro.rest;



import co.edu.ucundinamarca.negocio.registro.model.Persona;
import co.edu.ucundinamarca.negocio.registro.model.Usuario;
import co.edu.ucundinamarca.negocio.registro.repository.UsuarioRepository;
import co.edu.ucundinamarca.negocio.registro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/hotel/usuario")
public class UsuarioRest {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> getUsuario() {
        return ResponseEntity.ok().body(usuarioService.findAll());
    }

    @PostMapping ("/agregar")
    Usuario create(@RequestBody Usuario usuario){
        return usuarioService.guardar(usuario);
    }

    @DeleteMapping ("/eliminar/{id_usuario}")
    void delete(@PathVariable Long id_usuario) {
        Usuario usuarioElimi = usuarioRepository.findById(id_usuario).orElseThrow(RuntimeException::new);
        usuarioRepository.delete(usuarioElimi);
    }


}
