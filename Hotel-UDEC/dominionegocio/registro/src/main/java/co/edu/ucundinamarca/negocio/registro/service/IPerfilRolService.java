package co.edu.ucundinamarca.negocio.registro.service;

import co.edu.ucundinamarca.negocio.registro.model.Perfil;
import co.edu.ucundinamarca.negocio.registro.model.PerfilRol;
import co.edu.ucundinamarca.negocio.registro.repository.PerfilRolRepository;

import java.util.List;

public interface IPerfilRolService {
    public List<PerfilRol> findAll();
    public PerfilRol guardar(PerfilRol perfilRol);
    public PerfilRol find(Long id_perfil_rol);
}
