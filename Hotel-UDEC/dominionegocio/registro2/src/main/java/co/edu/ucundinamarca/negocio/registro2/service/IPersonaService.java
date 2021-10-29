package co.edu.ucundinamarca.negocio.registro2.service;

import co.edu.ucundinamarca.negocio.registro2.model.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> findAll();
    public Persona guardar(Persona persona);

}
