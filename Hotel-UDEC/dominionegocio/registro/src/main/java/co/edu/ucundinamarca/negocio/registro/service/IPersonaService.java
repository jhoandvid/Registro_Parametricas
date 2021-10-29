package co.edu.ucundinamarca.negocio.registro.service;

import co.edu.ucundinamarca.negocio.registro.model.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> findAll();
    public Persona guardar(Persona persona);
    public Persona find(Long id_persona);
}
