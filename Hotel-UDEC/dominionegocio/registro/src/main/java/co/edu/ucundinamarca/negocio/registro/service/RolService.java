package co.edu.ucundinamarca.negocio.registro.service;

import co.edu.ucundinamarca.negocio.registro.model.Persona;
import co.edu.ucundinamarca.negocio.registro.model.Rol;
import co.edu.ucundinamarca.negocio.registro.repository.PersonaRepository;
import co.edu.ucundinamarca.negocio.registro.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService implements IRolService{

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Rol guardar(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol find(Long id_rol) {
        return rolRepository.findById(id_rol).orElse(null);
    }


}
