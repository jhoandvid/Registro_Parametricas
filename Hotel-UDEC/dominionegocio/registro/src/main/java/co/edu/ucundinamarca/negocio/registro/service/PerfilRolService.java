package co.edu.ucundinamarca.negocio.registro.service;

import co.edu.ucundinamarca.negocio.registro.model.Perfil;
import co.edu.ucundinamarca.negocio.registro.model.PerfilRol;
import co.edu.ucundinamarca.negocio.registro.repository.PerfilRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class PerfilRolService implements IPerfilRolService {
    @Autowired
   private PerfilRolRepository perfilRolRepository;


    @Override
    public List<PerfilRol> findAll() {
        return perfilRolRepository.findAll();
    }

    @Override
    @Transactional
    public PerfilRol guardar(PerfilRol perfilRol) {
        return perfilRolRepository.save(perfilRol);
    }

    @Override
    public PerfilRol find(Long id_perfil_rol) {
        return perfilRolRepository.findById(id_perfil_rol).orElse(null);
    }
}
