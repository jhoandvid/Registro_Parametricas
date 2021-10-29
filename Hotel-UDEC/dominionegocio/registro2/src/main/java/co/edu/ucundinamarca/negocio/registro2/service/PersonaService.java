package co.edu.ucundinamarca.negocio.registro2.service;

import co.edu.ucundinamarca.negocio.registro2.Repository.PersonaRepository;
import co.edu.ucundinamarca.negocio.registro2.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }


}
