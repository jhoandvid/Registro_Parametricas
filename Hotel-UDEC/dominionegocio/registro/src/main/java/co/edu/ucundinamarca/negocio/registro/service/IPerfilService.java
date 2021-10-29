package co.edu.ucundinamarca.negocio.registro.service;

import co.edu.ucundinamarca.negocio.registro.model.Perfil;

import java.util.List;

public interface IPerfilService {

    public List<Perfil> findAll();
    public Perfil guardar(Perfil perfil);
    public Perfil find(Long id_perfil);
}
