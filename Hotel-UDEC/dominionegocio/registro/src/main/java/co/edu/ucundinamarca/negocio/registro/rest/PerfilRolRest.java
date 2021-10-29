package co.edu.ucundinamarca.negocio.registro.rest;
import co.edu.ucundinamarca.negocio.registro.model.Perfil;
import co.edu.ucundinamarca.negocio.registro.model.PerfilRol;
import co.edu.ucundinamarca.negocio.registro.model.Rol;
import co.edu.ucundinamarca.negocio.registro.repository.PerfilRolRepository;
import co.edu.ucundinamarca.negocio.registro.service.PerfilRolService;
import co.edu.ucundinamarca.negocio.registro.service.PerfilService;
import co.edu.ucundinamarca.negocio.registro.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/hotel/perfilrol")
public class PerfilRolRest {

    @Autowired
    private PerfilRolService perfilRolService;

    @Autowired
    private PerfilRolRepository perfilRolRepository;
    @Autowired
    private PerfilService perfilService;

    @Autowired
    private RolService rolService;

    @GetMapping("/listar")
    public ResponseEntity<List<PerfilRol>> getPerfilRol() {
        return ResponseEntity.ok().body(perfilRolService.findAll());
    }

    @PostMapping("/agregar/{id_perfil}/{id_rol}")
    PerfilRol create(@PathVariable Long id_perfil, @PathVariable Long id_rol){

        Perfil perfil=perfilService.find(id_perfil);
        Rol rol=rolService.find(id_rol);
        PerfilRol perfilRol=new PerfilRol();
        perfilRol.setIdperfil(perfil);
        perfilRol.setIdrol(rol);

        return perfilRolService.guardar(perfilRol);
    }

    @DeleteMapping ("/eliminar/{id_perfil_rol}")
    void delete(@PathVariable Long id_perfil_rol) {
        PerfilRol perfilRolElimi = perfilRolRepository.findById(id_perfil_rol).orElseThrow(RuntimeException::new);
        perfilRolRepository.delete(perfilRolElimi);
    }


}
