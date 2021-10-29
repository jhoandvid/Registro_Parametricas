package co.edu.ucundinamarca.negocio.registro.service;

import co.edu.ucundinamarca.negocio.registro.model.Perfil;
import co.edu.ucundinamarca.negocio.registro.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService implements IPerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

    @Override
    public Perfil guardar(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    @Override
    public Perfil find(Long id_perfil) {
        return perfilRepository.findById(id_perfil).orElse(null);
    }
}
